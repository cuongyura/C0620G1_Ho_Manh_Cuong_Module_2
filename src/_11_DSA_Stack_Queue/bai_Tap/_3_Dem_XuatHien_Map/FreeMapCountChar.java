package _11_DSA_Stack_Queue.bai_Tap._3_Dem_XuatHien_Map;

import java.util.TreeMap;

public class FreeMapCountChar {
    public static void main(String[] args) {
        String string = "Chẳng biết viết điều gì cho hay đây !";
        String[] arrays = string.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String temp;
        int count;
        for (String elements : arrays){
            temp = elements.toUpperCase();
            if(treeMap.containsKey(temp)){
                count = treeMap.get(temp);
                treeMap.put(temp, count + 1);
            }else treeMap.put(temp, 1);
        }
        System.out.println(treeMap);
    }
}
