package com.tricon.poc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of input ");
//        int n= sc.nextInt();
//        String[] inputs= new String[n];
//        for(int i=0;i<n;i++){
//            inputs[i]=sc.nextLine();
//        }
//        for(String input:inputs){
//            try{
//                int result=StringCalc.add(input);
//                System.out.println(input + "="+result);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//        String a = s.nextLine();
        Scanner s = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();
        String line;
        while (!(line = s.nextLine()).isEmpty()) {
            inputBuilder.append(line).append("\n");
        }
        String num = inputBuilder.toString().trim();
        try {
            System.out.print(StringCalc.add(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
