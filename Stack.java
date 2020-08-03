class Stack {
  int[] list;
  int top;
  int capacity;
  int size;

  public Stack(int n){
    list= new int[n];
    capacity=n;
    size=n;
    top = -1;
  }

  public void push(int x){
    if (isFull()){
      System.out.println("Error1");
      System.exit(1);
    }
    System.out.println("insert: " + x);
    list[++top] = x;
  }

  public int pop(){
    if (isEmpty()){
      System.out.println("Error2");
      System.exit(1);
    }
    System.out.println("Remove: " + peek());
    return list[top--];
  }

  public int peek(){
    if (!isEmpty()){
      return list[top];
    }
    else{
      System.exit(1);
    }
    return -1;
  }

  public Boolean isFull(){
    return top == capacity - 1;	
    }

  public Boolean isEmpty(){
    return top == -1;
    }

  public int size(){
    return top + 1;
    }
}
