import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }


    public void removeLanguage(String language) {
        languages.clear();
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {

        int languageAmount = 0;

        for (String language : languages) {
            languageAmount++;
        }
        return languageAmount;
    }

    public boolean containsLanguage(String language) {
        return languages.contains("Java");
    }

    public boolean isExciting() {
        boolean containsJavaOrKotlin = true;

        if (languages.contains("Java") || languages.contains("Kotlin")) {
            containsJavaOrKotlin = true;
        } else
            containsJavaOrKotlin = false;

        return containsJavaOrKotlin;
    }
}
