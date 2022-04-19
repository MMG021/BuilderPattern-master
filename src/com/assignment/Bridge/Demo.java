package com.assignment.Bridge;

public class Demo {
    public static void main (String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }
    public static void testDevice(Device device)
    {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        device.printStatus();

        System.out.println("Tests with Advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        device.printStatus();
    }

}
