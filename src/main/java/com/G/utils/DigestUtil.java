package com.G.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//import sun.misc.BASE64Decoder;

public class DigestUtil {
	public static String String2MD5(String str) throws Exception {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes("utf-8"));
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

//	public static String String2GtcomDigest(String source) throws Exception {
//		String digestStr = String2Base64(source);
//		return digestStr;
//
//	}
//
//	public static String GtcomDigest2String(String digestStr) {
//		String source = Base642String(digestStr);
//		return source;
//	}
//
//	public static String String2Base64(String s) throws UnsupportedEncodingException {
//		if (s == null)
//			return null;
//		return (new BASE64Encoder()).encode(s.getBytes("UTF-8"));
//	}
//
//	// 把64bit编码转化成普通字符串
//	public static String Base642String(String s) {
//		if (s == null)
//			return null;
//		BASE64Decoder decoder = new BASE64Decoder();
//		try {
//			byte[] b = decoder.decodeBuffer(s);
//
//			return new String(b, "UTF-8");
//
//		} catch (Exception e) {
//			return null;
//		}
//	}
}
