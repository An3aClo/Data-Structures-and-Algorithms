package queueofsharks;

/**
 *
 * @author andre
 */
public class QueueOfSharks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyQueue mq = new MyQueue(7);
        mq.enqueue(new Shark("Andrea","Cloete"));
        mq.enqueue(new Shark("Hammer Head"," Fresh Water"));
        mq.enqueue(new Shark("White Head","Fresh Water"));
        mq.enqueue(new Shark("Killer ","Salt water"));
        mq.enqueue(new Shark("Rager","Salt Water"));
        mq.enqueue(new Shark("Angler Shark","Salt Water"));
        mq.enqueue(new Shark("Limbos Shark","Fresh Water"));
   System.out.println("The original queue");
       mq.print();
        System.out.println();

        System.out.println(mq.dequeue() + "Dequeue");
        System.out.println(mq.dequeue() + "Dequeue");
        System.out.println();
        System.out.println("Queue with empty spaces");
        mq.print();
        mq.enqueue(new Shark("Panter Shark", "Fresh Fater"));
        mq.enqueue(new Shark("KKankoroo Sahrk","Salt water"));
        System.out.println();
        System.out.println("The new queue");
        mq.print();
        
        
    }
    
}
