package IfElseCondition;

public class Example4 {

	    public static void main(String[] args) {

	        int a = 25;
	        int b = 40;
	        int c = 30;

	        if (a > b && a > c) {
	            System.out.println("a is the largest: " + a);
	        } 
	        else if (b > a && b > c) {
	            System.out.println("b is the largest: " + b);
	        } 
	        else {
	            System.out.println("c is the largest: " + c);
	        }
	    }
	}

