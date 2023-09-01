package week11;

import java.util.HashMap;
import java.util.Map;

public class Said {
    public static void main(String[] args) {

    //        Write a method that prints the frequency of each character from a String.
    String[] arr = new String[6];
    arr[0] = "haaaaaaa255554lok";
    arr[1] = "anna";
    arr[2] = "";
    arr[3] = null;
    arr[4] = "{()&<><>&&&&&&&";
    arr[5] = "---0++88====0^^^0**5555%%%vv";

        for (String eachArrElement : arr) {

        System.out.println(eachArrElement + " ---> " + freqChars(eachArrElement));
        if(eachArrElement==null){
            System.out.println();
            continue;
        }
        System.out.println("mapMinValue("+freqChars(eachArrElement)+") ---> " + mapMinValue(freqChars(eachArrElement)));
        System.out.println();
    }

}

    static public Map freqChars(String str) {
        if (str == null) {
            return null;
        }
        Map<String, Integer> freqMap = new HashMap<>();
        int freqCount = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    freqCount += 1;

                }
            }
            freqMap.put(str.charAt(i) + "", freqCount);
            freqCount = 0;
        }
        return freqMap;
    }

    public static Integer mapMinValue(Map<String, Integer> map) {

        if(map.size()==0){
            return null;
        }
        String[] r = new String[map.size()];
        int i = 0;
        for (String eachKey : map.keySet()) {
            r[i] = eachKey;
            i++;
        }
        int minValue = map.get(r[0]);
        for (Integer eachValue : map.values()) {
            if (eachValue < minValue) {
                minValue = eachValue;
            }
        }
        return minValue;
    }
}
