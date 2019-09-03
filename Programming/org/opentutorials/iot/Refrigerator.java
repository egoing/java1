package org.opentutorials.iot;

import java.util.Random;

public class Refrigerator implements OnOff {
	String _id;
	public Refrigerator(String id) {
		this._id = id;
	}
	public int getItemNumber(String name) {
		Random rand = new Random();
		int number = rand.nextInt(5);
		return number;
	}
	public boolean on() {
		System.out.println(this._id + " → Refrigerator on");
		return true;
	}
	public boolean off() {
		System.out.println(this._id + " → Refrigerator off");
		return true;
	}
}
