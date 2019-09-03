package org.opentutorials.iot;

import java.awt.Color;

public class ColorDimmingLights extends DimmingLights {

	double _bright = 0;
	Color _color;
	
	public ColorDimmingLights(String id) {
		super(id);
		this._color = Color.white;
	}
	
	public void setColor(Color color) {
		this._color = color;
		System.out.println(this._id + " → ColorDimmingLights color : "+color);
	}

}
