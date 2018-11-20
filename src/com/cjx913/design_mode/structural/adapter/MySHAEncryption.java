package com.cjx913.design_mode.structural.adapter;


import com.cjx913.design_mode.structural.adapter.disanfang.SHAEncryption;

public class MySHAEncryption implements Encryption {
	@Override
	public String encipher(String str) {
		return SHAEncryption.SHA256(str);
	}
}
