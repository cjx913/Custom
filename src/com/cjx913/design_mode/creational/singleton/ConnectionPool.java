package com.cjx913.design_mode.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {
	private static Set<Connection> CONNECTIONS = Collections.synchronizedSet(new HashSet());
	private static String DRIVER;
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	private static Integer COUNT;

	private ConnectionPool() {

	}

	/**
	 * ��ʼ�����ݿ����ӳ�
	 * @param driver ��������ȫ�޶���
	 * @param url ���ݿ����ӵ�ַ
	 * @param username ���ݿ��û���
	 * @param password ���ݿ�����
	 * @param count ���ӳ���Connection������
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void initialization(String driver, String url, String username, String password, Integer count)
			throws ClassNotFoundException, SQLException {
		DRIVER = driver;
		URL = url;
		USERNAME = username;
		PASSWORD = password;
		COUNT = count;
		/*��������ӳ�*/
		clearConnections();
		Connection connection = null;
		Class.forName(driver);
		for (int i = 0; i < count; i++) {
			connection = DriverManager.getConnection(url, username, password);
			CONNECTIONS.add(connection);
		}
	}

	/**
	 * 
	 * @return ��ʼ��֮���ȡ���ӳ�ʵ��(����ģʽ)
	 */
	public static ConnectionPool getInstance() {
		return HolderClass.instance;
	}

	

	/**
	 * 
	 * @return �����ӳ��л�ȡConnection
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public synchronized Connection getConnection() throws SQLException, ClassNotFoundException {
		Iterator<Connection> iterator = CONNECTIONS.iterator();
		Connection connection = null;
		if (iterator.hasNext()) {
			connection = iterator.next();
			CONNECTIONS.remove(connection);
			return connection;
		}
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return connection;
	}

	/**
	 * ����Connection�����ӳ�
	 * @param connection
	 */
	public void recoveryConnection(Connection connection) {
		if (connection == null) {
		} else {
			if (CONNECTIONS.size() >=COUNT) {
				closeConnection(connection);
			}else {
				CONNECTIONS.add(connection);
			}
		}
	}
	
	/**
	 * �ر�Connection
	 * @param connection
	 */
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return ���ӳ���Connection�ļ���
	 */
	public Set<Connection> getConnections() {
		return CONNECTIONS;
	}
	
	/**
	 * �ر����ӳ������е�Connection
	 */
	public static void closeConnections() {
		Iterator<Connection> iterator = CONNECTIONS.iterator();
		while(iterator.hasNext()) {
			closeConnection(iterator.next());
		}
	}
	
	/**
	 * �ر����ӳ������е�Connection������CONNECTIONS
	 */
	public static void clearConnections() {
		closeConnections();
		CONNECTIONS.clear();
	}

	private static class HolderClass {
		private static ConnectionPool instance = new ConnectionPool();
	}
}
