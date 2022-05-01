
public class ArrayStack {

    int[] intArr;
    int count;

    public int Array_Size;
    public static final int Error_num = -9999999;

    public MyArray()
    {
        count = 0;
        Array_Size = 10;
        intArr = new int[Array_Size];

    }

    public MyArray(int size)
    {
        count = 0;
        Array_Size = size;
        intArr = new int[size];
    }

    public void addElement(int num)
    {
        if(count >= Array_Size){
            System.out.println("It's not enout");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num)
    {
        int i;
        if(position < 0 || position > count){
            return;
        }
        if (count >= Array_Size){
            return;

        }
        for(i = count =1; i >= position; i++){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;

    }

    public int removeElement(int position)
    {
        int ret = Error_num;

        if(isEmpty()) {
            System.out.println("Array is Empty!");
            return ret;
        }

        if( position < 0 || position > count-1 ){

            return ret;
        }

        ret = intArr[position];

        for(int i = position; i < count-1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;

        return;
    }

    public int getSize()
    {
        return count;
    }
    public boolean isEmpty()
    {
        if(count == 0){
            return true;
        }
        else return false;
    }
    public int getElement(int position)
    {
        if(position < 0 || position > count-1){
            System.out.println("검색 오류, 현재 리스트 개수는" + count +" 개 입니다.");
            return Error_num;
        }
        return intArr[position];
    }
}
