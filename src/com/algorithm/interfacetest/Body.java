package com.algorithm.interfacetest;

public class Body {

    public static void main(String[]args){
        Action action = new Action();

        action.setTalk("Umar Auna");
        action.setEat("eating food");
        action.setWalk("Walking");
        action.setDancing("Dancing");

        action.talk();
        action.eat();
        action.walk();
        action.dancing();
    }
}
