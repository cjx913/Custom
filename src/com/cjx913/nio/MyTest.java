package com.cjx913.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

import org.junit.Test;

public class MyTest {

	@Test
	public void test1() {
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		byteBuffer.put("Hello".getBytes());

		System.out.println(byteBuffer.position() + ":" + byteBuffer.limit());

		byteBuffer.flip();
		System.out.println(byteBuffer.position() + ":" + byteBuffer.limit());

		byte[] dst = new byte[byteBuffer.limit()];
		byteBuffer.get(dst);
		System.out.println(new String(dst));

	}

	@Test
	public void test2() {
		FileChannel channel = null;
		try {
			channel = FileChannel.open(Paths.get("source", "1.txt"), StandardOpenOption.READ);
			ByteBuffer dst = ByteBuffer.allocate(1024);
			channel.read(dst);
			byte[] b = new byte[dst.limit()];
			dst.flip();
			dst.get(b, 0, dst.limit());

			System.out.println(new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (channel != null) {
				try {
					channel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test3() {
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			inChannel = FileChannel.open(Paths.get("source", "1.jpg"), StandardOpenOption.READ);
			outChannel = FileChannel.open(Paths.get("source", "2.jpg"), StandardOpenOption.WRITE,
					StandardOpenOption.CREATE);

			ByteBuffer buffer = ByteBuffer.allocate(1024);
			byte[] bs = new byte[buffer.capacity()];

//			inChannel.transferTo(0, inChannel.size(), outChannel);
			outChannel.transferFrom(inChannel, 0, inChannel.size());

//			int len;
//			while((len=inChannel.read(buffer))!=-1) {
//				buffer.flip();
//				outChannel.write(buffer);
//				buffer.clear();
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inChannel.close();
				outChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void test4() {
		FileChannel inChannel1 = null;
		FileChannel inChannel2 = null;
		FileChannel outChannel = null;

		try {
			inChannel1 = FileChannel.open(Paths.get("source", "1.txt"), StandardOpenOption.READ);
			inChannel2 = FileChannel.open(Paths.get("source", "2.txt"), StandardOpenOption.READ);
			outChannel = FileChannel.open(Paths.get("source", "3.txt"), StandardOpenOption.WRITE,
					StandardOpenOption.CREATE);

			ByteBuffer buffer1 = ByteBuffer.allocate((int) inChannel1.size());
			ByteBuffer buffer2 = ByteBuffer.allocate((int) inChannel2.size());
			ByteBuffer buffer3 = ByteBuffer.allocate(8);
			
			inChannel1.read(buffer1);
			inChannel2.read(buffer2);
			buffer3.put("\n".getBytes());

			buffer1.flip();
			buffer2.flip();
			buffer3.flip();
			ByteBuffer[] buffers = { buffer1, buffer3,buffer2 };
			outChannel.write(buffers);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inChannel1.close();
				inChannel2.close();
				outChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void client() {
		SocketChannel channel =null;
		FileChannel fileChannel = null;
		try {
			channel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8089));
			channel.configureBlocking(false);
			
			fileChannel = FileChannel.open(Paths.get("source", "3.txt"), StandardOpenOption.READ);
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			while(fileChannel.read(buffer)!=-1) {
				buffer.flip();
				channel.write(buffer);
				buffer.clear();
			}
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				channel.close();
				fileChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void server() {
		ServerSocketChannel channel = null;
		
		
		try {
			channel = ServerSocketChannel.open();
			channel.configureBlocking(false);
			channel.bind(new InetSocketAddress(8089));
			
			Selector selector = Selector.open();
			channel.register(selector, SelectionKey.OP_ACCEPT);
			
			while(selector.select()>0) {
				Iterator<SelectionKey> iterator =selector.selectedKeys().iterator();
				while(iterator.hasNext()) {
					SelectionKey selectionKey = iterator.next();
					
					if(selectionKey.isAcceptable()) {
						SocketChannel clientChannel = channel.accept();
						clientChannel.configureBlocking(false);
						clientChannel.register(selector, SelectionKey.OP_READ);
					}else if(selectionKey.isReadable()) {
						SocketChannel clientChannel = (SocketChannel) selectionKey.channel();
						ByteBuffer buffer = ByteBuffer.allocate(1024);
						int len = 0;
	                    while((len = clientChannel.read(buffer)) > 0 ){
	                    	buffer.flip();
	                        System.out.println(new String(buffer.array(), 0, len));
	                        buffer.clear();
	                    }
					}
				}
				iterator.remove();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				channel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
