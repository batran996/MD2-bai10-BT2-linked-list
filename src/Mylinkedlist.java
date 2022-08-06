public class Mylinkedlist<E> {
    class Node {
        Node next;
        private Object data;

        public Node(Object data) {
            this.next = null;
            this.setData(data);
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    Node head;
    private int numNodes = 0;

    public Mylinkedlist(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E e) {
        if (index >= numNodes) {
            throw new ArrayIndexOutOfBoundsException("index out of bout");
        }
        if (index == 0) {
            addFist(e);
            return;
        }
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFist(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public void remove(int index) {
        if (index >= numNodes) throw new ArrayIndexOutOfBoundsException("index out of bouts");
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public void remove(E o) {
        remove(indexOf(o));
    }

    public int size() {
        return numNodes;
    }

    public Integer clone() {
        Mylinkedlist<E> l = new Mylinkedlist<E>(head.getData());
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
            l. addLast((E) temp.getData());
        }
        return 1;
    }

    public boolean contains(E o) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        return found;
    }

    public int indexOf(E o) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }


}
