import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        List<String> fila = new LinkedList<>();
        Random random = new Random(10);

        sc = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\pratica3-2\\ingressos.txt"));

        while(sc.hasNextLine()){
            fila.add(sc.nextLine());
        }
        Iterator iterator = fila.iterator();

        for (int i = 0; i < 10; i++) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + "\n");
            }
        }


        int sorteio = random.nextInt(fila.size());
        System.out.println("Ingresso Sorteado: " + fila.get(sorteio));



    }
}
