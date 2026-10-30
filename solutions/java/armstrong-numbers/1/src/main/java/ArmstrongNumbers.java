import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Character.getNumericValue;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numberString = Integer.toString(numberToCheck);

        ArrayList<String> charsInNumber = new ArrayList<String>();

        for (int i = 0 ; i < numberString.length() ; i++){
            charsInNumber.add(String.valueOf(numberString.charAt(i)));
        }

        int power = charsInNumber.size();
        int equation = 0;

        for (int i = 0 ; i < numberString.length() ; i++){
            int num2 = Integer.parseInt(charsInNumber.get(i));
            equation += Math.pow(num2,power);
        }

        if (equation == numberToCheck){
            return true;
        } else {
            return false;
        }

    }

}
