import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> queue = new LinkedList<>();
        queue.addAll(firstClients);

        while (!queue.isEmpty()) {
            String currentClient = queue.poll();
            System.out.println(currentClient + " сделал(а) новый маникюр.");

            if (Math.random() < 0.5) {
                String friendName = "a friend of " + currentClient;
                queue.add(friendName);
                System.out.println("--> " + friendName + " записался(ась) на маникюр.");
            }
        }

        System.out.println("\nВсе клиенты обслужены! Очередь пуста.");
    }
}