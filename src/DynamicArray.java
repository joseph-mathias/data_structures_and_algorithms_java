
public class DynamicArray {
    
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);
        // System.out.println(dynamicArray.capacity);
        dynamicArray.add("Q");
        dynamicArray.add("W");
        dynamicArray.add("E");
        dynamicArray.add("R");
        dynamicArray.add("Y");
        dynamicArray.add("U");

        dynamicArray.insert(1, "L");
        System.out.println(dynamicArray.search("E"));
        dynamicArray.delete("Q");
        dynamicArray.delete("W");
        dynamicArray.delete("R");
        dynamicArray.delete("U");
        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }



    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data){
                return 1;
            }
        }
        return -1;
    }
    private void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data){
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }else{
            string = "[]";
        }
        return string;
    }


}
