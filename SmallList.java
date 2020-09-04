public class SmallList<T> implements MyList<T> {

  private T zero;
  private T one;

  public SmallList() {
    clear();
  }

  @Override
  public int getLength() {
    if (one != null) {
      return 2;
    } else {
      if (zero != null) {
        return 2;
      }
      return 0;
    }
  }

  @Override
  public boolean isEmpty() {
    return getLength() == 0;
  }

  @Override
  public void clear() {
    zero = null;
    one = null;
  }

  @Override
  public void pushFront(T toAdd) {
    if (zero == null) {
      zero = toAdd;
      return;
    } else if (one == null) {
      one = zero;
      zero = toAdd;
      return;
    } else { // zero and one contain values
      throw new OutOfSpaceException();
    }
  }

  @Override
  public void pushBack(T toAdd) {
    if (zero == null) {
      zero = toAdd;
    } else if (one == null) {
      one = toAdd;
    } else
      throw new OutOfSpaceException();
  }

  private void checkIndex(int index) {
    if (index > 1 || index < 0)
      throw new IndexOutOfBoundsException();
  }

  @Override
  public void insert(int index, T toAdd) {
    checkIndex(index);
    if (index == 0) {
      if (zero == null) {
        zero = toAdd;
      } else if (one == null) {
        one = zero;
        zero = toAdd;
      } else {
        throw new OutOfSpaceException();
      }
    } else { // index == 1
      if (one == null) {
        one = toAdd;
      } else {
        throw new OutOfSpaceException();
      }
    }

  }

  @Override
  public T get(int index) {
    checkIndex(index);
    if (index == 0) {
      if (zero != null)
        return zero;
      else
        throw new IndexOutOfBoundsException();
    } else { // index == 1
      if (one != null)
        return one;
      else
        throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public boolean contains(T check) {
    if (zero == check)
      return true;
    if (one == check)
      return true;
    return false;
  }

  @Override
  public void removeAt(int index) {
    checkIndex(index);
    if(index > getLength())
      throw new IndexOutOfBoundsException();
    if (index == 0) {
      zero = one;
    } else {
      one = null;
    }

  }

  @Override
  public void remove(T toRemove) {
    int index = indexOf(toRemove);
    if(index == -1)
      throw new ArgumentNotFoundException();
    removeAt(index);
  }

  @Override
  public T popFront() {
    if(getLength() == 0)
      throw new CannotPopEmptyListException();
    T toReturn = zero;
    removeAt(0);
    return toReturn;
  }

  @Override
  public T popBack() {
    if(getLength() == 0)
      throw new CannotPopEmptyListException();
    T toReturn = null;
    if (one != null) {
      toReturn = one;
      removeAt(1);
      return toReturn;
    } else {
      toReturn = zero;
      removeAt(0);
      return toReturn;
    }
  }

  @Override
  public int indexOf(T check) {
    if (zero == check)
      return 0;
    if (one == check)
      return 1;
    return -1;
  }

}
