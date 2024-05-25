package Assignment_5;

public class For_Each_loop {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50,60,70,90};
        for (int num:number){
            System.out.println(num);

        }
        System.out.println("-------------------------");
        for (int i=2;i<number.length;i++){
            System.out.println(number[i]);
        }

    }
}
