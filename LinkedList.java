public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addStudentAtStart(Student s) {
        Node newNode = new Node(s, null);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtStart(){
        if(head != null)
         head = head.next;
        else
            System.out.println("Empty list");
    }

    public void addStudentAtEnd(Student s) {
        Node newNode = new Node(s, null);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAtEnd(){
        if (head == null || head.next == null) {
            if (head == null){
                System.out.println("empty list");
                return;
            }
            else{
                head = null;
                return;
            }
        }

        Node IndexNode = head;
        Node nextNode = head.next;

        {
        while(nextNode.next != null ){
            IndexNode = nextNode;
            nextNode = nextNode.next;
        }

            IndexNode.next = null;

        }
    }

    public void addStudentAtIndex(Student s, int index) {
        Node newNode = new Node(s, null);
        if (index == 0) {
            addStudentAtStart(s);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index error");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public int searchByData(Student s){
        Node currentIndex = head;
        int count = 0;
        while (currentIndex.next != null){
            if(currentIndex.data.studentId == s.studentId){
                return count;
            }
            count++;
            currentIndex = currentIndex.next;
        }
        return -1;
    }



    public void showStudent() {
        Node indexNode = head;
        while (indexNode != null) {
            indexNode.data.showStudent();
            indexNode = indexNode.next;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Student s1 = new Student("Arham", "58");
        Student s2 = new Student("Umer", "62");
        Student s3 = new Student("Ali", "45");

        l.addStudentAtStart(s1);
        l.addStudentAtStart(s2);
        l.addStudentAtEnd(s3);

        l.showStudent();
        int res = l.searchByData(s1);
        System.out.println(( res != -1 ? "found data at index " + res : "Error founding data"));
    }
}
