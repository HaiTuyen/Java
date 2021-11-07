package bookpack;

public class Extbook extends bookpack.book{
    private String publisher;
    public Extbook(String t, String a, String d, String p){
        super(t,a,d);
        publisher = p;
    }
    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }
    public String getpublisher(){return publisher;}
    public void setpublisher(String p){publisher = p;}
    // Minh hoa code ma truy cap vao duoc
    public String gettitle(){return title;}
    public String getauthor(){return author;}
    //.......
}

class protectdemo{
    public static void main(String argv[]){
        Extbook books[] = new Extbook[2];

        books[0] = new Extbook("The java Course","Thien Huu","2021","TheLight");
        books[1] = new Extbook("The javascript","Khang Ngo","2021","TheLight");
        for(int i = 0; i < books.length; i++)
        {
            books[i].show();
        }
        System.out.println("Cac khoa hoc cua Thien Huu: ");
        for(int i = 0; i < books.length; i++)
            if(books[i].author == "Thien Huu")
                System.out.println(books[i].gettitle());
    }
}
