class ByTwos implements Series{
    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }
    public int getNext(){
        val += 2;
        return val;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }
}

class SeriesDemo{
    public static void main(String argv[]){
        ByTwos ob = new ByTwos();
        for(int i = 0; i < 5; i++)
            System.out.println("Gia tri tiep theo la: " + ob.getNext());
    }
}
