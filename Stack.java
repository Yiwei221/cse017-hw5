class Stack {
  int[] list;
  int top;
  int capacity;
  int size;

  public Stack(int n){
    list= new int[n];
    capacity = n;
    top = -1;
  }

  public void push(int x)
	{
		System.out.println("Inserting " + x);
		list[++top] = x;
	}
}
