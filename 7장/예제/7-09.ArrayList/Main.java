import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void print(LinkedList<String> l) {
        int i;
        for (i = 0; i < l.size() - 1; i++) {
            System.out.print(l.get(i) + "->");
        }
        System.out.println(l.get(i));
    }

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("트랜스포머");
        l.add("스타워즈");
        l.add("매트릭스");
        l.add(0, "터미네이터");
        l.add(2, "아바타");
        Collections.sort(l);
        print(l);
        Collections.reverse(l);
        print(l);
        Collections.sort(l);
        int i = Collections.binarySearch(l, "아바타") + 1;
        System.out.println("아바타는 " + i + "번째 요소입니다.");
    }
}