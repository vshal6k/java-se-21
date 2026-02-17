package practice;

public sealed class B extends A permits C,D{
    int x;

    public B(){
        
    }

    void aMethod(){

    }

    public B(int x){
        this.x = x;
    }

    // void bMethod(){
    //     super.aMethod();
    // }
}
