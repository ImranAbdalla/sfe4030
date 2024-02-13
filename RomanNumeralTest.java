

public class RomanNumeralTest {

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
    @Test
    void repetition() 
    {
    Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
    Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    @Test
    void manyLettersInOrder() 
    {
    Assertions.assertEquals(1000, new RomanNumeral().romanToInt("VI")); Assertions.assertEquals(1000, new RomanNumeral().romanToInt("XV"));
    }
    @Test
    public void testRomanToIntBasic() {
        RomanNumeral romanConverter = new RomanNumeral();

        int result = romanConverter.romanToInt("VII");
        assertEquals(7, result, "Conversion of 'VII' should be 7");
    }

    private void assertEquals(int i, int result, String string) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testRomanToIntComplex() {
        RomanNumeral romanConverter = new RomanNumeral();

        int result = romanConverter.romanToInt("XIV");
        assertEquals(14, result, "Conversion of 'XIV' should be 14");
    }

}