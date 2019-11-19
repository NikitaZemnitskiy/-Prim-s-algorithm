import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        ArrayList <Arc> arcList = new ArrayList<Arc>();
       arcList.add(new Arc(7,A,B));
        arcList.add(new Arc(5,A,D));
        arcList.add(new Arc(9,B,D));
        arcList.add(new Arc(8,B,C));
        arcList.add(new Arc(7,B,E));
        arcList.add(new Arc(5,C,E));
        arcList.add(new Arc(15,D,E));
        arcList.add(new Arc(6,D,F));
        arcList.add(new Arc(9,E,G));
        arcList.add(new Arc(8,E,F));
        arcList.add(new Arc(11,F,G));

        Graph graph = new Graph(arcList, A,B,C,D,E,F,G);


      System.out.println(graph.primeAlgorithm(D));

    }
}
