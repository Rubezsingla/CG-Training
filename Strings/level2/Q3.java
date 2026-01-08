package Strings.level2;

import java.util.Scanner;

public class Q3{

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

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                words++;

        String[] result = new String[words];
        int start = 0, index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return result;
    }

    public static String[][] wordLength2D(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLength2D(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
