package com.company;

public class Ponto2D {
    private int[] cordinates={0,0,0,0};
    public void updateCordinates(int direction){
        this.cordinates[direction]+=1;
    }
    public void showCordinates(){
        System.out.println("N L S O");
        for(int i=0;i<cordinates.length;i+=1){
            System.out.printf(String.valueOf(this.cordinates[i])+" ");
        }
        System.out.println("");
    }
}
