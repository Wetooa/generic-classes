package map;

import java.util.ArrayList;

public class MyMap<A extends Comparable<A>, B extends Comparable<B>> {

  private ArrayList<A> keys;
  private ArrayList<B> values;

  public MyMap() {
    keys = new ArrayList<>();
    values = new ArrayList<>();
  }

  public void put(A key, B value) {
    int index = keys.indexOf(key);

    if (index == -1) {
      keys.add(key);
      values.add(value);
    } else
      values.set(index, value);
  }

  public B get(A key) {
    int index = keys.indexOf(key);

    return index == -1 ? null : values.get(index);
  }

  public B remove(A key) {
    int index = keys.indexOf(key);

    if (index == -1)
      return null;

    B res = values.get(index);
    keys.remove(index);
    values.remove(index);
    return res;
  }

}
