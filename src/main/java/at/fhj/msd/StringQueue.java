package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize;    //deleted unnecessary declaration

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }   //typo in maxSize, also added this.

  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize)      //changed != to < 
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public String poll() {
    String element = peek();

    if (!elements.isEmpty()) {              //changed == to .isEmpty & negated argument
      elements.remove(0);
    }

    return element;
  }

  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}   //Removed typo