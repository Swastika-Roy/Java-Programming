package Java.ListInterface.Hashmap;

import java.util.LinkedList;

public class HashmapImplementation {
    static class MyHashmap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_CAPACITY = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node> [] buckets;
        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int SearchInBuckets(LinkedList<Node> ll, K key){
            for (int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        public MyHashmap(){
             initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }

        public void put(K key,V value){
           int bi = HashFunc(key);
           LinkedList<Node> currbuck = buckets[bi];
           int ei = SearchInBuckets( currbuck,key);
           if(ei == -1){
               Node node = new Node(key,value);
               currbuck.add(node);
               n++;
           } else {
               Node currnode = currbuck.get(ei);
               currnode.value = value;
           }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = SearchInBuckets(currBucket,key);
            if(ei != -1){
                Node currnode = currBucket.get(ei);
                return currnode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = SearchInBuckets(currBucket,key);
            if (ei != -1){
                Node currnode = currBucket.get(ei);
                V val = currnode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }
    public static void main(String[] args) {
         MyHashmap<String,Integer> mp = new MyHashmap<>();
         mp.put("a",1);
         mp.put("b", 2);
         mp.put("d",3);
//        System.out.println(mp.size());
        mp.put("b",5);
//        System.out.println(mp.size());
//        System.out.println(mp.get("a"));
//        System.out.println(mp.get("b"));
//        System.out.println(mp.get("d"));
        System.out.println(mp.get("nine"));
        System.out.println(mp.remove("b"));
        System.out.println(mp.remove("b"));
        System.out.println(mp.size());
    }
}
