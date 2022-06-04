package com.isd;
import java.util.ArrayList;
import java.util.Stack;
public class DFS_ADJACENT {
 static ArrayList<NodeAdjacent> nodes = new ArrayList<>();
/*
Method ini digunakan untuk mencari daftar tetangga dari suatu simpul.
Daftar tetangga didapatkan dari matrik adjacent.
*/
 public ArrayList<NodeAdjacent> findNeighbours(char matriks[][], NodeAdjacent x) {
         int idx = -1;
         ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
         for (int i = 0; i < nodes.size(); i++) {
             if (nodes.get(i).equals(x)) {
                 idx = i;
                 break;
                 }
             }

         if (idx != -1) {
             for (int j = 0; j < matriks[idx].length; j++) {
                 if (matriks[idx][j] == 1) {
                     tetangga.add(nodes.get(j));
                     }
                 }
             }
         return tetangga;
         }
    public void dfsUsingStack(char matriks[][], NodeAdjacent node) {
         Stack<NodeAdjacent> stack = new Stack<>();
         stack.add(node);
         while (!stack.isEmpty()) {
             NodeAdjacent element = stack.pop();
             if (!element.isVisited()) {
                 System.out.print(element.getData() + " ");
                 element.setVisited(true);
                 }
             ArrayList<NodeAdjacent> tetangga = findNeighbours(matriks, element);
             for (int i = 0; i < tetangga.size(); i++) {
                 NodeAdjacent n = tetangga.get(i);
                 if (n != null && !n.isVisited()) {
                     stack.add(n);
                     }
                 }
             }
         }

    public static void main(String arg[]) {
         NodeAdjacent node1 = new NodeAdjacent('A');
         NodeAdjacent node2 = new NodeAdjacent('B');
         NodeAdjacent node3 = new NodeAdjacent('C');
         NodeAdjacent node4 = new NodeAdjacent('D');
         NodeAdjacent node5 = new NodeAdjacent('E');
         NodeAdjacent node6 = new NodeAdjacent('F');
         NodeAdjacent node7 = new NodeAdjacent('G');
         NodeAdjacent node8 = new NodeAdjacent('H');
         NodeAdjacent node9 = new NodeAdjacent('I');

         nodes.add(node1);
         nodes.add(node2);
         nodes.add(node3);
         nodes.add(node4);
         nodes.add(node5);
         nodes.add(node6);
         nodes.add(node7);
         nodes.add(node8);
         nodes.add(node9);

        char matriks[][] = {
                 // Simpul A B C D E F G H I
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul 1 : value A
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul 2 : value B
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul 3 : value C
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul 4 : value D
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul 5 : value E
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul 6 : value F
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul 7 : value G
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul 8 : value H
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul 9 : value I
        };
         DFS_ADJACENT dfsExample = new DFS_ADJACENT();
         System.out.print("DFS Traversal Graph : ");
         dfsExample.dfsUsingStack(matriks, node1);
         System.out.println();
         }
 }
