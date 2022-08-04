public class Main1 {
    public static void main(String[] args) {
        // Среднее арифмитическое от 0 до 100
        int sum = 0;
        int count = 1;
        while (count <= 100){
            sum += count;
            count ++;
        }
        float res = sum / count;
        System.out.println(res);
    }
}
