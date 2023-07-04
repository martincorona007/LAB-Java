package org.example;

import java.util.*;

class OperationSum{

    List<Integer> numbers = new ArrayList<>();

    public OperationSum(int numbers) {
        this.numbers.add(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 50; // Minimum value of range
        int max = 100; // Maximum value of range
        Map<Integer,OperationSum> testingSet = new HashMap<>();
        int sumi = 0;
        for (int i = 0; i < 6; i++) {

            int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
            sumi+=randomNumber;
            // System.out.println("-S> "+sumi);
            testingSet.put(i,new OperationSum(randomNumber));
        }
        testingSet.entrySet().stream().parallel().forEach(e -> {
            System.out.print(" ["+e.getValue().numbers.stream().iterator().next()+"] ");

        });
        int myAnswer = scanner.nextInt();
        if(myAnswer == sumi){
            System.out.println("CORRECT!!");
        }else{
            System.out.println("ANSWER -> "+sumi);
        }    }
}