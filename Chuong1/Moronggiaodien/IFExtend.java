interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

class Execute implements B{
    public void meth1(){
        System.out.println("Thuc thi meth1()");
    }

    public void meth2(){
        System.out.println("Thuc thi meth2()");
    }

    public void meth3(){
        System.out.println("Thuc thi meth3()");
    }
}

class IFExtend{
    public static void main(String args[]){
        Execute ob = new Execute();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

// Thuc thi meth1()
// Thuc thi meth2()
// Thuc thi meth3()
