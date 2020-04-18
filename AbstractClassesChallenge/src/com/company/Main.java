package com.company;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
////        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String stringData = "5 6 4 3 56 7 8 8 6 5 4 32";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 6 4 3 5 7 8 8 6 5 4 2";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("7"));
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());




    }
}
