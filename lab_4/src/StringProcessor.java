public class StringProcessor {
    private String originalText;
    private String shortString;
    private int k;
    private String resultString;
    private int wordCount;

    public StringProcessor(String originalText, String shortString, int k) {
        this.originalText = originalText;
        this.shortString = shortString;
        this.k = k;
    }

    public void processText() {
        StringBuilder builder = new StringBuilder();
        int wordCounter = 0;
        String[] words = originalText.split("\\s+");
        for (String word : words) {
            if (wordCounter == k) {
                builder.append(shortString).append(" ");
            }
            builder.append(word).append(" ");
            wordCounter++;
        }
        if (wordCounter <= k) {
            builder.append(shortString).append(" ");
        }
        resultString = builder.toString().trim();
        wordCount = resultString.split("\\s+").length;
    }

    public String getResultString() {
        return resultString;
    }

    public int getWordCount() {
        return wordCount;
    }
}
