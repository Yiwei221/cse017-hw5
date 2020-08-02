class Queue{
  int[] list;          // fixed size array that holds items of queue
  int front;          // index of front of the queue
  int back;            // index of the back of the queue
  int capacity=10;        // how many items can the queue hold
  int size;

  public Queue(int n){
    size = n;
    this.list = new int[n];
    this.back = -1;
    this.front = -1;
  } 

  public void push(int item) {
    if (((back + 1) % size) == front) {
      System.out.println("full");
    } else {
      if (back == front && front == -1) {
        front = 0;
      }
      back = (back + 1) % size;
      list[back] = item;
    }
  }
}
