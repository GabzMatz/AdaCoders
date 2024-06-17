package dataStructure;

public class Stack {

    private Node top;
    private int height;



    public class Node{

        int value;

        Node next;


        //Constructor
        Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    public void getTop(){
        if(top == null){
            System.err.println("Pilhas vazia");
        }else{
            System.out.println("Top: " + top.value);
        }

    }
    public void getHeight(){
        System.out.println("Altura: " + height);

    }
    public void print(){
        Node temp = top;
        System.out.println("------------------------");
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("------------------------");
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if(top == null){
            System.err.println("Pilhas vazia");
            return null;
        }

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        myStack.print();

    }

}
