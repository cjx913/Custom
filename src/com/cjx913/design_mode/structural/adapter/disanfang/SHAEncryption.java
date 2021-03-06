package com.cjx913.design_mode.structural.adapter.disanfang;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAEncryption {
    /**
     * byte数组转化为16进制字符串输出
     *
     * @param bytes
     * @return
     */
    private static String convertByteToHextString(byte[] bytes) {
        String result = "";
        for (int i = 0; i < bytes.length; i++) {
            int temp = bytes[i] & 0xff;
            String tempHex = Integer.toHexString(temp);
            if (tempHex.length() < 2) {
                result += "0" + tempHex;
            } else {
                result += tempHex;
            }
        }
        return result;
    }

    /**
     * SHA256加密，返回加密后16进制字符串
     *
     * @param message
     * @return
     */
    public static String SHA256(String message) {
        if (message != null) {
            try {
                MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");
                byte[] sha256Encode = sha256Digest.digest(message.getBytes());
                return convertByteToHextString(sha256Encode);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
