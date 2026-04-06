import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {

    private ArrayList<E> data;

    public VectorHeap() {
        data = new ArrayList<>();
    }

    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    public E remove() {
        if (data.isEmpty()) return null;

        E min = data.get(0);
        E last = data.remove(data.size() - 1);

        if (!data.isEmpty()) {
            data.set(0, last);
            percolateDown(0);
        }

        return min;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private void percolateUp(int index) {
        int parent = (index - 1) / 2;

        while (index > 0 && data.get(index).compareTo(data.get(parent)) < 0) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void percolateDown(int index) {
        int child;

        while (2 * index + 1 < data.size()) {
            child = 2 * index + 1;

            if (child + 1 < data.size() &&
                data.get(child + 1).compareTo(data.get(child)) < 0) {
                child++;
            }

            if (data.get(index).compareTo(data.get(child)) <= 0) break;

            swap(index, child);
            index = child;
        }
    }

    private void swap(int i, int j) {
        E temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}