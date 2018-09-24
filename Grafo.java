import java.io.*;
import java.util.*;

public class Grafo {

  public int numeroDeVertices = 0;
  public int numeroDeArestas = 0;
  public int[][] matriz;
  public int[][] grafo;

  public Grafo(String arg) throws FileNotFoundException {

    lerEntrada(arg);

  }

  public void lerEntrada(String arg) throws FileNotFoundException {

    File entrada = new File(arg);

    Scanner scanner = new Scanner(entrada);
    String linha = scanner.nextLine();
    String[] coluna = linha.split(" ");
    this.numeroDeVertices = coluna.length;

    this.matriz = new int[this.numeroDeVertices][this.numeroDeVertices];
    this.grafo = new int[this.numeroDeVertices][this.numeroDeVertices];

    int i = 0;
    int j = 0;
    scanner = new Scanner(entrada);
    while(scanner.hasNextLine()) {

      linha = scanner.nextLine();
      coluna = linha.split(" ");

      for (j = 0; j < coluna.length; j++) {

        matriz[i][j] = Integer.parseInt(coluna[j]);
        this.grafo[i][j] = matriz[i][j];

      }

      i++;
    }

    for (int x = 0; x < i; x++) {
      for (int y = 0; y < j; y++) {

        if(matriz[x][y] != 0) {
          if (matriz[x][y] == matriz[y][x]) {
            matriz[x][y] = 0;
            matriz[y][x] = 0;
            this.numeroDeArestas += 1;
          }
        }

      }
    }

    System.out.println("Numero de Vertices: " + numeroDeVertices);
    System.out.println("Numero de Arestas : " + numeroDeArestas);

  }

}
