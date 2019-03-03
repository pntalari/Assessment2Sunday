package Collections;

import java.util.Map;
import java.util.Arrays;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Object[] result = new Object[0];

        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1] = key;
            }
        }
        return  result;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1,1,size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 1; i <=size; i++) {
            if(i==1){
                map.put(i,first);
            }
            else if(i==2){
                map.put(i,second);
            }
            else {
                Integer sum = map.get(i-2) + map.get(i-1);
                map.put(i,sum);
            }
        }
        return map;
    }


}

