package com.coderetreat;

public class CaseTwo {
    public static void main(String[] args) {
        Lights lights = new LightsWithControl();

        lights.lightsOn(0, 0, 0, 0);
        System.out.println("Total brightness: "+lights.countLights());

        lights.toggleLights(0, 0, 999, 999);
        System.out.println("Total brightness after all the lights are toggled: "+lights.countLights());
    }
}
