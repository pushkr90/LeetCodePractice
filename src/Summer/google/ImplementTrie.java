package Summer.google;

public class ImplementTrie {
    class trie
    {
        trie children[];
        boolean word;
        public trie() {
            children = new trie[26];
            word = false;
        }
    }
    trie root;

    public ImplementTrie()
    {
        root=new trie();
    }

    public void insert(String word){
        trie curr=root;
        for(char each:word.toCharArray())
        {
            int index=each-'a';
            if(curr.children[index]==null)
            {
                curr.children=new trie[26];
            }
            curr=curr.children[index];
        }
        curr.word=true;
    }

    public boolean search(String word)
    {
        trie curr=root;
        for(char each:word.toCharArray())
        {
            int index=each-'a';
            if(curr.children[index]==null)
            {
                return false;
            }
            curr=curr.children[index];
        }
        return curr.word;
    }
    public boolean startsWith(String prefix)
    {
        trie curr=root;
        for(char each:prefix.toCharArray())
        {
            int index=each-'a';
            if(curr.children[index]==null)
            {
                return false;
            }
            curr=curr.children[index];
        }
        return true;

    }


}
