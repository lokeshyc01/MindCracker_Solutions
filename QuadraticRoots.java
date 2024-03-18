import java.util.ArrayList;

public class QuadraticRoots {

    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        int root1 = 0 , root2 = 0;

        int temp = (int)(Math.pow(b,2) - 4 * a * c);

        if(temp < 0)
        {
            list.add(-1);
        }
        else
        {
            root1 = (int)Math.floor((-1 * b + Math.sqrt(temp)) / (2*a));
            root2 = (int)Math.floor((-1 * b - Math.sqrt(temp)) / (2*a));

            list.add(Math.max(root1,root2));
            list.add(Math.min(root1,root2));

        }
        return list;
    }

    public static void main(String[] args) {

    }
}
