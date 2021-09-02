package DOP;

class binary{
    
    public Node head;
    public Node current;
    
    public binary(int val){
        head=new Node();
        head.value=val;
        current=head;
    }
    
    public void Binary(int val){
        current=head;
        Node holder=search(val);
        
        if(holder.value<val){
            if(holder.right==null){
                holder.right=new Node();
                holder.right.value=val;
            }
            else{
                if(holder.right.value>val){
                    Node tmp=holder.right;
                    holder.right=new Node();
                    holder.right.value=val;
                    holder.right.right=tmp;
                }
            }
        }
        else{
            if(holder.left==null){
                holder.left=new Node();
                holder.left.value=val;
            }
            else{
                if(holder.left.value<=val){
                    Node tmp=holder.left;
                    holder.left=new Node();
                    holder.left.value=val;
                    holder.left.left=tmp;
                }
            }
        }
    }
    public Node search(int val){
        
        if(val>current.value){
            if(current.right!=null){
                if(current.right.value>val){
                    return current;
                }
                else{
                    current=current.right;
                    return search(val);
                }
            }
            else{
                return current;
            }
        }
        else{
            if(current.left!=null){
                if(current.left.value<=val){
                    return current;
                }
                else{
                    current=current.left;
                    return search(val);
                }
            }
            else{
                return current;
            }
        }
    }
    
    public void print(){
        current=head;
        int value=printAll();
        if(value!=Integer.MIN_VALUE){
            System.out.println(value);
        }
    }
    
    public int printAll(){
        
        if(current.left==null){
            return current.value;
        }
        else if (current.right==null){
            return current.value;
        }
        if(current.left!=null){
            current=current.left;
            return printAll();
            
        }
        else if(current.right!=null){
            current=current.right;
            return printAll();
        }
        
        return Integer.MIN_VALUE;
    }
    
}
/*
class Node{
    public Node right;
    public Node left;
    public int value;
    
}
*/