public class RomanNumeralTest {

    // Test cases for single-digit Roman numerals (I, V, X, L, C, D, M)
    @Test
    void singleDigit() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I")); 
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V")); 
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X")); 
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L")); 
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C")); 
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D")); 
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    // Test cases for repeated Roman numerals (II, XX)
    @Test
    void repetition() {
        Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
        Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    // Test cases for Roman numerals with many letters in order (VI, XV, IV, IX)
    @Test
    void manyLettersInOrder() {
        // Test cases with multiple letters in ascending order
        Assertions.assertEquals(6, new RomanNumeral().romanToInt("VI")); 
        Assertions.assertEquals(15, new RomanNumeral().romanToInt("XV"));
        // Test cases with multiple letters in descending order
        Assertions.assertEquals(4, new RomanNumeral().romanToInt("IV")); 
        Assertions.assertEquals(9, new RomanNumeral().romanToInt("IX"));
    }

    // Test cases for invalid Roman numerals
    @Test
    void invalidRomanNumerals() {
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("")); // Empty string
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("IIII")); // More than 3 repetitions of 'I'
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("VV")); // Cannot subtract V from V
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("IL")); // Cannot subtract I from L
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("XCD")); // Cannot subtract C from D
        Assertions.assertEquals(0, new RomanNumeral().romanToInt("CMCDXCXLIXIVIV")); // Combination of various invalid symbols
    }

    // Test cases for mixed case Roman numerals
    @Test
    void mixedCase() {
        Assertions.assertEquals(1001, new RomanNumeral().romanToInt("MI")); // Mixed case of 'M' and 'I'
        Assertions.assertEquals(40, new RomanNumeral().romanToInt("xL")); // Mixed case of 'X' and 'L'
        Assertions.assertEquals(1990, new RomanNumeral().romanToInt("MCMXC")); // Mixed case of 'M', 'C', and 'X'
    }

    // Test cases for edge values (maximum and minimum)
    @Test
    void edgeCases() {
        Assertions.assertEquals(3999, new RomanNumeral().romanToInt("MMMCMXCIX")); // Maximum value of 3999
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I")); // Minimum value of 1
    }

    // Test case for a larger Roman numeral 'MMMCMXCIX' should be 3999
    @Test
    void largerRomanNumeral() {
        Assertions.assertEquals(3999, new RomanNumeral().romanToInt("MMMCMXCIX"));
    }

    // Test case for a Roman numeral with repeated letters 'CCC' should be 300
    @Test
    void repeatedLetters() {
        Assertions.assertEquals(300, new RomanNumeral().romanToInt("CCC"));
    }

    // Test case for a Roman numeral with mixed order 'XIV' should be 14
    @Test
    void mixedOrder() {
        Assertions.assertEquals(14, new RomanNumeral().romanToInt("XIV"));
    }

    // Test case for a Roman numeral with subtractive notation 'IV' should be 4
    @Test
    void subtractiveNotation() {
        Assertions.assertEquals(4, new RomanNumeral().romanToInt("IV"));
    }

    // Test case for a larger Roman numeral 'MDCLXVI' should be 1666
    @Test
    void largerRomanNumeral2() {
        Assertions.assertEquals(1666, new RomanNumeral().romanToInt("MDCLXVI"));
    }
}
