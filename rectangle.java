class Area{
    private int l,b ,area;
    private void area1(){
        area=l*b;
        System.out.println("area of teh rectangle is:"+area);

    }
    void getsdata(int l1,int b2){
        l=l1;
        b=b2;
    }
    void putdata(){
        area1();
    }
}

public class rectangle {
    public static void main(String[] args) {
        Area ob=new Area();
        ob.getsdata(10, 05);
        ob.putdata();
    }
    
}
