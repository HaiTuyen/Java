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

class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }

    public void reset(){
        start = 0;
        val = 0;
    }

    public int getNext(){
        val += 3;
        return val;
    }
}

class SeriesDemo2{
    public static void main(String argv[]){
        ByTwos twoob = new ByTwos();
        ByThrees threeob = new ByThrees();
        Series ob;
        for(int i = 0; i < 5; i++){
            ob = twoob; //tham chieu den twoob
            System.out.println("Gia tri byTwos tiep theo: " + ob.getNext());

            ob = threeob;   // Series tham chieu den threeob
            System.out.println("Gia tri Bythrees tiep theo: " + ob.getNext());
        }
        
    }
}
