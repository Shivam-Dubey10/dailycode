import java.util.*;

class TrieNode{
	TrieNode[] child = new TrieNode[26];
	boolean isEnd = false;
	public Character content;
	TrieNode(Character ch) {
		this.content = ch;
	}
}
class Trie{
	TrieNode root;
	public Trie(){
		root=new TrieNode('*');
	}
	public void insert(String word){
		TrieNode curr = root;
		for(int i =0;i<word.length();i++){
			char c = word.charAt(i);
			if(curr.child[c-'a']==null){
				curr.child[c-'a']=new TrieNode(c);
			}
			curr=curr.child[c-'a'];
		}
		curr.isEnd = true;
	}
	public boolean contains(String word){
		TrieNode curr = root;
		for(int i=0;i<word.length();i++){
			char c=word.charAt(i);
			if(curr.child[c-'a']==null){
				return false;	
			}
			curr=curr.child[c-'a'];
		}
		return true;
	}
	/*public TrieNode search(String word){
		TrieNode curr= root;
		for(int i =0;i<word.length();i++){
			char c=word.charAt(i);
			if(curr.child[c-'a']!=null){
				curr=curr.child[c-'a'];
			}
			else{
				return null;
			}
		}
		if(curr==root){
			return null;
		}
		else{
			return curr;
		}
	}*/
	public List<String> search(String searchTxt, TrieNode currentNode, int index) {
                List<String> results = new ArrayList<>();
                Character ch = searchTxt.charAt(index);
                if (currentNode.child[ch - 'a'] == null) {
                    return results;
                }
                currentNode = currentNode.child[ch - 'a'];
                if (index == searchTxt.length() - 1) {
                    findWords(currentNode, new StringBuilder(searchTxt), results);
                    return results;
                }
                return search(searchTxt, currentNode, ++index);
	}
	public void findWords(TrieNode currentNode, StringBuilder sb, List<String> results) {
		for (TrieNode children : currentNode.child) {
                    if (children != null) {
                        if (children.isEnd == true) {
                            results.add(sb.append(children.content).toString());
                        }
                        findWords(children, new StringBuilder(sb).append(children.content), results);
                    }
		}
       }
       public static void main(String[] args){
       	Trie trie = new Trie();
       	trie.insert("add");
       	trie.insert("addd");
       	trie.insert("addition");
       	trie.insert("java");
       }
}
