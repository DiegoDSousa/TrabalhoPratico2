package com.company;

import java.util.ArrayList;

public class numeros {
    private int[] lista=new int[10];
    gerador Gerador=new gerador();

    public numeros(){
        for(int counter =0;counter<10;counter+=1){
            this.lista[counter]= Gerador.getValues();
        }
    }

    public ArrayList Index_par(){
        int counter=0;
        ArrayList indexesPares = new ArrayList();
        while(counter<(this.lista.length)-1){
            if((counter%2)==0){indexesPares.add(this.lista[counter]);}
            counter+=1;
        }
        return indexesPares;
    }
    public ArrayList ElementosPares(){
        int counter=0;
        ArrayList ElementosPares = new ArrayList();
        while(counter<(this.lista.length)-1){
            if((this.lista[counter])%2==0){ElementosPares.add(this.lista[counter]);}
            counter+=1;
        }
        return ElementosPares;
    }
    public ArrayList Ordeminversa(){
        int counter=(this.lista.length-1);
        ArrayList ordemInversa = new ArrayList();
        while(counter>=0){
            ordemInversa.add(this.lista[counter]);
            counter-=1;
        }
        return ordemInversa;
    }
    public ArrayList F_and_L(){
        ArrayList Prm_Ult = new ArrayList();
        Prm_Ult.add(this.lista[0]);
        Prm_Ult.add(this.lista[this.lista.length-1]);

        return Prm_Ult;
    }



}
