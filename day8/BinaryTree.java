package com.company;

public class BinaryTree {
    int a;
    Node root;
    Count c = new Count();
    public BinaryTree(int data){
        this.root = new Node(data);
    }
    public boolean univCount(Node node, Count ct){
        if(node==null){
            return true;
        }
        boolean left = univCount(node.left,ct);
        boolean right = univCount(node.right,ct);
        if(!left || !right){
            return false;
        }
        if(node.left!=null && node.data!=node.left.data){
            return false;
        }
        if(node.right!=null && node.data!=node.right.data){
            return false;
        }
        ct.count++;
        return true;
    }
    public int countUni(Node node){
        univCount(node,c);
        return c.count;
    }
    public int countFinal(){
        return countUni(root);
    }
    public static void main(String[] args){
        BinaryTree tr = new BinaryTree(0);
        tr.root.left = new Node(1);
        tr.root.right = new Node(0);
        tr.root.right.left = new Node(1);
        tr.root.right.right = new Node(0);
        tr.root.right.left.right = new Node(1);
        tr.root.right.left.left = new Node(1);
        System.out.println(tr.countFinal());
    }
}
