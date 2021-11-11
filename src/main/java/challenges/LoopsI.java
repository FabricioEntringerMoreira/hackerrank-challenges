package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/java-loops-i/problem
public class LoopsI {
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++)
            System.out.printf("%s x %s = %s%n", N, i, N*i);
        bufferedReader.close();
    }
}
