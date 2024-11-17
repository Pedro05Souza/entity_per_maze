import java.util.HashMap;

public class Converter {

    public static String convertHexa(Character value){
        HashMap<Character, String> hexa = new HashMap<>();
        hexa = convertHexa(hexa);
        return hexa.get(value);
    }

    private static HashMap<Character, String> convertHexa(HashMap<Character, String> hexa){
        hexa.put('0', "0000");
        hexa.put('1', "0001");
        hexa.put('2', "0010");
        hexa.put('3', "0011");
        hexa.put('4', "0100");
        hexa.put('5', "0101");
        hexa.put('6', "0110");
        hexa.put('7', "0111");
        hexa.put('8', "1000");
        hexa.put('9', "1001");
        hexa.put('A', "1010");
        hexa.put('B', "1011");
        hexa.put('C', "1100");
        hexa.put('D', "1101");
        hexa.put('E', "1110");
        hexa.put('F', "1111");
        return hexa;
    }

}
