import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IsAlientSorted {

    public boolean isAlienSorted(String[] words, String order) {
        boolean isSorted = false;
        // Create a dictionary for lookup later
        Map<Character, Integer> lookupTable = new HashMap<Character, Integer>();
        int i = 0;
        for (char c : order.toCharArray()) {
            lookupTable.put(c, i++);
        }

        lookupTable.put('_', -1);

        // lookupTable.entrySet().forEach(o -> System.out.println(o.getKey() + " : " + o.getValue()));

        // Compare adjacent elements only
        // the transitive property
        for (int j = 0; j < words.length; ++j) {
            if (j+1 < words.length) {
                if (isLexicographicallySorted(words[j], words[j + 1], lookupTable)) {
                    //System.out.println("Sorted");
                    isSorted = true;

                } else {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public boolean isLexicographicallySorted(String str1, String str2, Map<Character, Integer> lookupTable) {
        boolean isSorted = true;
        char blank = '_';
        List<Character> str1CharList = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> str2CharList = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        if (str1CharList.size() > str2CharList.size()) {
            for(int i = 0; i < str1CharList.size() - str2CharList.size(); ++i) {
                str2CharList.add(blank);
            }
        } else {
            for(int i = 0; i < str2CharList.size() - str1CharList.size(); ++i) {
                str1CharList.add(blank);
            }
        }


       //str1CharList.forEach(System.out::println);
        //System.out.println("-----------------------");
        //str2CharList.forEach(System.out::println);

        for (int i = 0; i < str1CharList.size(); ++i) {
            int str1CharValue = lookupTable.get(str1CharList.get(i));
            int str2CharValue = lookupTable.get(str2CharList.get(i));
            //System.out.println("charV1 : " + str1CharValue);
            //System.out.println("charV2 : " + str2CharValue);
            if (str1CharValue == str2CharValue) {
                System.out.println("Equal");
                continue;
            }
            if (str1CharValue > str2CharValue) {
                System.out.println("bigger, not sorted");
                isSorted = false;
                break;
            } else {
                System.out.println("smaller, sorted");
                isSorted = true;
                break;
            }
        }

        return isSorted;
    }

}
