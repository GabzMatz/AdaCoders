package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {


    public Node root;


    public static class Node{
        public int value;
        public Node left;
        public Node right;


        public Node(int value){
            this.value = value;

        }
        public boolean isLeaf(){
            return(this.left == null) && (this.right == null);
        }
    }
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }else{
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0){
                Node currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }else{
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }else{
                    queue.add(currentNode.right);
                }



            }
        }
    }
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(final Node node){
            //Raiz, Esquerda, Direita
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(final Node node){
        //Esquera, raiz Direita
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void posOrdem(){
        posOrdem(root);
    }

    private void posOrdem(final Node node){
        //Esquera, Direita, Raiz
        if(node == null) return;
        posOrdem(node.left);
        posOrdem(node.right);
        System.out.println(node.value);
    }
    public void BFS(){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }



    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);


        tree.preOrder();
        System.out.println("===================");
        tree.inOrder();
        System.out.println("===================");
        tree.posOrdem();
        System.out.println("===================");
        tree.BFS();

//
////
////        System.out.println(tree.root.value);
////        System.out.println(tree.root.left.value);
////        System.out.println(tree.root.right.value);
//
//        System.out.println(tree.root.isLeaf());
//        System.out.println(tree.root.right.left.isLeaf());
    }



}
