package com.extraClasses;

import java.util.HashMap;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.setChildren(new HashMap<>());
        // root.getChildren().computeIfAbsent('\0', n -> new TrieNode());
    }

    /***
     *
     * @param word insert targetted word into Trie
     */
    public void insert(String word) {
        TrieNode current = root;

        for(char c : word.toCharArray()) {
            // System.out.println("Char: " + c);
            // System.out.println("current: " + current.getChildren());
            if (current.getChildren() == null) {
                current.setChildren(new HashMap<>());
            }
            current = current.getChildren().computeIfAbsent(c, n -> new TrieNode());
            // System.out.println("current: " + current.getChildren());
        }
        current.setEndOfWord(true);
    }

    /***
     *
     * @param word to search for
     * @return true if targetted word is found, else false
     */
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            TrieNode temp = current.getChildren().get(c);
            if (temp == null) {
                return false;
            }
            current = temp;
        }

        return true;
    }

    /***
     *
     * @return longest common prefix for the current Trie data structure
     */
    public String commonPrefix() {
        StringBuilder strBuilder = new StringBuilder();
        TrieNode current = root;
        // System.out.println("size = " + current.getChildren().size());
        // current.getChildren().entrySet().forEach(System.out::println);
        while (current.getChildren().size() == 1) {
            // System.out.println("in the loop");
            if (current.getChildren().size() == 1) {
                // System.out.println("Target ok");
                strBuilder.append(current.getChildren().keySet().stream().findFirst().get());
                current = current.getChildren().values().stream().findFirst().get();
            } else {
                // System.out.println("Target not ok");
                strBuilder = new StringBuilder("");
                break;
            }
        }

        // System.out.println("common Prefix: " + strBuilder.toString());
        return strBuilder.toString();
    }

    public boolean isEmpty() {
        return root.getChildren().isEmpty();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void setRoot(TrieNode root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "Trie{" +
                "root=" + root +
                '}';
    }
}
