import java.io.*;
import java.util.*;
public class GenericTreeIntroAndDisplay {
    
  public static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

    public static Node nodeConstruct(int arr[])
    {
      Stack<Node> st = new Stack<>();
      Node root=new Node();
      for (int i = 0; i < arr.length; i++)
      {
        if (arr[i] == -1)
        {
          st.pop();
        } else
        {
          Node n = new Node();
          n.data = arr[i];
          if (st.size() > 0)
          {
            st.peek().children.add(n);
            st.push(n);
          } else
          {
            root = n;
            st.push(n);
          }
        }
      }
      return root;
    }
    
    public static void display(Node node){
        String str=node.data+"-";
        for(int i=0;i<node.children.size();i++)
        {
            Node child=node.children.get(i);
            str+=child.data+",";
        }
        System.out.println(str);
        
         for(int i=0;i<node.children.size();i++)
        {
            Node child=node.children.get(i);
            display(child);
        }
    }
  
  public static void main(String []args) {
    int arr[] = {10, 12, -1, 14, 18, -1, 20, 22, -1, 24, -1, 26, -1, -1, -1, 16, 28, -1, -1, -1};
    Node root=nodeConstruct(arr);
    display(root);
    
  }
}