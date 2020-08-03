import java.util.Arrays;
import java.util.Iterator;

class Graph{
  int[][] graph;

  public Graph(int[][] graph){
    this.graph= graph;
  }
  public void add_edge(int from, int to){
    graph[from-1][to-1]=1;
  }

  public void remove_edge(int from, int to){
    graph[from-1][to-1]=0;
  }

  public int[] traverse_bfs(int start, int goal){
    Queue queue = new Queue(graph[0].length);
    int[] t=new int[graph[0].length];
    queue.push(start); 
    while(queue.size!=0){
      int n=queue.pop();
      int i=0;
      t[0]=n;
      i+=1;
      if(n==goal){
        break;
      }else{
        for(int j=0;j<graph[0].length;j++){
          if(graph[n][j]==1){
          queue.push(j);  
          }
        }
      }
    }
    return t;
  }

  int[] traverse_dfs(int start){
    
  }

}
