package collection.comparator;

import java.util.Set;
import java.util.TreeSet;

public class ComperatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        System.out.println(set); }
}
