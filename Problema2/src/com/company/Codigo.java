//Diego Donovan Silva Sousa 2 ano 2 semestre
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Codigo {
    private Scanner key =new Scanner(System.in);
    private char[] caracteres={'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private String message;

    public void recive(){
        System.out.println("Digite a mensagem a codificar/descodificar: ");
        this.message=key.nextLine();
    }
    public String getmessage(){return this.message;}

    public String rodarTexto(String message){
        String Cod_message="";
        char[] messageComponents=message.toLowerCase().toCharArray();
        for(int c=0;c<messageComponents.length;c+=1){
            if(messageComponents[c]==' '){
                Cod_message+=" ";
                continue;
            }else{
                int novocaracter=findindex(messageComponents[c]);
                if(novocaracter<0){return "caracter invalido!";}
                int rotacoes=0;
                while(rotacoes<13){
                    if(novocaracter<(caracteres.length-1)){novocaracter+=1;}
                    else{novocaracter=0;}
                    rotacoes+=1;
                }
                Cod_message+=this.caracteres[novocaracter];
            }
        }
        System.out.println("Mensagem codificada/Descodificada: ");
        return Cod_message;
    }
    public int findindex(char elemento){
        for(int i=0;i<this.caracteres.length;i++){
            if(elemento==caracteres[i]){
                return i;
            }
        }
        return -1;
    }
}
