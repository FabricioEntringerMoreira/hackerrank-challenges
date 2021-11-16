package challenges;

import java.math.BigInteger;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-datatypes/problem
public class JavaDataTypes {
    public void execute(){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            try{
                long valueRead = sc.nextLong();
                BigInteger value = BigInteger.valueOf(valueRead);
                System.out.println(value + " can be fitted in:");
                int bitLenght = value.bitLength()/8;
                if (bitLenght <= 0){
                    System.out.println("* byte");
                }
                if (bitLenght <= 1){
                    System.out.println("* short");
                }
                if (bitLenght <= 3){
                    System.out.println("* int");
                }
                if (bitLenght <= 7){
                    System.out.println("* long");
                }
            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
