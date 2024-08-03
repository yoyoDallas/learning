package collectionsFramework;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String > {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class QueueMainTest {
    public static void main(String [] args){
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("zebr","Moneky","Cat","Dog","boggye"));
        System.out.println(queue);
        System.out.println(queue.poll());

    }
}
