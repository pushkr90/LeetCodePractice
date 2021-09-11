package Summer.Design;

import java.util.*;

public class FileSystem
{
    HashSet<String> set=new HashSet<>();
    HashMap<String, HashSet<String>> directory;
    HashMap<String,String> file;
    public FileSystem()
    {
        directory=new HashMap<>();
        directory.put("/",new HashSet<>());
        file=new HashMap<>();
    }
    public List<String> ls(String path)
    {
        String[]splitted=path.split("/");
        HashSet<String> set=new HashSet<>();
        set= directory.get(splitted[splitted.length-1]);
        return helper(set);

    }
    private List<String> helper(HashSet<String>set)
    {
        List<String> res=new ArrayList<>();
        for(String each:set)
        {
            if(!res.contains(each))
            {
                res.add(each);
            }
        }
        return res;
    }

    public void mkdir(String path)
    {
        String[]splitted=path.split("/");
        for(int i=0;i<splitted.length;i++)
        {
            HashSet<String> set=directory.get("/");
            if(i==0 && set.isEmpty())
            {
                set.add(splitted[0]);
                directory.put("/",set);
                HashSet<String> va=new HashSet<>();
                va.add(splitted[i+1]);
                directory.put(splitted[i],va);
            }
            else if(i<path.length()-1)
            {
               //HashSet<String> set1 =directory.get(splitted[i]);
               if(!directory.containsKey(splitted[i-1]))
               {
                   HashSet<String> res=new HashSet<>();
                   directory.put(splitted[i-1],res);
               }
               HashSet<String> res=directory.get(splitted[i-1]);
               if(!res.contains(splitted[i]))
               {
                   res.add(splitted[i]);
                   directory.put(splitted[i],res);
               }
            }
            else
                {
                HashSet<String> res=new HashSet<>();
                directory.put(splitted[i],res);
            }
        }
    }

    public void addContentToFile(String filePath, String content)
    {
        String[]splitted=filePath.split("/");
        if(!file.containsKey(splitted[splitted.length-1]))
        {
            file.put(splitted[splitted.length - 1], content);
        }else{
            String res=file.get(splitted[splitted.length-1]);
            String res1=res+content;
        }

    }

    public String readContentFromFile(String filePath) {
        return file.get(filePath);

    }
}
