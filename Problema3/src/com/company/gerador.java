//Diego Donovan Silva Sousa 2ano 2semestre
package com.company;

import java.util.Random;

public class gerador {
    Random Gerador=new Random();
    public int getValues(){
        return Gerador.nextInt(10000);
    }
}
