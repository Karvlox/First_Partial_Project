import java.util.List;

public class Main {
    public static void main(String[] args) {
        UploadTXT upload = new UploadTXT();

        String text1 = upload.readFile();
        String text2 = upload.readFile();

        double similarity = verifySimilarity.calculateSimilarity(text1, text2);
        List<String> misspellings = verifySimilarity.findMisspellings(text1, text2);

        System.out.printf("Similarity: %.2f%%\n", similarity);
        System.out.println("Misspellings:");
        for (String misspelling : misspellings) {
            System.out.println(misspelling);
        }


    }
}
