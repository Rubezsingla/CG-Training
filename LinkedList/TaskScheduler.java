package LinkedList;

class Task {
    int id, priority;
    String name;
    Task next;

    Task(int i, String n, int p) {
        id = i;
        name = n;
        priority = p;
    }
}

public class TaskScheduler {

    static Task head = null;

    static void addTask(int id, String name, int priority) {
        Task t = new Task(id, name, priority);

        if (head == null) {
            head = t;
            t.next = head;
            return;
        }

        Task temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = t;
        t.next = head;
    }

    static void deleteTask(int id) {
        if (head == null) return;

        Task curr = head, prev = null;

        do {
            if (curr.id == id) {
                if (prev != null)
                    prev.next = curr.next;
                else {
                    Task temp = head;
                    while (temp.next != head)
                        temp = temp.next;
                    head = curr.next;
                    temp.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    static void display() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        addTask(1, "Coding", 1);
        addTask(2, "Testing", 2);
        addTask(3, "Debugging", 1);

        display();
        System.out.println();

        deleteTask(2);
        display();
    }
}

