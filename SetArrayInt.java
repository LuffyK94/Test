public class SetArrayInt {

    private int size=1;
    private int[] listA= new int[size];
    private int next =0;

    private boolean contains(int x){
        for(int i=0; i<listA.length; i++){
            if(listA[i]==x){
                return true;
            }
        }
        return false;
    }

    public void addElement(int x){
        if(listA.length>size){
            if(!contains(x)){
                listA[next] = x;
                next++;
                size++;
            }
        }
        else{
            size();
            addElement(x);
        }
    }

    public void viewElements(){
        for(int i=0; i< size-1; i++){
            System.out.print(listA[i]+" ");
        }
    }

    public boolean deleteElement(int x){
        for(int i=0; i<listA.length;i++){
            if(listA[i]==x){
                for(int j=i;j< listA.length-1;j++){
                    listA[j]=listA[j+1];
                }
                size = size - 1;
                return true;
            }
        }

        return false;
    }

    private void size(){
        int[] y = new int[listA.length+1];
        for(int i=0; i<listA.length;i++){
            y[i] = listA[i];
        }
        listA=y;
    }

    public static void main(String[] args){

        SetArrayInt setArray = new SetArrayInt();
        setArray.addElement(1);
        setArray.addElement(2);
        setArray.addElement(2);
        setArray.addElement(3);
        setArray.addElement(2);
        setArray.addElement(3);
        setArray.addElement(1);
        setArray.addElement(4);

        setArray.viewElements();

        System.out.println("");
        setArray.deleteElement(3);
        setArray.viewElements();
    }


}
