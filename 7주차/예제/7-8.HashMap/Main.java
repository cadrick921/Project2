import java.util.HashMap;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Vector<Integer>> h = new HashMap<String, Vector<Integer>>();
        h.put("Han", new Vector<Integer>());
        h.put("Kim", new Vector<Integer>());
        h.put("Ha", new Vector<Integer>());
        h.put("Yoon", new Vector<Integer>());
        System.out.println("등록된 학생: Han, Kim, Ha, Yoon 등 4명입니다.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름과 점수들>>");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            String[] ar = str.split(" ");
            Vector<Integer> v = h.get(ar[0]);
            if (v == null) {
                System.out.println(ar[0] + "은 없는 학생입니다.");
            } else {
                for (int i = 1; i < ar.length; i++) {
                    v.add(Integer.parseInt(ar[i]));
                }
            }
        }
        while (true) {
            System.out.print("검색할 이름>>");
            String str = scanner.next();
            if (str.equals("exit")) {
                break;
            }
            Vector<Integer> v = h.get(str);
            if (v == null) {
                System.out.println(str + "은 없는 학생입니다.");
            } else if (v.size() == 0) {
                System.out.println(str + "은 토익 점수가 없습니다.");
            } else {
                for (int i = 0; i < v.size(); i++) {
                    System.out.print(v.get(i) + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}