class Main {
  public static void main(String[] args) {
    //stack.java test code
    System.out.println("Stack: ");

    Stack stack = new Stack(3);
    stack.push(1);
    System.out.println("Top element: " + stack.peek());
    System.out.println("Stack size: " + stack.size());
    stack.push(2);
    System.out.println("Top element : " + stack.peek());
    System.out.println("Stack size: " + stack.size());
    stack.pop();
    System.out.println("Top element: " + stack.peek());
    System.out.println("Stack size: " + stack.size());

    System.out.println("Queue: ");
    int size = 10;
    Queue queue = new Queue(size);

    queue.push(5);
    System.out.println("Top elment: " + queue.peek());
    queue.push(10);
    System.out.println("Top elment: " + queue.peek());
    queue.push(20);
    System.out.println("Top elment: " + queue.peek());
    queue.push(40);
    System.out.println("Top elment: " + queue.peek());
    queue.pop();
    System.out.println("Top elment: " + queue.peek());

  }
}
