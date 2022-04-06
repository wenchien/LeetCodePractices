import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    private Map<Integer, Integer> duplicateLookup = new HashMap<Integer, Integer>();

    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for(int number : nums) {
            if (duplicateLookup.containsKey(number)) {
                int value = duplicateLookup.get(number);
                duplicateLookup.put(number, ++value);
            } else {
                duplicateLookup.put(number, 1);
            }

            if (duplicateLookup.get(number) >= 2) {
                result = true;
                break;
            }

        }


        return result;
    }
}
