package com.company;

public class Cannonball {
    private int posicaoX, posicaoy;
    private int velocidadex, velocidadey;
    private float gravidade=-9.81f;


    public Cannonball(int x){
        this.posicaoX=x;
        this.posicaoy=0;
    }
    public void move(double deltaSec){this.posicaoX+=5;}
    public int verPosicaoX(){return posicaoX;}
}
