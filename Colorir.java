import java.io.*;

public class Colorir {

  public void colorirGrafo (String arg) throws FileNotFoundException {

    Grafo grafo = new Grafo(arg);

    int[] resultado = new int[grafo.numeroDeVertices];
    boolean[] corDisponivel = new boolean[grafo.numeroDeVertices];

    for (int i = 0; i < grafo.numeroDeVertices; i++) {
      resultado[i] = -1;
      corDisponivel[i] = true;
    }
    resultado[0] = 0;

    for (int i = 1; i < grafo.numeroDeVertices; i++) {

      if (resultado[i] == -1) {

        for (int j = 0; j < grafo.numeroDeVertices; j++) {

          if (grafo.grafo[i][j] == 1) {

            corDisponivel[j] = false;

          }

        }

        for (int cor = 0; cor < grafo.numeroDeVertices; cor++) {

          if(corDisponivel[cor]) {

            resultado[i] = cor;

          }

        }

        for (int k = 0; k < grafo.numeroDeVertices; k++) {

          corDisponivel[k] = true;

        }

      }

    }

    for (int i = 0; i < grafo.numeroDeVertices; i++) {
      System.out.println("Vértice " + i + " cor " + resultado[i]);
    }

  }

}
