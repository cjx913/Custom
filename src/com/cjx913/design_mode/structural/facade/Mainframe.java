package com.cjx913.design_mode.structural.facade;

public class Mainframe {
	private CPU cpu = new CPU();
	private Memory memory = new Memory();
	private HardDisk hardDisk = new HardDisk();
	private OS os = new OS();
	public void on() {
		memory.check();
		cpu.run();
		hardDisk.read();
		os.load();
	}
}
