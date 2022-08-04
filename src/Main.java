public class Main {
    // Вывести все чётные числа от 1000 до 0
    public static void main(String[] args) {
        int a = 1000;
        while (a>=0){
            if (a %2 ==0) {
                System.out.println(a);
            }
            a--;
        }
    }
}
