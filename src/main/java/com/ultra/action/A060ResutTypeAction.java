package com.ultra.action;

public class A060ResutTypeAction {

	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public String execute() {
		if (age % 5 == 0) {
			System.out.println("dispatcher to jsp...");
			return "dispatcher";
		} else if (age % 5 == 1) {
			System.out.println("redirect to jsp...");
			return "redirect";
		} else if (age % 5 == 2) {
			System.out.println("chain to action...");
			return "chain";
		} else if (age % 5 == 3) {
			System.out.println("redirectAction to action...");
			return "redirectAction";
		} else {
			System.out.println("redirectActionByRedirect to action...");
			return "redirectActionByRedirect";
		}
	}
}
