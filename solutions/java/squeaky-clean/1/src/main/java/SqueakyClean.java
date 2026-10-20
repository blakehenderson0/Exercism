import static java.lang.Character.*;

class SqueakyClean {
    static String clean(String identifier) {

        char[] asArray = identifier.toCharArray();

        String newIdentifier = "";

        for (int i = 0; i < identifier.length(); i++) {

            if (asArray[i] == ' ') {
                newIdentifier += "_";
            } else if (asArray[i] == '-') {
                newIdentifier += "";
                newIdentifier += Character.toUpperCase(asArray[i+1]);
                i++;
            } else if (asArray[i] == '3') {
                newIdentifier += "e";
            } else if (asArray[i] == '0') {
                newIdentifier += "o";
            } else if (asArray[i] == '7') {
                newIdentifier += "t";
            } else if (asArray[i] == '4') {
                newIdentifier += "a";
            } else if (asArray[i] == '1') {
                newIdentifier += "l";
            } else if (!isAlphabetic(asArray[i])) {
                newIdentifier += "";
            } else
                newIdentifier += asArray[i];






        }
        return newIdentifier.replaceAll("\\s","");
    }
}