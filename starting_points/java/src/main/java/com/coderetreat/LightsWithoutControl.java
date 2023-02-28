package com.coderetreat;

public class LightsWithoutControl implements Lights {
    private boolean lights[][];

    public LightsWithoutControl() {
        lights = new boolean[1000][1000];
    }

    @Override
    public void lightsOn(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
                lights[i][j] = true;
            }
        }
    }

    @Override
    public void lightsOff(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
                lights[i][j] = false;
            }
        }
    }

    @Override
    public void toggleLights(int startRow, int startCol, int endRow, int endCol) {
        for(int i=startRow; i<=endRow; i++) {
            for(int j=startCol; j<=endCol; j++) {
              lights[i][j] = !lights[i][j];
            }
        }
    }

    @Override
    public int countLights() {
        int count = 0;

        for(int i=0; i<lights.length; i++) {
            for(int j=0; j<lights.length; j++) {
                if(lights[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
