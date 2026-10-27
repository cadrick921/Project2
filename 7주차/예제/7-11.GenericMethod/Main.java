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
    public static <T> GenericStack<T> reverse(GenericStack<T> gs1) {
        GenericStack<T> gs2 = new GenericStack<T>();
        while (true) {
            T e = gs1.pop();
            if (e == null) {
                break;
            } else {
                gs2.push(e);
            }
        }
        return gs2;
    }

    public static void main(String[] args) {
        GenericStack<Double> gs = new GenericStack<Double>();
        for (int i = 0; i < 5; i++) {
            gs.push((double) i);
        }
        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}