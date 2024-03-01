package com.training.srini;

import java.util.ArrayList;
import java.util.List;

public class LambdaArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Srini");
        arrayList.add("Radhi");
        arrayList.add("Sahithi");
        arrayList.add("Sathvik");
        arrayList.forEach((val)->System.out.println("Name "+val.toString().toUpperCase()));
    }
}
