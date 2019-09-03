package org.opentutorials.iot;

import java.util.Random;

public class Security implements OnOff{
	String _id;
	public Security(String id) {
		this._id = id;
	}
	public boolean on() {
		System.out.println(this._id+" → Security on");
		return true;
	}
	public boolean off() {
		System.out.println(this._id+" → Security off");
		return true;
	}
	public int getExistPeopleNumber() {
		Random rand = new Random();
		System.out.println(this._id+"\tSecurity exist people number : "+rand);
		return rand.nextInt(4);
	}
}
