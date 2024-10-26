package com.example.linkedlist.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.linkedlist.manager.LinkedListManager;

public class LinkedListManagerTest {

    //if we have an empty list, the size should be 0
    @Test
    public void emptyList_size_shouldBeZero()
    {
        LinkedListManager linkedListManager = new LinkedListManager();
        assertEquals(0, linkedListManager.size());
    }

    //if we have a list with one element, the size should be 1
    @Test
    public void listWithOneElement_size_shouldBeOne()
    {
        LinkedListManager linkedListManager = new LinkedListManager();
        linkedListManager.add(1);
        assertEquals(1, linkedListManager.size());
    }
}
