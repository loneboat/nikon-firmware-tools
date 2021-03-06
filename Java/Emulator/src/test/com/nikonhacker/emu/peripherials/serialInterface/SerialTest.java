package com.nikonhacker.emu.peripherials.serialInterface;

public class SerialTest {
    public static void main(String[] args) {
        System.out.println("Starting...");
        TimerDevice d1 = new TimerDevice("Device1", 2000);
        TimerDevice d2 = new TimerDevice("Device2", 2200);
        BidirectionalConsoleLoggerSerialCable cable = new BidirectionalConsoleLoggerSerialCable(d1, d2);
        cable.connect();
        System.out.println("Sleeping...");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
        }
        System.out.println("Done...");
    }
}
