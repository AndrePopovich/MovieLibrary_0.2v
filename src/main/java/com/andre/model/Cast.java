package com.andre.model;

public class Cast {
  private String fullName;
  public Cast(String fullName){
    this.fullName = fullName;
  }


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  @Override
  public String toString(){
    return fullName;
  }
}
