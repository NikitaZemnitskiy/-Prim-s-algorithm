import java.util.ArrayList;

public class Graph {
  static   ArrayList<Node> listNode = new ArrayList<Node>();
  static   ArrayList<Arc> arcList = new ArrayList<Arc>();
    public Graph(ArrayList<Arc> arcList, Node...nodes){
        for (Node n:nodes){
            listNode.add(n);
        }
        this.arcList = arcList;
    }
    public static int primeAlgorithm (Node firstNode){
        ArrayList<Node> availableNodes = new ArrayList<Node>();
        availableNodes.add(firstNode);
        int count = 0;
        while (listNode.size() != 1) {
            System.out.println(" ");
            System.out.println(listNode.size() + " - Размер листа");
            int min = 1000;
            Node currentNode = null;


            ArrayList<Arc> arcAvailableList = new ArrayList<Arc>();
            System.out.println("Размер доступных ребер: ");
            for (Arc arc : arcList) {
                if (availableNodes.contains(arc.node1) ^ availableNodes.contains(arc.node2)) {

                    arcAvailableList.add(arc);
                   System.out.println("- "+ arc.value);
                }
            }
                for (Arc arc: arcAvailableList){
                    if (arc.value<min){
                        min = arc.value;
                            if (availableNodes.contains(arc.node1)){
                                currentNode = arc.node2;
                            }
                            else {
                                currentNode = arc.node1;
                            }

                    }
                }

            System.out.println("Текущий минимум - " + min);
                count += min;
                availableNodes.add(currentNode);
                listNode.remove(currentNode);

            }

        return count;
    }
}
