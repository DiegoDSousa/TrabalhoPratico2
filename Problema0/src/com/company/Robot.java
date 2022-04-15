package com.company;

public class Robot {
    private String positions[]={"N","L","S","O"};
    private int position;
     Ponto2D robodCordinates=new Ponto2D();

    public Robot(char initial_position){
        if((initial_position=='n')||(initial_position=='N')){this.position=0;}
        else if((initial_position=='l')||(initial_position=='L')){this.position=1;}
        else if((initial_position=='s')||(initial_position=='S')){this.position=2;}
        else if((initial_position=='o')||(initial_position=='O')){this.position=3;}
    }
    public void turnLeft(){
        if (this.position==0){this.position=3;}else{this.position-=1;}
        System.out.println("Position changed to: "+this.positions[this.position]);
    }
    public void turnRight(){
        if (this.position==3){this.position=0;}else{this.position+=1;}
        System.out.println("Position changed to: "+this.positions[this.position]);
    }
    public String getDirection(){
        return this.positions[this.position];
    }
    public void move(){
        robodCordinates.updateCordinates(this.position);
    }
    public Ponto2D getLocation(){
        return robodCordinates;
    }
    public void showLocation(Ponto2D location){
        System.out.println("Robot cordinates: ");
        location.showCordinates();
    }



}
