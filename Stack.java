class Stack {
  int[] list;
  int top;
  int capacity;
  int size;

  public Stack(int n){
    list= new int[n];
    capacity = n;
    size=capacity;
    top = -1;
  }

  public void push(int x)
	{
		if (isFull())
		{
			System.out.println("Error");
			System.exit(1);
		}
		System.out.println("insert: " + x);
		list[++top] = x;
	}

  public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Error2");
			System.exit(1);
		}

		System.out.println("Remove: " + peek());
		return list[top--];
	}

  public int peek()
	{
		return list[top];
	}
}
