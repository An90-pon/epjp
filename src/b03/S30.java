package b03;

public class S30 {
    public static void main(String[] args) {
        int value = 1;
        
        System.out.println(value); // 1

        System.out.println(++value); // 2
        System.out.println(--value); // 1

        System.out.println(value++); // 1
        System.out.println(value); // 2
        System.out.println(value--); // 2
        System.out.println(value); // 1

        System.out.println(+value); // 1
        System.out.println(-value); // -1
    }
}
