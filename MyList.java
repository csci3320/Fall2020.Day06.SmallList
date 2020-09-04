

public interface MyList<T> {
  int getLength();
  boolean isEmpty();
  void clear();
  void pushFront(T toAdd);
  void pushBack(T toAdd);
  void insert(int index, T toAdd);
  T get(int index);
  int indexOf(T check);
  boolean contains(T check);
  void removeAt(int index);
  void remove(T toRemove);
  T popFront();
  T popBack();


}
