package Default;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        int[] c = {5};
        List orgin = new ArrayList();
        orgin.add(a);
        orgin.add(b);
        orgin.add(c);
        List target = new ArrayList();
        for (int i = 0;i<a.length;i++){
            List temp  =  new ArrayList();
            temp.add(a[i]);
            target.add(temp);
            main2(orgin,1,target,target.size()-1);
        }
        target.size();

    }
    public static void main2(List<int[]> orgin, int orgin_index,List<List> target,int target_index){
        if (orgin_index == orgin.size()){
            return;
        }
        int[] t = orgin.get(orgin_index);
        List target_parent = target.get(target_index);
        List target_parent_copy = new ArrayList(target_parent);
            for (int j = 0;j<t.length;j++) {
                   if (j == 0){
                       target_parent.add(t[j]);
                       main2(orgin,orgin_index+1,target,target_index);
                   }
                   else {
                       List temp = new ArrayList(target_parent_copy);
                       temp.add(t[j]);
                       target.add(temp);
                       main2(orgin,orgin_index+1,target,target.size()-1);
                   }
            }
    }
}
