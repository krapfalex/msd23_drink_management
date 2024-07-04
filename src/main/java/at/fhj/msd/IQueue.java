package at.fhj.msd;

public interface IQueue<T> {

  /**
   * adds an element to queue
   * @param obj gets added
   * @return returns if an element has been added
   */
  public abstract boolean offer(T obj);


  /**
   * returns first element of queue and removes it, if queue is empty, returns null
   * @return first element of queue
   */
  public abstract T poll();


  /**
   * returns first element of queue and removes it, if queue is empty, throws NoSuchElementException
   * @return first element of queue
   */
  public abstract T remove();


  /**
   * returns first element, if queue is empty, returns null
   * @return first element of queue
   */
   
  public abstract T peek();


  /**
   * returns first element, if queue is empty, throws NoSuchElementException
   * @return first element of queue
   */
  public abstract T element();
}