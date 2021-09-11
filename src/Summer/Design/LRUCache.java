package Summer.Design;

import java.util.*;

public class LRUCache
{
    Map<Integer,DLinkedList> map;
    int capacity;
    DLinkedList head;
    DLinkedList tail;
    class DLinkedList
    {
        int val;
        int key;
        DLinkedList next;
        DLinkedList prev;
        public DLinkedList(int val,int key)
        {
            this.val=val;
            this.key=key;
        }
        public DLinkedList()
        {

        }
    }

    public LRUCache(int capacity)
    {
        this.capacity=capacity;
        head=new DLinkedList();
        tail=new DLinkedList();
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }

    public void moveToFront(DLinkedList node)
    {
        DLinkedList prev=node.prev;
        DLinkedList next=node.next;
        prev.next=next;
        next.prev=prev;
        addToFront(node);
    }

    public void addToFront(DLinkedList node)
    {
        DLinkedList next=head.next;
        node.next=next;
        next.prev=node;
        node.prev=head;
        head.next=node;
    }
    public void freeSpace()
    {
        if(capacity==0) return;
        else if(capacity== map.size())
        {

            int key=tail.prev.key;
            DLinkedList node=tail.prev.prev;
            node.next=tail;
            tail.prev=node;
            map.remove(key);
        }

    }
    public int get(int key)
    {
        if(!map.containsKey(key)) return -1;
        moveToFront(map.get(key));
        DLinkedList node=map.get(key);
        return node.val;
    }

    public void put(int key,int value)
    {
        if(!map.containsKey(key))
        {
            freeSpace();
            DLinkedList node=new DLinkedList(value,key);
            map.put(key,node);
            addToFront(node);

        }
        else{
            DLinkedList node=map.get(key);
            node.val=value;
            map.put(key,node);
            moveToFront(node);
        }
    }


}


