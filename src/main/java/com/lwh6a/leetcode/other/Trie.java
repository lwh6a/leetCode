package com.lwh6a.leetcode.other;

/**
 * 代码描述: 字典树实现
 *
 * @author liuwenhao
 * @since 2020/8/13 17:37
 */

public class Trie {

    private TrieNode root;

    public Trie(TrieNode root) {
        root = new TrieNode(' ');
        this.root = root;
    }

    public void insert(String word) {
        TrieNode ws = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.childrens[c - 'a'] == null) {
                ws.childrens[c - 'a'] = new TrieNode(c);
            }
            ws = root.childrens[c - 'a'];
        }
        ws.isWord = true;
    }

    public boolean search(String word) {
        TrieNode ws = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.childrens[c - 'a'] == null) {
                return false;
            }
            ws = root.childrens[c - 'a'];
        }
        return ws.isWord;
    }

    public boolean startWith(String prefix) {
        TrieNode ws = root;

        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (ws.childrens[c - 'a'] == null) {
                return false;
            }
            ws = root.childrens[c - 'a'];
        }
        return true;

    }

}
