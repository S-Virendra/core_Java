public class Access {
   

    int a;
    void set(int a){
        this.a=a;
    }
    void get(){
        System.out.println(a);

    }

    public static void main(String[] args) {
        Access obj=new Access();
        obj.set(10);
        obj.get();
    }
}
    

