//Diego Donovan Silva Sousa 2 ano 2 semestre
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Codigo mensagem=new Codigo();
        mensagem.recive();
        System.out.println(mensagem.rodarTexto(mensagem.getmessage()));
    }
}
