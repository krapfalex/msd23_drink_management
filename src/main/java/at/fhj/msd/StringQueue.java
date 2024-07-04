package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue<String> {

  /**
   * List of elements that represents queue
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * max size of queue
   */
  private int maxSize;    //deleted unnecessary declaration


  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }   //typo in maxSize, also added this.

  /**
   * adds an element to queue
   * @param obj gets added
   * @return returns if an element has been added
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize)      //changed != to <
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * returns first element of queue and removes it, if queue is empty, returns null
   * @return first element of queue
   */
  @Override
  public String poll() {
    String element = peek();

    if (!elements.isEmpty()) {              //changed == to .isEmpty & negated argument
      elements.remove(0);
    }

    return element;
  }

  /**
   * returns first element of queue and removes it, if queue is empty, throws NoSuchElementException
   * @return first element of queue
   */
  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * returns first element, if queue is empty, returns null
   * @return first element of queue
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * returns first element, if queue is empty, throws NoSuchElementException
   * @return first element of queue
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}   //Removed typo