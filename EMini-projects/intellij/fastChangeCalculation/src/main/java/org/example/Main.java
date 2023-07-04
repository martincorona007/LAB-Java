package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
class Operation{

    int priceNumber = 0;
    int payNumber = 0;
    int answerNumber = 0;

    public Operation(int priceNumber, int payNumber, int answerNumber) {
        this.priceNumber = priceNumber;
        this.payNumber = payNumber;
        this.answerNumber = answerNumber;
    }

    public int getPriceNumber() {
        return priceNumber;
    }

    public void setPriceNumber(int priceNumber) {
        this.priceNumber = priceNumber;
    }

    public int getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(int payNumber) {
        this.payNumber = payNumber;
    }

    public int getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 50; // Minimum value of range
        int max = 100; // Maximum value of range
        Map<Integer,Operation> testing = new HashMap<>();

        for(int i = 0; i < 5; i++){
            int price = (int)Math.floor(Math.random() * (max - min + 1) + min);
            int pay = (int)Math.floor(Math.random() * (max - price + 1) + price);
            //
            testing.put(i,new Operation(price,pay,pay-price));
        }

        for(Map.Entry<Integer,Operation> testing1 : testing.entrySet()){
            System.out.println("Price $"+testing1.getValue().getPriceNumber()+" Pay $"+testing1.getValue().payNumber);
           int myAnswer = scanner.nextInt();
            if(myAnswer == testing1.getValue().answerNumber){
                System.out.println("CORRECT!!");
            }else{
                System.out.println("ANSWER -> "+testing1.getValue().answerNumber);
            }
        }

//        Sub
//        Price $150 Pay $200 Change ?
//                Price $450 Pay $900 Change ?
//
//        Sum
//

    }
}