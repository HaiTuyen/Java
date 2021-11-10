interface Iconst{
    int min = 0;
    int max = 10;
    String error = "Loi gioi han";
}

class IconstD implements Iconst {
    public static void main(String args[]){
        int nums[] = new int[max];

    for(int i = min; i < 11;i++)
    {
        if(i >= max)    System.out.println(error);
        else{
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
    }
}
}
// 0 1 2 3 4 5 6 7 8 9 Loi gioi han
