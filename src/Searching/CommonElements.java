package Searching;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>(), c = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(10);
        a.add(20);
        a.add(40);
        a.add(80);

        b.add(6);
        b.add(7);
        b.add(20);
        b.add(80);
        b.add(100);

        c.add(3);
        c.add(4);
        c.add(15);
        c.add(20);
        c.add(30);
        c.add(70);
        c.add(80);
        c.add(100);

        ArrayList<Integer> al = intersection(a, b, c);
        System.out.println(al.toString());
    }
    private static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b,ArrayList<Integer> c){
        int i = 0, j = 0;
        ArrayList<Integer> d = new ArrayList<>();
        while(i < a.size() && j < b.size()){
            if(a.get(i) < b.get(j)){
                i++;
            }else if(a.get(i) > b.get(j)) {
                j++;
            }else{
                d.add(a.get(i));
                i++;
                j++;
            }
        }
        a.clear();
        i = 0;
        j = 0;
        while(i < d.size() && j < c.size()){
            if(d.get(i) < c.get(j)){
                i++;
            }else if(d.get(i) > c.get(j)){
                j++;
            }else{
                a.add(d.get(i));
                i++;
                j++;
            }
        }
        return a;
    }
}
