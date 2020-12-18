package com.lti.model;

public class Calc {
	public void add(int num1,int num2){
		System.out.println("Sum="+num1+num2);
	}
	public void subs(int num1,int num2){
		System.out.println("Difference="+(num1-num2));
	}
	public void print(String msg){
		System.out.println(msg);
	}
	public void prod(int a,int b){
		System.out.println("product="+a*b);
	}
}
