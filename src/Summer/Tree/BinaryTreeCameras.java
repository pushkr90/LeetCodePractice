package Summer.Tree;

import Summer.Others.TreeNode;

public class BinaryTreeCameras {
    enum State{
        Camera,
        Monitored,
        NonMonitored
    };
    class Status{
        int CameraCount;
        State s;
        public Status(int cameraCount,State s)
        {
            this.s=s;
            this.CameraCount=cameraCount;
        }
    }
    public int minCameraCover(TreeNode root)
    {
        Status st= getStatus(root);

        return st.CameraCount;
    }
    private Status getStatus(TreeNode node)
    {

        if(node==null)
        {
            return new Status(0,State.Monitored);
        }
        Status left=getStatus(node.left);
        Status right=getStatus(node.right);
        Status curr=new Status(left.CameraCount+right.CameraCount,State.NonMonitored);
        if(left.s==State.NonMonitored ||right.s==State.NonMonitored)
        {
            curr.CameraCount++;
            curr.s=State.Monitored;
        }
        if(left.s==State.Camera||right.s==State.Camera)
        {
            curr.s=State.Monitored;
        }
        return curr;

    }
}
