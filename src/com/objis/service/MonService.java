package com.objis.service;

public class MonService {

	public String hello(String msg){
		String s = "Hello Objis " + msg;
		System.out.println(s);
		return s;
	}

    public String bonjour(String message) {
        String s = "Bonjour " + message;
        System.out.println(s);
        return s;
    }
}
