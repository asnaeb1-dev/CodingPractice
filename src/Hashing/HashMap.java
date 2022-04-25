package Hashing;

public class HashMap {

    //this is the basic implementation
    class HashMapImp1{

        boolean[] keyA;
        int[] val;

        int MAX_ARR_SIZE = 1000000;

        public HashMapImp1(){
            keyA = new boolean[MAX_ARR_SIZE];
            val = new int[MAX_ARR_SIZE];
        }

        public void add(int key, int value){
            keyA[key] = true;
            val[key] = value;
        }

        public int get(int key){
            if(!keyA[key]) return -1;
            return val[key];
        }

        public void remove(int key){
            keyA[key] = false;
            val[key] = 0;
        }
    }

    class HashMapImp2{

    }
}
