package arraypart2;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("originalnum"+num);
        int reverse = 0;
        while(num !=0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;

        }
        System.out.println(reverse);
    }
}
