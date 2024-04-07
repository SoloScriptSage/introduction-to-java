public class GenericArrayClass<T> {
    private final T[] arr;

    public GenericArrayClass(int size) {
        this.arr = (T[]) new Object[size];
    }

    public void set(int ind, T val) {
        arr[ind] = val;
    }

    public T get(int ind) {
        return arr[ind];
    }

    public T[] getArray() {
        return arr;
    }

    public int getSize() {
        return arr.length;
    }

    public static void main(String[] args) {
        GenericArrayClass<Integer> intGen = new GenericArrayClass<>(5);
        for (int i = 0; i < 5; ++i) {
            intGen.set(i, i * 10 + 10);
        }
        System.out.print("Integer of generic array class: ");
        for (int i = 0; i < intGen.getSize(); ++i) {
            System.out.print(intGen.get(i) + " ");
        }
        System.out.println();

        GenericArrayClass<String> strGen = new GenericArrayClass<>(5);
        String[] strings = {"Hello", "I", "Don't", "Understand", "Anything"};
        for (int i = 0; i < 5; ++i) {
            strGen.set(i, strings[i]);
        }
        System.out.print("Strings of generic array class: ");
        for (int i = 0; i < strGen.getSize(); ++i) {
            System.out.print(strGen.get(i) + " ");
        }
        System.out.println();
    }
}
