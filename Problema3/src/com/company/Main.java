//Diego Donovan Silva Sousa 2ano 2semestre
package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;

public class Main {

    public static void main(String[] args) throws IOException {
        File file=new File("/Users/diegosousa/IdeaProjects/TrabalhoPratico2/Problema3/elementos");
        try{
            boolean existe=file.exists();
            if(!existe)
                file.createNewFile();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        BufferedWriter escreve=new BufferedWriter(new FileWriter(file));
        numeros listaNumeros=new numeros();
        escreve.write(listaNumeros.Index_par().toString()+"\n");
        escreve.write(listaNumeros.ElementosPares().toString()+"\n");
        escreve.write(listaNumeros.Ordeminversa().toString()+"\n");
        escreve.write(listaNumeros.F_and_L().toString()+"\n");
        escreve.close();
    }
}
