import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        Stack pilha = new Stack();

        sc = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\pratica3\\frases.txt"));
        while (sc.hasNextLine()){
            pilha.push(sc.nextLine());
        }
        System.out.println("**********************");
        System.out.println("Top 10 pesquisas: ");
        for (int i = 0; i <=10; i++){
            System.out.println(pilha.pop());
        }
        System.out.println("*****************************");
        System.out.println("Resto da pilha: ");
        while(!pilha.empty()){
            System.out.println(pilha.pop());
        }


    }
}
