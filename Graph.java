class Graph{
  int[][] graph;

  public Graph(int[][] graph){
    this.graph= graph;
  }
  public void add_edge(int from, int to){
    graph[from-1][to-1]=1;
  }
}
