public class MyArrayListMain {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        MyArrayList<Integer> myArrayList = new MyArrayList<>(array);

        myArrayList.add(54);
        myArrayList.add(6);
        myArrayList.add(5);
        myArrayList.add(9);

        System.out.println(myArrayList.get(0));
        //myArrayList.set(5, 23); // error
        //myArrayList.remove(5); // error
    }
}
