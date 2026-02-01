package Collection.List;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(3,1,2,2,3,4);
        Set<Integer> hs=new LinkedHashSet<>(li);
        List<Integer>li2=new ArrayList<>(hs);

        System.out.println(li2);

    }
}
