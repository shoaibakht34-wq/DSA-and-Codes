package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//top view of binary tree
class Node{
    int data;
    Node left;
    Node right;
}
class Pair{
    int dist;
    Node node;
    Pair(Node node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
public class HasBinarytree {
    public static void main(String[]args){
        Node root=new Node();
      ArrayList<Integer> ans=new ArrayList<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(root, 0)); 
       while(q.size()>0){
        Pair front=q.remove();
        Node node=front.node;
        int dist=front.dist;
        int minDist=Math.min(dist, minDist);
        if(!map.containsKey(dist)) map.put(dist,node.data);
        if(node.left!=null)q.add(new Pair(node.left, dist-1));
        if(node.right!=null)q.add(new Pair(node.right, dist+1));
        
       }
      
    }
}
