package com.forum.util;

import java.math.BigInteger;
import java.util.Random;

//ID������
public class IdGenerator {
	public static String genPK(){
//		return UUID.randomUUID().toString();//������������һ��Ψһ���ַ���
		return new BigInteger(165, new Random()).toString(36).toUpperCase();
	}
}
