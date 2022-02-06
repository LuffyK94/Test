

public class SetArrayString {
    private int size=0;
    String[] array = new String[size];

    private boolean contains(String s){
        for(int i=0; i<array.length;i++){
            if(array[i]==(s)){
                return true;
            }
        }
        return false;
    }

    public void addElements(String s){
        if(!contains(s)){
            if(size== array.length)
                sizeIncrease();
            array[size]=s;
            size++;
        }
    }

    public boolean deleteElement(String s){

            for(int i=0;i< array.length;i++){
                if(array[i]==s){
                    for(int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                    }
                    size--;
                    resetArray(size);
                    return true;
                }
            }
        return false;
    }

    private void resetArray(int size2){
        String y[] = new String[size2];
        for(int i=0;i< size2;i++){
            y[i]=array[i];
        }
        array = y;
    }

    private void sizeIncrease(){
        String y[]= new String[array.length+1];
        for(int i=0;i< array.length;i++){
            y[i]=array[i];
        }
        array=y;
    }

    public String[] viewElements(){
        return array;
    }


}
