package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru0008 { public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    List<String> a = new ArrayList<>();

    for(int i=0;i<s.length()-k+1;i++){
        a.add(s.substring(i,i+k));
    }
    Collections.sort(a);
    smallest = a.get(0);
    largest = a.get(a.size()-1);
    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0,k);
        String maxSubstring = line.substring(0,k);
        for (int i = 1; i < line.length()-k+1; i++) {
            String sub = line.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }

 */