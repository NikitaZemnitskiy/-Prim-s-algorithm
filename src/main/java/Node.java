import java.util.ArrayList;

public class Node {
    String name;
    ArrayList<Arc> arcList = new ArrayList<Arc>();
    public Node(String name){
        this.name = name;
    }
}
