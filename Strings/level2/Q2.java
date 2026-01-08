package Strings.level2;

import java.util.Scanner;

public class Q2 {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 1;
        spaceIndex[0] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                spaceIndex[idx++] = i;
        }
        spaceIndex[idx] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(spaceIndex[i] + 1, spaceIndex[i + 1]);
        }

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result : " + compareArrays(custom, builtIn));
    }
}
