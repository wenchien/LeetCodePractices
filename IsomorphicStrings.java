import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        // Two tables to keep a one to one relationship
        Map<Character, Character> lookupTable = new HashMap<Character, Character>();
        Map<Character, Character> reverseLookupTable = new HashMap<Character, Character>();

        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        boolean result = true;

        for (int i = 0; i < s.length(); ++i) {
            //System.out.println(firstString[i] + " : " + secondString[i]);
            //System.out.println(lookupTable.containsKey(firstString[i]));
            //System.out.println(lookupTable.containsValue(secondString[i]));
            if (lookupTable.get(firstString[i]) != null && (lookupTable.get(firstString[i]) != secondString[i])) {
                System.out.println("Breaking...");
                result = false;
                break;
            }
            if (reverseLookupTable.get(secondString[i]) != null && reverseLookupTable.get(secondString[i]) != firstString[i]) {
                System.out.println("Breaking...from mappedrelationship");
                result = false;
                break;
            }
            //System.out.println("Continuing");
            lookupTable.put(firstString[i], secondString[i]);
            reverseLookupTable.put(secondString[i], firstString[i]);
        }


        return result;
    }
}
