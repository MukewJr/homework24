import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.print(set1);

        Set<Integer> set2=new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(5);
        System.out.print("\n"+set2);

        System.out.println("\n"+symmetricDifference(set1,set2));

    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2)
    {

        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        Set<Integer> symmetricDiff=new HashSet<>();
        symmetricDiff.addAll(set1);
        symmetricDiff.addAll(set2);
        symmetricDiff.removeAll(intersection);
        return symmetricDiff;


//        Set<Integer> symmetricDifference = new HashSet<>();
//        symmetricDifference.addAll(set2);//0,1,2
//        Set<Integer> tmp = new HashSet<>(set1);//1,2,3
//        tmp.retainAll(set2);//0,1,2,3
//        symmetricDifference.removeAll(tmp);
//        return symmetricDifference;


    }
}