
public class Arithmetic{
    private int x;
    private int y;
    public Arithmetic(int currentx,int currenty){
        x=currentx;
        y=currenty;
    }
    public int sum(){
        int res=x+y;
        return res;
    }
    public int mult(){
        int res=x*y;
        return res;
    }
    public int max(){
        int res=x>=y ?
                res=x:y;
        return res;
    }
    public int min(){
        int res=x>=y ?
                res=y:x;
        return res;
    }
}
