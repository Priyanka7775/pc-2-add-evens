package com.jap.addevens;

import java.util.Scanner;

public class AddEven
{
    //Write the logic to add evens in the methods
    public long addEvens(int n){
        int sum=0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
        System.out.println(sum);
      return sum;
    }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter any number");
            int n = scanner.nextInt();
            AddEven addEven = new AddEven();
            addEven.addEvens(n);

        }


}
