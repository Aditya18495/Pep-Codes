import java.io.*;
import java.util.*;

public class AllPaths {
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
   
   public static void allPaths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String path)
   {
       if(src==dest)
       {
           System.out.println(path);
           return;
       }
       
       visited[src]=true;
       
       ArrayList<Edge> nbr=graph[src];
       for(Edge tempnbr : nbr)
       {
            if(visited[tempnbr.nbr]==false)
            {
                allPaths(graph,tempnbr.nbr,dest,visited,path+tempnbr.nbr);
            }
       }
       
       visited[src]=false;
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

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      // write all your codes here
      boolean[] visited=new boolean[vtces];
      allPaths(graph,src,dest,visited,src+"");
   }


}