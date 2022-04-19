//Diego Donovan Silva Sousa 2 ano 2 semestre LEIT
package com.company;

public class Cannonball {
    private int posicaoX, posicaoy;
    private double velocidadex, velocidadey;
    private float gravidade=-9.81f;


    public Cannonball(int x){
        this.posicaoX=x;
        this.posicaoy=0;
    }
    public void move(double deltaSec){
        this.posicaoy= (int) (this.velocidadey*deltaSec-gravidade*(deltaSec*deltaSec)/2);
        this.posicaoX= (int) (velocidadex*deltaSec);
        this.velocidadey=calculovy(velocidadey,10)-gravidade*deltaSec;
    }
    public int verPosicaoX(){return posicaoX;}
    public void calculovx(double velocidade,double angulo){
        this.velocidadex=velocidade*Math.cos(angulo);
    }
    public double calculovy(double velocidade,double angulo){
        double velo_y=velocidade*Math.sin(angulo);
        return velo_y;
    }
    public void PointgetLocation(){}



}
