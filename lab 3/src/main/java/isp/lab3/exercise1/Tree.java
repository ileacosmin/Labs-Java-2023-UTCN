package isp.lab3.exercise1;

public class Tree {
    private int height;
    public Tree(){
        height=15;
    }
    public int Grow(int meters){
        if(meters>=1)
            this.height+=meters;
        return height;
    }
    @Override
    public String toString(){
        return "The height of the tree is " +this.height;
    }

    public static void main(String[] args){
        Tree t=new Tree();
        t.Grow(4);
        String tr=t.toString();
        System.out.println(tr);
    }
}
