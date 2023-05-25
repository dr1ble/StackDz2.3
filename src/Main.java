import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов в очереди для рандомного заполнения");
        int size = in.nextInt();
        Queue q = new Queue(size);
        for(int i = 0; i < size; i++){
            q.push((int)(Math.random()*10));
        }
        for(int i = 0; i < size; i++){
            System.out.println(q.front());
            q.pop();
        }
        System.out.println("Размер очереди: " + q.size());
    }
}
