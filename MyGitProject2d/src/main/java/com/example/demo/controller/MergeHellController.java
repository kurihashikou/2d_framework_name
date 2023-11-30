package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiB();

	}

		static void kadaiB() {
			Random rnd = new Random();
					int x = rnd.nextInt(100);
					x = x + 1;
					System.out.println(x + "が出ました");

		}
}