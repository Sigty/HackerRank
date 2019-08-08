package solving;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        int[] h0 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(designerPdfViewer(h0, "abc"));
    }

    private static int designerPdfViewer(int[] h, String word) {

        int maxHeight = Integer.MIN_VALUE;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j]) {
                    if (h[j] > maxHeight) {
                        maxHeight = h[j];
                    }
                }
            }
        }

        return maxHeight * word.length();
    }
}
