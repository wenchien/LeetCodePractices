import java.util.*;

public class OrderedStream {
    Map<Integer,String> map = new HashMap<>();
    int ptr;

    public OrderedStream(int n) {
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();

        map.put(idKey,value);
        while(map.containsKey(ptr)) {
            list.add(map.get(ptr));
            ptr++;
        }

        return list;
    }
}
/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */