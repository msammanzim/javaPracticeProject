package Assignment_2;

public class UnaryOperator {
    public static void main(String[] args) {
        int mark=80;
        mark=mark+1;
        mark=mark-1;
        System.out.println(mark++);//80
        System.out.println(mark);//81
        System.out.println(mark++);//81
        System.out.println(--mark);//81
        System.out.println(mark--);//81
        System.out.println(mark);//80


    }
}
