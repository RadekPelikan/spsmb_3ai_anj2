package _22y._01m._20d_39.cviceni;

public class SpojovySeznam {
    private Node head;
    public void vloz(Object data){
        //spojový seznam je prázdný, v hlavičce je null
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        //pokud není prázdný, najdu konec a přidám nový Node

        Node curr = this.head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data);
        curr.next = newNode;
    }

    public Node getHead() {
        return this.head;
    }

    void vypisSeznam()
    {
        Node n = this.head;
        int i = 0;
        while (n != null) {
            System.out.print(((i%10==0)?"\n":" ") + n.data);
            n = n.next;
            i++;
        }
    }
    public Object vyjmiPrvniho() throws NoNodesExeption {
        if (this.head == null) {
            throw new NoNodesExeption("No nodes");
        }
        Object tmp = this.head.data;
        this.head = this.head.next;
        return tmp;
    }
}
