package repeatweakdsa2;



public class hashtable {
    private int length ; 
    private HashNode[] buckets;
    private int numofbuckets;

    hashtable(){
     this.   numofbuckets= 10;
      this.  length = 0; 
      this.  buckets = new HashNode [numofbuckets];
    }

    class HashNode{
        Integer key;
        String value;
        HashNode next;

        HashNode (Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
    
    void put(Integer key, String value){
        if(key.equals(null)){
            throw new IllegalArgumentException("Enter a valid key");
        }

        int bucketindex = getBucketIndex(key);
        HashNode head = buckets[bucketindex];
        while (head!=null) {
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head= head.next;
        }

        HashNode node = new HashNode(key, value);
        length++;
        head= buckets[bucketindex];
        node.next = head;
        buckets[bucketindex]=node;


        
    } 
    String get (Integer key ){
        
        int bucketIndex  = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head !=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
    return null;
    }

    void remove (Integer key){
        int bucketindex = getBucketIndex(key);
        HashNode head = buckets[bucketindex];
        HashNode prev= null;
        while (head !=null) {
            if(head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;


            
        }
        if (head==null){
            throw new IllegalArgumentException();
        }
        if (prev==null){
            buckets[bucketindex] = head.next;
        }else{
            prev.next = head.next;
        }
        length--;
        return ;
    }

        boolean isEmpty(){
            return length==0;
        }

   int  getBucketIndex(Integer key ){
        return key%numofbuckets;
    }
    public static void main(String[] args) {
        hashtable table = new hashtable();
        table.put(85, "Anaz Ibinu Rasheed");
        table.put(9, " Ibinu Rasheed");
        table.put(5, " Rasheed");
        System.out.println();
        System.out.println(table.get(85));

    }
}
