import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File("src/Ingressos.txt"));
        Queue<String> pq = new PriorityQueue<>();

        while (scanner.hasNextLine()) {
            pq.add(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(pq.remove() + " ");
        }
    }
}
