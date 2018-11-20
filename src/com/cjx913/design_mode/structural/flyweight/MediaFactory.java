package com.cjx913.design_mode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MediaFactory {
	private Map<String, Media> mediaMap = new HashMap<>();
	
	public Media getMedia(String name) throws Exception {
		if(mediaMap.containsKey(name)) {
			return mediaMap.get(name);
		}else {
			throw new Exception("不存在该文件名的媒体文件");
		}
	}
	
	public void addMedia(Media media) {
		if(!mediaMap.containsKey(media)) {
			mediaMap.put(media.getName(), media);
		}
	}
}
