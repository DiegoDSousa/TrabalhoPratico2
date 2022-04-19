//Diego Donovan Silva Sousa LEIT 2 ano 2 semestre
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pontos {
    private ArrayList<double[]> PointList=new ArrayList<double[]>();
    Scanner key=new Scanner(System.in);

    public void AddPoints(){
        System.out.println("Quantos pontos deseja adicionar");
        int number =key.nextInt();
        float xcordinate;
        float ycordinate;
        for(int i=0;i<number;i+=1){
            System.out.println("Para o ponto: "+(i+1));
            System.out.print("Cordenada X: ");
            xcordinate=key.nextFloat();
            System.out.print("Cordenada Y: ");
            ycordinate=key.nextFloat();
            double[] cordinates={xcordinate,ycordinate};
            PointList.add(cordinates);
        }

    }
    public void showPoints(){
        System.out.println("========================================");
        System.out.println("Pontos inceridos");
        System.out.println("========================================");
        for(int i=0;i<PointList.size();i+=1){
            System.out.print("Ponto "+(i+1)+", cordenadas(x:y): (");
            for(int c=0;c<PointList.get(i).length;c+=1){
                System.out.printf("%.2f",PointList.get(i)[c]);
                if(c==1){}else{System.out.printf(":");}

            }
            System.out.printf(")\n");
        }
    }
    public void searchPoints(int pointa,int pointb){
        if((pointa<0)||(pointa>this.PointList.size())||(pointb<0)||(pointb>this.PointList.size())){
            System.out.println("Error: Pontos invalidados!");
        }else{
        if(((pointa+1)==pointb)||((pointa-1)==pointb)||((pointb-1)==pointa)||((pointb+1)==pointa)){
            double distancia=distanciaDePontos(this.PointList.get(pointa)[0],this.PointList.get(pointa)[1],this.PointList.get(pointb)[0],this.PointList.get(pointb)[1]);
            System.out.printf("Distancia Pontos: %.2f"+distancia);
        }else{System.out.println("Os dois pontos nao sao consecutivos!");}}
    }

    private static double distanciaDePontos(double x1,double y1,double x2,double y2){
        double distancia;
        //alinhados eixo y
        if(y1==y2){distancia=Math.abs(y2-y1);}else
        //alinhados eixo x
        if(x1==x2){distancia=Math.abs(x2-x1);}else
        //totalmente desalinhados
        {distancia=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));}
        return distancia;
    }
}
