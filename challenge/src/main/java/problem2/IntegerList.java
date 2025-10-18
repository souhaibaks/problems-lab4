package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentSize;//the current size of the list
    int currentNum;//the current number of integers in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize=size;
        currentNum=size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<currentNum; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        currentSize=currentSize*2;
        int[]newList = new int[currentSize];
        System.arraycopy(list,0,newList,0,list.length);
        list=newList;

    }
    public void addElement(int newVal){
        if (currentNum<currentSize){
            list[currentNum]=newVal;
            currentNum++;
        }
        else{
            increaseSize();
            addElement(newVal);
        }
    }
    public void removeFirst(int newVal){
        int index=-1;
        for(int i=0; i<list.length; i++){
            if(list[i]==newVal){
                index=i;
                break;
            }
        }
        if (index!=-1){
            currentNum--;
            for(int i=index; i<currentNum; i++){
                list[i]=list[i+1];
            }
        }

    }
    public void removeALL(int newVal){
        int index=-1;
        for(int i=0; i<list.length; i++){
            if(list[i]==newVal){
                index=i;
                if (index!=-1){
                    currentNum--;
                    for(int j=index; j<currentNum; j++){
                        list[j]=list[j+1];
                    }
            }
        }

        }
    }


}