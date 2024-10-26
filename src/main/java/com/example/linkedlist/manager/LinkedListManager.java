package com.example.linkedlist.manager;

public class LinkedListManager {

    private int size;

    public int size()
    {
        return size;
    }

    public boolean add(int payload)
    {
        size++;
        return true;
    }
}
