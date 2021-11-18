package bai10.ArrayListExercise;

public class MyList<E> {
    private int size = 0;
    private Object[] elements;

    public static final int DEFAULT_CAPACITY = 10;

    public MyList() {
    }

    public MyList(int capacity) {;

    }
    public void add(int index, E element){
        Object[] arrList = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            arrList[i] = elements[i];
        }
        arrList[arrList.length -1] = elements;
    }
    
    public E remove(int index){
        Object[] newArr = new Object[elements.length - 1];
        for (int i = 0; i < elements.length; i++) {
            if (index > 0) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        return (E) newArr;
    }
    public int size(){
        size = elements.length;
        return size;
    }
}
