package datastructure.trie;

import java.util.HashMap;

class Node {
    HashMap<Character, Node> child;
    boolean isTerminal;

    public Node() {
        child = new HashMap<>();
        isTerminal = false;
    }
}

public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String str) {
        Node cur = this.root;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            cur.child.putIfAbsent(c, new Node());
            cur = cur.child.get(c);

            if (i == str.length() - 1) {
                cur.isTerminal = true;
                return;
            }
        }
    }

    public boolean search(String str){
        Node cur = this.root;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (cur.child.containsKey(c)){
                cur = cur.child.get(c);
            }else {
                return false;
            }

            if (i == str.length() -1){
                if (!cur.isTerminal){
                    return false;
                }
            }
        }
        return true;
    }

    public void delete(String str){
        boolean ret = delete(root,str,0);
        if (ret){
            System.out.println(str+"삭제완료");
        }else {
            System.out.println(str+"단어가 없습니다.");
        }
    }

    public boolean delete(Node node,String str,int idx){
        char c = str.charAt(idx);

        if (!node.child.containsKey(c)){
            return false;
        }

        Node cur = node.child.get(c);
        idx++;

        if (idx == str.length()){
            if (!cur.isTerminal){
                return false;
            }

            cur.isTerminal = false;
            if (cur.child.isEmpty()){
                node.child.remove(c);
            }
        }else {
            if (!delete(cur,str,idx)){
                return false;
            }

            if (!cur.isTerminal && cur.child.isEmpty()){
                node.child.remove(c);
            }
        }
        return true;
    }
}
