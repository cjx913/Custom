package com.cjx913.design_mode.structural.flyweight;

public class Client {

	public static void main(String[] args) throws Exception {
		MediaFactory factory = new MediaFactory();
		Media media1 = new Photo("白云山");
		Media media2 = new Video("广财");
		
		factory.addMedia(media1);
		factory.addMedia(media2);
		
		Media media3 = factory.getMedia("广财");
		Media media4 = factory.getMedia("白云山");
		System.out.println(media1==media4);
		System.out.println(media2==media3);
		MediaState state1 = new MediaState(3, 52, 222, 213);
		MediaState state2 = new MediaState(323, 11, 323, 5324);
		media1.display(state1);
		media4.display(state2);
		System.out.println(media1==media4);
			
		

	}

}
