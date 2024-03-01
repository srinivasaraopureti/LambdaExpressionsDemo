package com.training.srini;

@FunctionalInterface
interface Welcome{
    public void getMessage();
}
public class NoParamLambda {
    public static void main(String[] args) {
        //Without Lambda Expression
        Welcome welcome = new Welcome(){
            @Override
            public void getMessage() {
                System.out.println("Welcome to Lambda without Expressions!!");
            }
        };
        welcome.getMessage();
        Welcome welcome1 = ()-> System.out.println("Welcome to Lambda Expressions!!");
        welcome1.getMessage();

    }
}
