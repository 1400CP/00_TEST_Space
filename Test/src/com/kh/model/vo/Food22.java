package com.kh.model.vo;

import java.io.Serializable;

public class Food22 implements Serializable{

private String name;
private int kcal;

public Food22() {}


public Food22(String name, int kcal) {

this.name = name;

this.kcal = kcal;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public int getKcal() {

return kcal;

}

public void setKcal(int kcal) {

this.kcal = kcal;

}


@Override

public String toString() {

return name + "(" + kcal + "kcal)";

}

}