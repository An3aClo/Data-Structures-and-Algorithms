 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wg;

/**
 *
 * @author MakhuraneT
 */
public class MyLinkedList {

    private MyListNode list;

    public MyLinkedList() {
        list = null;
    }

    public boolean isEmpty() {
        return list == null;
    }

    public void append(int value) {
        list = append(list, value);
    }

    private MyListNode append(MyListNode list, int value) {
        if (list == null) { // base case
            list = new MyListNode();
            list.setData(value);
            list.setNext(null);
        } else { // recursive case
            list.setNext(append(list.getNext(), value));
        }
        return list;
    }

    public boolean has(int value) {
        MyListNode f = list;
        while (f != null) {
            if (f.getData() == value) {
                return true;
            }
            f = f.getNext();
        }
        return false;
    }

    public void delete(int u) {
        if (list.getData() == u) {
            list = list.getNext();
        } else {
            MyListNode f = list;
            MyListNode b = null;
            while (f.getData() != u) {
                b = f;
                f = f.getNext();
            }
            b.setNext(f.getNext());
        }

    }

    // method for Dijkstra's algorithm
    public int getUWithMinDist(int dist[]) {
        MyListNode f = list;

        int pos = f.getData();
        int smallest = dist[pos];
        while (f.getNext() != null) {
            if (dist[f.getData()] < smallest) {
                pos = f.getData();
                smallest = dist[pos];
            }
            f = f.getNext();
        }
        delete(pos);
        return pos;
    }
}
