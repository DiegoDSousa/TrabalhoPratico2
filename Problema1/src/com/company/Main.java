package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hehe");
        Pontos pontos1=new Pontos();
        pontos1.AddPoints();
        pontos1.showPoints();
        pontos1.searchPoints(0,9);
        pontos1.searchPoints(-2,20);
        pontos1.searchPoints(9,10);
        pontos1.searchPoints(6,7);
        pontos1.searchPoints(2,3);
        System.out.println("aleluia");
    }
}
