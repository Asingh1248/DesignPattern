package com.phone;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private int battery;

	// void replace PhoneBuilder at run time which parameter to set we can get to
	// know
	// ever setter returns object of PhoneBuilder
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, ram, processor, battery);
	}

}
