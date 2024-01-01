package collectionadvanced;

public class TestStack {
    private static MyNode head;
    class MyNode {
        private MyNode next;
        private int data;
        public MyNode(int data) {
            this.data=data;
            next=null;
        }
    }
    public void push(int data){
        MyNode newNode=new MyNode(data);
        newNode.next=head;
        head=newNode;
    }
    public int peek() {
        if(!isEmpty()) {
          return head.data;
        }
        return -1;
    }

    private boolean isEmpty() {
        return head==null;
    }

    public void pop() {
        if(head==null) {

        }
        head=head.next;
    }
    public static void main(String[] args) {
        TestStack stack=new TestStack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.pop();
        stack.traverse();
    }

    private void traverse() {
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
