package Summer.Design;

import java.util.*;

public class FileSystemTrieImplementation
{
    private class FileNode{
        public Map<String,FileNode> children;
        public Boolean isFile;
        public String fileContent;

        public FileNode(boolean isFile)
        {
            this.isFile=isFile;
            this.children=new HashMap<>();
            this.fileContent="";

        }
    }
    FileNode root;

    public FileSystemTrieImplementation()
    {
        root=new FileNode(false);


    }

    public List<String> ls(String path) {
        String[] splitted=path.split("/");
        FileNode temp=root;
        for(int i=1;i<splitted.length;i++)
        {
            if(temp.children.containsKey(splitted[i]))
            {
                temp=temp.children.get(splitted[i]);
                continue;
            }
        }
        List<String> res=new LinkedList<>();
        if(temp.isFile==true)
        {
            res.add(splitted[splitted.length-1]);
            return res;
        }

        for(String key:temp.children.keySet())
        {
            res.add(key);

        }
        Collections.sort(res);
        return res;


    }

    public void mkdir(String path) {
        String[] splitted=path.split("/");
        FileNode temp=root;
        for(int i=1;i<splitted.length;i++)
        {
            if(temp.children.containsKey(splitted[i]))
            {
                temp=temp.children.get(splitted[i]);
                continue;
            }
            FileNode newNode=new FileNode(false);
            temp.children.put(splitted[i],newNode);
            temp=newNode;
        }

    }

    public void addContentToFile(String filePath, String content) {
        String[]splitted=filePath.split(filePath);
        FileNode temp=root;
        for(int i=1;i<splitted.length;i++)
        {
            if(temp.children.containsKey(splitted[i]))
            {
                temp=temp.children.get(splitted[i]);
                continue;
            }
            FileNode newNode=new FileNode(i==splitted.length-1);
            temp.children.put(splitted[i],newNode);
            temp=newNode;
        }
        temp.fileContent +=content;

    }

    public String readContentFromFile(String filePath) {
        String[] splitted=filePath.split("/");
        FileNode temp=root;
        for(int i=1;i<splitted.length;i++)
        {
            if(temp.children.containsKey(splitted[i]))
            {
                temp=temp.children.get(splitted[i]);
                continue;
            }
        }
        return temp.fileContent;

    }
}
