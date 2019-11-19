public class Arc {

    int value;
    Node node1;
    Node node2;
    int id;
        public Arc(int value, Node node1, Node node2){
            this.value = value;
            this.node1 = node1;
            this.node2 = node2;
            node1.arcList.add(this);
            node2.arcList.add(this);
        }
}
