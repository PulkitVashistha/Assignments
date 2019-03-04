package com.ttnd.extra.Collections;

import java.util.*;

public class Q6Frequency {
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('2');
        list.add('1');

        Set<Character> set = new LinkedHashSet<>();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            set.add((char)iterator.next());
        }
        Map<Character,Integer> map = new HashMap<>();
        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            char ch = (char)iterator1.next();
            map.put(ch,Collections.frequency(list,ch));
        }
        Map<Character, Integer> hm1 = sortByValue(map);

        for(Character ch:hm1.keySet()){
            System.out.println("Character = "+ch+ " Frequency = "+hm1.get(ch));
        }
    }
    public static HashMap<Character, Integer> sortByValue(Map<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
                new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
