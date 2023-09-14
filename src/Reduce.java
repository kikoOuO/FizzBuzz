public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i != 0){

            boolean even = i % 2 == 0;

            if (even){

                i = i / 2;

            } else {

                i -= 1;

            }
            count += 1;
        }
        System.out.println(count);
    }
}
