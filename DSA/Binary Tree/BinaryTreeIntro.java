import java.util.*;
import java.io.*;

public class BinaryTreeIntro{

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public static class Pair{
        TreeNode node;
        int state;
    }

    public static TreeNode construct(int arr[]){
        Stack<Pair> st=new Stack<>();
        TreeNode root=new TreeNode();
        root.data=arr[0];

        Pair temp=new Pair();
        temp.node=root;
        temp.state=1;
        st.push(temp);

        for(int i=1;i<arr.length;i++)
        {
            Pair ontop=st.peek();
            if(ontop.state==1)
            {
                if(arr[i]!=-1)
                {
                    TreeNode toleft=new TreeNode();
                    toleft.data=arr[i];
                    ontop.node.left=toleft;

                    Pair tobeadded=new Pair();
                    tobeadded.node=toleft;
                    tobeadded.state=1;
                    st.push(tobeadded);
                }else
                {
                    ontop.node.left=null;
                }
                ontop.state++;
            }else if(ontop.state==2)
            {
                 if(arr[i]!=-1)
                {
                    TreeNode toright=new TreeNode();
                    toright.data=arr[i];
                    ontop.node.right=toright;

                    Pair tobeadded=new Pair();
                    tobeadded.node=toright;
                    tobeadded.state=1;
                    st.push(tobeadded);
                }else
                {
                    ontop.node.right=null;
                }
                ontop.state++;
            }else //state=3
            {
                st.pop();
                i--;
            }
        }
        return root;
    }

    public static void display(TreeNode node)
    {
        if(node==null)
        {
            return;
        }

        String st=node.data+"--";
        if(node.left!=null)
        {
            st+=node.left.data+",";
        }else
        {
            st+=".,";
        }

        if(node.right!=null)
        {
            st+=node.right.data+",";
        }else
        {
            st+=".,";
        }

        System.out.println(st);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args){
        int arr[]={10,12,16,-1,-1,18,-1,-1,14,-1,-1};
        TreeNode root=construct(arr);
        display(root);
    }
}