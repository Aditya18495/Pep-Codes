import java.io.*;
import java.util.*;

public class IsGraphConnected {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static int c=0;
   public static boolean isConnected(ArrayList<Edge>[] graph,int src,int vtces,boolean[] visited)
   {
       visited[src]=true;
       c++;
       for(Edge e: graph[src])
       {
           if(visited[e.nbr]==false)
           {
               boolean flag=isConnected(graph,e.nbr,vtces,visited);
           }
       }
       if(c==vtces)
       {
           return true;
       }
       
       return false;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      boolean[] visited=new boolean[vtces];
      boolean ans=isConnected(graph,0,vtces,visited);
      System.out.println(ans);
   }
}