package Strings.level2;

import java.util.Scanner;

public class Q4 {

    public static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int count = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                count++;

        String[] words = new String[count];
        int start = 0, idx = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static int[] shortestLongest(String[] words) {
        int min = findLength(words[0]);
        int max = findLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int[] result = shortestLongest(words);

        System.out.println("Shortest Length : " + result[0]);
        System.out.println("Longest Length : " + result[1]);
    }
}
