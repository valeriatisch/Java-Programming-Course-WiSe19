/*
 * Hilfe:
 * 		https://programming.guide/java/list-of-java-exceptions.html
 * 		https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
 */

import java.util.EmptyStackException;
public class ArrayStack{
    
    public static final int DEFAULT_CAPACITY=1000;
    private int capacity;
    private Object data[]; //array that can hold objects
    private int top=-1; //if top is -1, it's empty
    
    public ArrayStack(int capacity) {
	    this.capacity=capacity;
	    data=new Object[capacity]; 
    }

    public ArrayStack() {
	    this(DEFAULT_CAPACITY);
    }
    
    public boolean isEmpty(){
	    return (top < 0);
    }

    public int size(){
	    return (top + 1);
    }

    public Object top() throws EmptyStackException{  
	    if (isEmpty())
	        throw new EmptyStackException();
	    return data[top];
    }

    public Object pop() throws EmptyStackException{
	    if (isEmpty())
	        throw new EmptyStackException();
	    Object o = data[top];
	    top--;
	    return o; 
    }

    public void push(Object o) throws StackOverflowException{
	    if (size() == capacity)
	        throw new StackOverflowException("Stack Overflow");
	    data[++top]=o;
    }
    
    public int search(Object o){
	    if (top < 0)
	        return -1;
	    int count = 0;
	    for (int i=top; i>=0; i--){
	        count++;
	        if (data[i].equals(o))
		        return count;
	    }
	    return -1;
    }
    
    // Another possible implementation
    
    /*
    public int search(Object o){
        int distance = -1;
		int count = 1;
	    int i = top;
	    while ((i >= 0) && (data[i].equals(o) == false)){
	        count++;
	        i--;
	    }
	    if (i >= 0){
	        distance = count;
	    }
	    return distance;
    }
    */
    
    public static void main(String[] args){
    	
	    ArrayStack mine = new ArrayStack(10);
	    for (int i =0; i < 11; i++){
	        try{
		    mine.push(i);
	        }catch(StackOverflowException e){
		            System.out.println(e.getMessage());
	        }
    	}
        
	    System.out.println(mine.search(10));
	    System.out.println(mine.search(9));
	    System.out.println(mine.search(0));
	   
    }
}
