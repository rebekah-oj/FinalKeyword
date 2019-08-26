package com.company;

public class Final {
    public static void main(String [] args){
        Final2 finalObject = new Final2(20);

        for (int i=0; i<5; i++){
        finalObject.add();
        System.out.printf("%s", finalObject);
        }

    }
}
