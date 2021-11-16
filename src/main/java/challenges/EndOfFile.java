package challenges;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-end-of-file/problem?
public class EndOfFile {
    public void execute() {
        Scanner in = new Scanner(System.in);
        int count = 1;
        do {
            System.out.println(count + " " + in.nextLine());
            count++;
        } while (in.hasNextLine());
    }
}
