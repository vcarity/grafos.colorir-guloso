import java.io.*;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    System.out.println("[START]");

    Colorir colorir = new Colorir();
    colorir.colorirGrafo(args[0]);

    System.out.println("[END]");

  }

}
