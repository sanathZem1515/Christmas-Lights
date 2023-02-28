package com.coderetreat;

public class LightsWithControl implements Lights {
    int lights[][];

    public LightsWithControl() {
        lights = new int[1000][1000];
    }

    @Override
    public void lightsOn(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
                lights[i][j] += 1;
            }
        }
    }

    @Override
    public void lightsOff(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
                if(lights[i][j] > 0) {
                    lights[i][j] -= 1;
                }
            }
        }
    }

    @Override
    public void toggleLights(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
                lights[i][j] += 2;
            }
        }
    }

    @Override
    public int countLights() {
        int count = 0;

        for(int i=0; i<lights.length; i++) {
            for(int j=0; j<lights.length; j++) {
                count += lights[i][j];
            }
        }

        return count;
    }
}
