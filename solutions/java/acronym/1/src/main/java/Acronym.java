import java.util.ArrayList;

class Acronym {

    String result = "";

    Acronym(String phrase) {


        phrase = phrase.replace("-", " ");
        phrase = phrase.replace("_", " ");

        char[] word = phrase.toCharArray();
        ArrayList<String> letters = new ArrayList<>();

        letters.add(String.valueOf(word[0]).toUpperCase());

        char target = ' ';
        ArrayList<Integer> position = new ArrayList<>();
        int count = 0;

        for (char c : word) {
            count++;

            if (c == target) {
                position.add(count);
            }
        }

        for (int i = 0; i < position.size(); i++) {

            // Make sure we're not grabbing another space
            if (position.get(i) < word.length && word[position.get(i)] != ' ') {

                letters.add(
                        String.valueOf(word[position.get(i)]).toUpperCase()
                );
            }
        }

        result = String.join("", letters);


        result = result.replaceAll("[^a-zA-Z0-9]", "");
    }

    String get() {
        return result;
    }
}
