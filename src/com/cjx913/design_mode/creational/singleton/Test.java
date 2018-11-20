package com.cjx913.design_mode.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Singleton s1,s2;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		
		
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=true";
		String username = "root";
		String password = "cjx913";
		int count = 3;
		try {
			ConnectionPool.initialization(driver, url, username, password, count);
			ConnectionPool connectionPool1 = ConnectionPool.getInstance();
			System.out.println(connectionPool1.getConnections().size());
			ConnectionPool connectionPool2 = ConnectionPool.getInstance();
			System.out.println(connectionPool2.getConnections().size());
			System.out.println(connectionPool1==connectionPool2);
			
			Connection connection = connectionPool1.getConnection();
			System.out.println(connectionPool1.getConnections().size());
			
			Connection connection2 = connectionPool1.getConnection();
			Connection connection3 = connectionPool1.getConnection();
			System.out.println(connectionPool1.getConnections().size());
			
			Connection connection4 = connectionPool1.getConnection();
			System.out.println(connection4==null);
			System.out.println(connectionPool1.getConnections().size());
			
			Connection connection5 = connectionPool1.getConnection();
			
			connectionPool2.recoveryConnection(connection);
			connectionPool2.recoveryConnection(connection2);
			connectionPool2.recoveryConnection(connection3);
			connectionPool2.recoveryConnection(connection4);
			connectionPool2.recoveryConnection(connection5);
			System.out.println(connectionPool1.getConnections().size());
			
			System.out.println("*******************************");
			Iterator<Connection> iterator = connectionPool1.getConnections().iterator();
			while(iterator.hasNext()) {
				Connection connection6 = iterator.next();
				System.out.println(connection6==null);
				System.out.println(connection6.isClosed());
			}
					
			connectionPool1.closeConnections();
			System.out.println(connectionPool1.getConnections().size());
			
			connectionPool1.clearConnections();
			System.out.println(connectionPool1.getConnections().size());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("------------------------------------------------");
		try {
			ConnectionPool.initialization(driver, url, username, password, 5);
			ConnectionPool connectionPool = ConnectionPool.getInstance();
			
			ConnectionPool.initialization(driver, url, username, password, 6);
			ConnectionPool connectionPool1 = ConnectionPool.getInstance();
			
			System.out.println(connectionPool==connectionPool1);
			System.out.println(connectionPool.getConnections().size());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
