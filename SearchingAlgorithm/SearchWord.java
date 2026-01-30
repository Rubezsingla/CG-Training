package SearchingAlgorithm;

class SearchWord{
    public static String searchWord(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "I love programming",
                "Java is powerful",
                "Data structures are important"
        };

        String word = "Java";

        System.out.println(searchWord(sentences, word));
    }
}

