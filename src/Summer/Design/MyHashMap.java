package Summer.Design;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap
{
    List<help> list;
    class help{
        private int val;
        private int key;
        public help(int val,int key){
            this.val=val;
            this.key=key;
        }
    }
    public MyHashMap(){
        list=new ArrayList<>();

    }

    public void put(int key,int value){
        for(int i=0;i<list.size();i++)
        {
            if(list.contains(list.get(i)))
            {
                help h=list.get(i);
                h.val=value;
            }
            else{
                help h=new help(value,key);
                list.add(h);
            }

        }

    }
    public int get(int key){
        for(int i=0;i<list.size();i++)
        {
            help h=list.get(i);
            if(h.key==key)
            {
                return h.val;
            }
        }
        return -1;

    }
    public void remove(int key){
        for(int i=0;i<list.size();i++)
        {
            help h=list.get(i);
            if(h.key==key)
            {
                list.remove(list.get(i));
            }
        }

    }

}
