package Composition;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;
	
	
	public Lamp (String s, boolean b, int g) {
		this.style = s;
		this.battery = b;
		this.globRating = g;
	}
	
	public void turnOn() {
		System.out.println("Lamp -> Turning on");
	}
	
	public String getStyle() {
		return style;
	}
	
	public boolean isBattery() {
		return battery;
	}
	
	public int getGlobRating() {
		return globRating;
	}

}
