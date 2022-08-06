public class MyLinkedListTest {
    public static void main(String[] args) {
        Mylinkedlist<Integer>list = new Mylinkedlist<>(1);

        list.add(0, 2);
        list.add(0, 2);
        list.add(0, 2);
        list.add(0, 2);
        list.add(0, 2);


        Mylinkedlist<Integer> list2 = list.clone();

        list.remove(5);
        System.out.println(list.size());
        System.out.println(list2.size());
    }
}
