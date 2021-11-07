package bookpack;

public class book {
    protected String author;
    protected String title;
    protected String date;
    public book(String t, String a, String d)
    {
        author = a;
        title = t;
        date = d;
    }
    public void show()
    {
        System.out.println();
        System.out.println(title);
        System.out.println(author);
        System.out.println(date);
    }
}


