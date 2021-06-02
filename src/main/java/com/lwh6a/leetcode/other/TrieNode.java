package com.lwh6a.leetcode.other;

/**
 * 代码描述: 字典树
 *
 * @author liuwenhao
 * @since 2020/8/13 17:18
 */

public class TrieNode {

    public char var;
    public boolean isWord;
    public TrieNode[] childrens = new TrieNode[26];

    public TrieNode() {
    }

    public TrieNode(char var) {
        TrieNode node = new TrieNode();
        node.var = var;
    }
}
