package ADI_ETE;

public class DetectingPlagrismInPapers {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language commonly used in software development.";
        //String text = "This is an academic paper discussing the importance of algorithms in computer science. algorithms play a crucial role in various applications, including plagiarism detection."; // replace with your text
        String pattern = "java"; // replace with your pattern
        int count = findOccurrences(text, pattern);
        System.out.println(count);
    }

    public static int findOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }
}
