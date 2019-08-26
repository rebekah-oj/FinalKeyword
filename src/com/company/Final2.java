package com.company;

public class Final2 {

        private int sum;
        private int NUMBER;

        public Final2(int x){
            NUMBER=x;
        }

        public void add(){
            sum+=NUMBER;
        }
        public String toString(){
            return String.format("sum %d\n" , sum);
        }
    }


