
import java.util.Arrays;

public class JavaGraphAM {

    private boolean[][] adjMatrix;
    private int numVertices;

    public JavaGraphAM(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public void printGraph() {
        System.out.println(Arrays.deepToString(adjMatrix));
    }
    
    public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) {
      s.append(i + ": ");
      for (boolean j : adjMatrix[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

    public static void main(String[] args) {
        JavaGraphAM myGraph = new JavaGraphAM(4);

        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(2, 0);
        myGraph.addEdge(2, 3);

        myGraph.printGraph();
        System.out.println(myGraph.toString());
    }
}
