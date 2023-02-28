package com.coderetreat;

public class CaseOne {
    public static void main(String[] args) {
        Lights lights = new LightsWithoutControl();

        lights.lightsOn(887, 9, 959, 629);
        lights.lightsOn(454, 398, 844, 448);

        lights.lightsOff(539, 243, 559, 965);
        lights.lightsOff(370, 819, 676, 868);
        lights.lightsOff(145, 40, 370, 997);
        lights.lightsOff(301, 3, 808, 453);

        lights.lightsOn(351, 678, 951, 908);

        lights.toggleLights(720, 196, 897, 994);
        lights.toggleLights(831, 394, 904, 860);

        System.out.println("Lights on: "+lights.countLights());
    }
}
