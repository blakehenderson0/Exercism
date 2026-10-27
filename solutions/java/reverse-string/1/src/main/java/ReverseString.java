import java.io.*;

class ReverseString {
    String reverse(String inputString) {

        StringBuilder outputString = new StringBuilder(inputString);
        outputString.reverse();
        return outputString.toString();
    }
}
