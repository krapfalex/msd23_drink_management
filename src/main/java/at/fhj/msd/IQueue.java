package at.fhj.msd;

// fastly written (not really nice) comments you should adapt
public interface IQueue<T> {
  /** 

   * */ 
  public abstract boolean offer(T obj);


  //returns + del 1st element; null if nothing in there
   //
  public abstract T poll();


  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract T remove();


  // 1st element without delete, otherwise null
   
  public abstract T peek();


  // element is to peek what remove is to poll
  
  public abstract T element();
}