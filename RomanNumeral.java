import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static final Map<Character, Integer> map;

    static {
        Map<Character, Integer> tempMap = new HashMap<>();
        tempMap.put('I', 1);
        tempMap.put('V', 5);
        tempMap.put('X', 10);
        tempMap.put('L', 50);
        tempMap.put('C', 100);
        tempMap.put('D', 500);
        tempMap.put('M', 1000);
        map = Collections.unmodifiableMap(tempMap);
    }

    public int romanToInt(String s) {
        int convertedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }
        return convertedNumber;
    }
    public static void main(String[] args) {
        RomanNumeral romanConverter = new RomanNumeral();
        int result = romanConverter.romanToInt("II");
        System.out.println(result);
    }
}