package part2;

public class CustomArrayList<E> {
    private static final int INIT_SIZE = 12;
    private int size;
    private int pointer;
    private Object[] objectArray;

    public CustomArrayList() {
        objectArray = new Object[INIT_SIZE];
        this.size = INIT_SIZE;
        this.pointer = 0;
    }

    public CustomArrayList(int size) {
        if (size >= 0) {
            this.size = size;
            objectArray = new Object[this.size];
            this.pointer = 0;
        } else {
            throw new IllegalArgumentException("Wrong argument");
        }
    }

    public CustomArrayList(E[] list) {
        objectArray = list;
    }

    private void checkSize() {
        if (pointer == objectArray.length - 1) {
            objectArray = resizeArray(objectArray);
            size = objectArray.length;
        }
    }

    private boolean checkIndexInRange(int idx) {
        return (idx < objectArray.length);
    }

    private Object[] resizeArray(Object[] arrayToResize) {
        Object[] tempArray = new Object[(int) (arrayToResize.length * 1.6)];

        for (int i = 0; i < arrayToResize.length; i++) {
            tempArray[i] = arrayToResize[i];
        }

        return tempArray;
    }

    public int size(){
        return pointer;
    }

    public void add(E elem) {
        checkSize();
        objectArray[pointer++] = elem;
    }

    public E get(int idx) {
        if (checkIndexInRange(idx)) {
            return (E) objectArray[idx];
        }
        throw new IndexOutOfBoundsException(idx + " is out of bound");
    }
}
