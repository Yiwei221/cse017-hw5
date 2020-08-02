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
}
