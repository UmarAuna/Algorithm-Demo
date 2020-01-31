package com.algorithm.interfacetest;

import com.algorithm.Print;

public class Action implements Human {
    String talk;
    String eat;
    String walk;
    String dancing;

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public void setDancing(String dancing) {
        this.dancing = dancing;
    }

    @Override
    public void talk() {
        new Print().show("I am " + talk);
    }

    @Override
    public void eat() {
        new Print().show("I am "+ eat);
    }

    @Override
    public void walk() {
        new Print().show("I am "+ walk);
    }

    public void dancing(){
        new Print().show("I am "+ dancing);
    }
}
