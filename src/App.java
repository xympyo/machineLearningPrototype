import java.util.Scanner;
// https://archive.ics.uci.edu/dataset/319/mhealth+dataset

public class App {
    class MentalHealthSet {
        public String dataSet[][] = { { "Saya", "saya", "sedih", "Sedih" },
                { "jahat", "Jahat", "menyesal", "Menyesal", "sesal", "Sesal" } };
        public int counter[][] = { { 0 }, { 0 } };
    }

    class DataClassify {
        public void classifyData(MentalHealthSet mentalHealthSet, GetTextToSentence getTextToSentence) {
            String dataSet[][] = mentalHealthSet.dataSet;
            String sentence[] = getTextToSentence.sentence;
            for (int i = 0; i < mentalHealthSet.dataSet[0].length; i++) {
                for (int j = 0; j < mentalHealthSet.dataSet.length; j++) {
                    for (int x = 0; x < mentalHealthSet.dataSet[j].length; x++) {
                        for (int y = 0; y < sentence.length; y++) {
                            if (sentence[y] == dataSet[j][x]) {

                            }
                        }
                    }
                }
            }
        }
    }

    class GetTextToSentence {
        private String texts;
        String sentence[];

        public void GetText(String text) {
            this.texts = text;
        }

        public void TextToSentences() {
            sentence = texts.split("\\s+");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Pretend AI is talking to you or something, answer whatever");
            String userInput = input.nextLine();

        }
    }
}
