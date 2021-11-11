package challenges;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/problem
public class LoopsII {
    public static final int CONST_DEFINED_BY_HACKERRANK = 2;

    public void execute(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        Struct[] structs = new Struct[t];
        for(int i=0; i<t; i++){
            structs[i] = new Struct();
            structs[i].a = in.nextInt();
            structs[i].b = in.nextInt();
            structs[i].n = in.nextInt();;
        }
        in.close();
        for (Struct struct : structs) {
            int accumulated = struct.a;
            for (int y = 0; y < struct.n; y++) {
                accumulated += (int)Math.pow(CONST_DEFINED_BY_HACKERRANK,y)* struct.b;
                System.out.print(accumulated + " ");
            }
            System.out.println();
        }
    }
}

class Struct{
    int a;
    int b;
    int n;
}
