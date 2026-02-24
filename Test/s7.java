package Test;

public class s7 {
    public static void main(String[] args) {
        String[] str = {"C++", "C#", "Java", "C++", "Python", "Java"};

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println(str[i]);
                    return;
                }
            }
        }
    }
}