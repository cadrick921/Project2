class GenericStack<T> {
    int i;
    Object[] ar;

    public GenericStack() {
        i = 0;
        ar = new Object[10];
    }

    public void push(T e) {
        if (i == 10) {
            return;
        }
        ar[i++] = e;
    }

    public T pop() {
        if (i == 0) {
            return null;
        }
        return (T) ar[--i];
    }
}

public class Main {
    public static void main(String[] args) {
        GenericStack<String> GS1 = new GenericStack<String>();
        GS1.push("seoul");
        GS1.push("busan");
        GS1.push("LA");
        while (true) {
            String str = GS1.pop();
            if (str == null) {
                break;
            } else {
                System.out.println(str);
            }
        }
        GenericStack<Integer> GS2 = new GenericStack<Integer>();
        GS1.push(1);
        GS1.push(3);
        GS1.push(5);
        while (true) {
            Integer i = GS2.pop();
            if (i == null) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
