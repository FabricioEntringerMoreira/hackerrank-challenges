package challenges;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting/problem
public class OutputFormatting {
    public void execute(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-5s",s1) +String.format("%03d", x));
        }
        System.out.println("================================");
    }
}