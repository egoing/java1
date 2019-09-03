package org.opentutorials.iot;

public class Aircon implements OnOff{
	String _id;
	double _desiredTemperature = 26.0;

	public Aircon(String id) {
		this._id = id;
	}

	public boolean on() {
		System.out.println(this._id + " → Aircon on : " + this._desiredTemperature);
		return true;
	}

	public Boolean on(double desiredTemperature) {
		this._desiredTemperature = desiredTemperature;
		this.on();
		return true;
	}

	public boolean off() {
		System.out.println("Aircon off");
		return true;
	}
}