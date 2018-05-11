package C_4_24;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable() ;
        ht.put(1,2);
        ht.put(null,1);
        System.out.printf(ht.get(null).toString());
        HashMap m = new HashMap();
        m.put(null,null);
    }
}

