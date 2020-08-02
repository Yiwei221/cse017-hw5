class Main {
  public static void main(String[] args) {
    //stack.java test code
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
  }
}
