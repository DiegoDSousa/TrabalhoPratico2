//Diego Donovan Silva Sousa LEIT 2 ano 2 semestre
package com.company;

import java.io.IOException;

import java.nio.file.*;
import java.util.ArrayList;

public class Quadrado {
    private ArrayList Matriz=new ArrayList();
    private String[] ListaNumeros;
    public void receber(){
        Path Caminho = Paths.get("/Users/diegosousa/IdeaProjects/TrabalhoPratico2/problema4/numeros.txt");
        String numeros = null;

        try {
            numeros=(String.valueOf(Files.readAllLines(Caminho)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(numeros);
        this.ListaNumeros=(numeros.replace("[","").replace("]","")).split(",");
        if((ListaNumeros.length>16)||(ListaNumeros.length<16)){
            System.out.println("nao e possivel montar a matriz 4*4:");
            this.ListaNumeros=null;
        }
    }
    private void iniciarMatriz(){
        this.Matriz.add("");
        this.Matriz.add("");
        this.Matriz.add("");
        this.Matriz.add("");
    }
    public void criarMatriz(){
        iniciarMatriz();
        ArrayList agrupamento=new ArrayList<>();
        agrupamento.add("a");
        agrupamento.add("b");
        agrupamento.add("c");
        agrupamento.add("d");
        int aAdicionar=0;
        for(int count1=0;count1<4;count1+=1){
           int count2;
            for(count2=0;count2<4;count2+=1){
                agrupamento.set(count2,this.ListaNumeros[aAdicionar]);
                aAdicionar+=1;
            }
            this.Matriz.set(count1,agrupamento.clone());
        }
        MatrizElements();
    }
    public void MatrizElements(){
        ArrayList s1,s2,s3,s4;
        s1= (ArrayList) this.Matriz.get(0);
        s2= (ArrayList) this.Matriz.get(1);
        s3= (ArrayList) this.Matriz.get(2);
        s4= (ArrayList) this.Matriz.get(3);
        System.out.println("=================matriz================");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        // somas de todas colunas
        int prim_col=Integer.parseInt((String) s1.get(0))+Integer.parseInt((String) s2.get(0))+
                Integer.parseInt((String) s3.get(0))+Integer.parseInt((String) s4.get(0));
        int sec_col=Integer.parseInt((String) s1.get(1))+Integer.parseInt((String) s2.get(1))+
                Integer.parseInt((String) s3.get(1))+Integer.parseInt((String) s4.get(1));
        int ter_col=Integer.parseInt((String) s1.get(2))+Integer.parseInt((String) s2.get(2))+
                Integer.parseInt((String) s3.get(2))+Integer.parseInt((String) s4.get(2));
        int qua_col=Integer.parseInt((String) s1.get(3))+Integer.parseInt((String) s2.get(3))+
                Integer.parseInt((String) s3.get(3))+Integer.parseInt((String) s4.get(3));
       //soma diagonais
        int diag_1=Integer.parseInt((String) s1.get(0))+Integer.parseInt((String) s2.get(1))+
                Integer.parseInt((String) s3.get(2))+Integer.parseInt((String) s4.get(3));
        int diag_2=Integer.parseInt((String) s1.get(3))+Integer.parseInt((String) s2.get(2))+
                Integer.parseInt((String) s3.get(1))+Integer.parseInt((String) s4.get(0));
        //soma linhas
        int prim_li=Integer.parseInt((String) s1.get(0))+Integer.parseInt((String) s1.get(1))+
                Integer.parseInt((String) s1.get(2))+Integer.parseInt((String) s1.get(3));
        int sec_li=Integer.parseInt((String) s2.get(0))+Integer.parseInt((String) s2.get(1))+
                Integer.parseInt((String) s2.get(2))+Integer.parseInt((String) s2.get(3));
        int ter_lin=Integer.parseInt((String) s3.get(0))+Integer.parseInt((String) s3.get(1))+
                Integer.parseInt((String) s3.get(2))+Integer.parseInt((String) s3.get(3));
        int qua_lin=Integer.parseInt((String) s4.get(0))+Integer.parseInt((String) s4.get(1))+
                Integer.parseInt((String) s4.get(2))+Integer.parseInt((String) s4.get(3));
        if((prim_col==sec_col)&&(sec_col==ter_col)&&(ter_col==qua_col)&&(qua_col==diag_1)&&
                (diag_1==diag_2)&&(diag_2==prim_li)&&(prim_li==sec_li)&&(sec_li==ter_lin)&&(ter_lin==qua_lin)){
            System.out.println("E possivel criar o quadrado magico, e a soma de cada coluna, linha e diagonal e:");
            System.out.println(prim_li);
        }


    }


}
