class MinStack {

  Stack<Integer> mainStack, auxStack;
  
    public MinStack() {

      this.mainStack= new Stack<>();
      this.auxStack= new Stack<>();
    }
    
    public void push(int val) {
      this.mainStack.push(val);
      if(auxStack.isEmpty() || val<=auxStack.peek()){
        this.auxStack.push(val);
      }
       
    }
    
    public void pop() {

      if(this.mainStack.peek()== this.getMin()){
        this.auxStack.pop();
      }
      this.mainStack.pop();
      
    }
    
    public int top() {
      return this.mainStack.peek();
        
    }
    
    public int getMin() {
      return this.auxStack.peek();
        
    }
}
