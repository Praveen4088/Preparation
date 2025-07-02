package searching;

public class linearsearchstring {
    public static void main(String[] args) {
        String s="praveen";
        char c='e';
        int ans=search(s,c);
        if(ans==-1){
            System.out.println("element is not found");
        }
        else{
            System.out.println("element is found at index:"+ans);
        }
    }
    static int search(String name,char letter){
        if(name.length()==0){
            return -1;
        }
        else{
            for (int i = 0; i < name.length(); i++) {
                if(letter == name.charAt(i)){
                    return i;
                }

            }
        }
        return -1;
    }
}
