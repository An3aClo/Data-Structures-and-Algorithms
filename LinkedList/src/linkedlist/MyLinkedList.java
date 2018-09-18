package linkedlist;

public class MyLinkedList {

    private MyListNode list;

    public MyLinkedList() {
        list = null;
    }

    /*Done recursively
    
    public void append(int value) {
        list = append(list, value);
    }

    //overloaded append method
    public MyListNode append(MyListNode list, int value) {
        if (list == null) {
            list = new MyListNode();
            list.setKey(value);
            list.setNext(null);
        } else {
            list.setNext(append(list.getNext(), value));
        }
        return list;
    }

    public void display() {
        display(list);
    }

    public void display(MyListNode list) {
        if (list != null) {
            System.out.println(list.getKey() + ",");
            display(list.getNext());
        }
    }
     */
    public void append(int value) {
        MyListNode temp = new MyListNode();
        temp.setKey(value);
        temp.setNext(null);

        if (list == null) {
            list = temp;
        } else {
            MyListNode runner = list;
            while (runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(temp);
        }
    }

    public void display() {
        MyListNode runner = list;
        while (runner != null) {
            System.out.println(runner.getKey());
            runner = runner.getNext();
// moves the runner to the next value if not therunner will never be null and thus it will keep on running the first value
        }
    }
}
