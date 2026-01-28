package List.ARRAYLIST;

import java.util.ArrayList;

public class ARRAYLIST1
 {
    /*
    1.It has the ReSizAble Array || GrowAble Array.
    2.It allows the duplicate insertion.
    3.Here the insertion order preserved. (in which order you inserts in that order you can delete).
    4.Here the Heterogenious Object are allowed.(acept)
    5.Here the null insertion is possible.
    6.Incuding ArrayList every Collection are Serialisable && Cloneable Interface.
    */

// @SuppressWarnings("rawtypes")
public static void main(String[] args) {
    ArrayList<Object> a = new ArrayList<>();
    a.add("prakash");
    a.add(9);
    a.add(true);
    a.add('k');
    a.add(9.785);
    System.out.println(a);

}

}
