//Diego Donovan Silva Sousa LEIT 2 ano 2 semestre
package com.company;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
	// declaracao das variaveis
        Path Compras_path= Paths.get("/Users/diegosousa/IdeaProjects/Problema5/src/com/company/compras.txt");
        Path Clientes_path= Paths.get("/Users/diegosousa/IdeaProjects/Problema5/src/com/company/cliente.txt");

        try {
            ArrayList <Double> Valor_compra= new ArrayList<>();
            String[] lista_valores=(String.valueOf(Files.readAllLines(Compras_path)).replace("[","").replace("]","")).split(",");

            for(int c=0;c<lista_valores.length;c+=1){
                Valor_compra.add(Double.valueOf(lista_valores[c]));
            }
            System.out.println(Valor_compra);
            //criando e inicializando os nomes dos clientes
            ArrayList<String> nomeClientes= new ArrayList<>();
            String[] Lista_clientes=(String.valueOf(Files.readAllLines(Clientes_path)).replace("[","").replace("]","")).split(",");
            for(int c=0;c<Lista_clientes.length;c+=1){
                nomeClientes.add(Lista_clientes[c]);
            }
            System.out.println(nomeClientes);
            System.out.println("O nome do melhor cliente:"+nomeOfBestCustumer(Valor_compra,nomeClientes));

        }catch (Exception erro){
            System.out.println("erro na leitura dos ficheiros");
        }


    }
    static String nomeOfBestCustumer(ArrayList<Double> Sales,ArrayList<String> customer){
        double maxSale=0;
        int maxindex=0;
        for(int counter2=0;counter2<Sales.size();counter2++){
            if(maxSale<Sales.get(counter2)){
                maxSale=Sales.get(counter2);
                maxindex=counter2;
            }


        }

        return customer.get(maxindex);}

}
