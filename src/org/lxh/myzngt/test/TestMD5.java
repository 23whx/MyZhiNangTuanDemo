package org.lxh.myzngt.test;

import org.lxh.myzngt.util.MD5Code;

public class TestMD5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MD5Code md5 = new MD5Code() ;
		String str = "lixinghuamldnmldnlmldnmldnmldnmldmlndmldnmldnmldnmldnmldnlmds" ;
		System.out.println(md5.getMD5ofStr(str).length());
	}

}
