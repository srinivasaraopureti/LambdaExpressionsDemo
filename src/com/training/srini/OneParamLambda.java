package com.training.srini;

@FunctionalInterface
interface WelcomeOneParam{
    public void getMessage(String message);
}
public class OneParamLambda {
    public static void main(String[] args) {
        //Without Lambda Expression
        WelcomeOneParam welcome = new WelcomeOneParam(){
            @Override
            public void getMessage(String message) {
                System.out.println("Welcome to Lambda "+message+" !!");
            }
        };
        welcome.getMessage("With Out Lambda Expressions");
        WelcomeOneParam oneParam = (msg)->{System.out.println("Welcome to Lambda "+msg+" !!");};
        oneParam.getMessage("With One Param ");
    }
}
