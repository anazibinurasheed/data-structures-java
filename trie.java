package IIIrdWeakDSA;

public class trie {
    private trienode root = new trienode();
    class trienode{
        private trienode[] children;
        private int wordcount;
        trienode(){
            this.children  = new trienode[26];
            this.wordcount=0;

        }
    }

    void insert( String key){
        if(key==null || key.isEmpty() )return;
         trienode current = root;
         for(int i=0; i<key.length();i++){
            int index = key.charAt(i)-'a';

            if(current.children[index] == null){
                current.children [index] = new trienode();
            }
            current= current.children[index];
         }

         current.wordcount++;

    }

    boolean search(String key){
        trienode current = root;
        for(int i =0; i<key.length();i++){
            int index = key.charAt(i)-'a';


          
            if(current.children[index]==null){
                return false;
            }
            current= current.children[index];
        }
      
        return (current.wordcount==1) ;

    
}
void delete (String key){
    trienode current = root;
    int index=0;
    for(int i = 0 ; i< key.length();i++){
         index = key.charAt(i)-'a';
        if(current.children[index]== null){
           return;
        }
        current = current.children[index];
    }
    for(int i = 0 ; i< 26;i++){
        if(current.children[index]!=null){

        }
    }
}

    public static void main(String[] args) {
        trie trie = new trie();
        trie.insert("cat");
    System.out.println(        trie.search("cat")    );        
    }
    
}
