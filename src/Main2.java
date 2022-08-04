public class Main2 {
    // Нечетные числа от 100 до 1000, делящиеся на 5 без остатка
    public static void main(String[] args) {
        for (int a = 100; a <= 1000; a++){
            if (a % 2 == 1) {
                if (a % 5 == 0){
                    System.out.println(a);
                }
            }
        }
    }
}
