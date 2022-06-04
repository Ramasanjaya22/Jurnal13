package com.isd;

class NodeAdjacent {
    private char data;
    private boolean visited=false;

    NodeAdjacent(char data) {
        this.data = data;
        }

        public char getData() {
         return data;
        }

       public boolean isVisited() {
        return visited;
        }

         public void setVisited(boolean visited) {
        this.visited = visited;
       }
 }
