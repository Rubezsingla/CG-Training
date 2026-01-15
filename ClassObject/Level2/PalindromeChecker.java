package ClassObject.Level2;

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return text.equals(reverse);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";

        p.displayResult();
    }
}
