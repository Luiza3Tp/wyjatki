import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("test.txt"));
        int[] tab ={1,2,3};
        for (int i=0; i<10;i++){
            System.out.println(tab[i]);
        }
    }
}