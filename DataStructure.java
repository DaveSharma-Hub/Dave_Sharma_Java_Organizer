package DOP;

public class DataStructure {
	public Node head;
	public Node current;
	 
	public DataStructure(int val) {
		this.head=new Node();
		this.head.value=val;
		this.current=head;
	}
	
	public void Insert(int val) {
		this.current=this.head;
		Node tmp=Choose(val);
		System.out.println(tmp.value);
	}
	public Node Choose(int val) {
		
	
		while(true) {
			
			if(current.value<val) {
				if(current.right!=null) {
					current=current.right;
				}
				else {
					current.right=new Node();
					current.right.value=val;
					return current.right;
				}
				
			}
			else if(current.value>=val) {
				if(current.left!=null) {
					current=current.left;
				}
				else {
					current.left=new Node();
					current.left.value=val;
					return current.left;
				}
				
			}
			
			
		}
		
		
		/*
		if(current.value<val && current.right==null) {
			this.current.right=new Node();
			this.current.right.value=val;
			return this.current.right;
		
		}
		
		if(current.value>=val && current.left==null) {
			this.current.left=new Node();
			this.current.left.value=val;
			return this.current.left;
		}
		
		if(current.value<val && current.right!=null) {
			current=current.right;
			tmp=Choose(val);
		}
		if(current.value>=val && current.left!=null) {
			current=current.left;
			tmp=Choose(val);
		}
		*/
		
		
	}
	int height=0;
	public void breadthFirst() {
	this.height();
		
		
	}
	public void height() {
		
	
	}
	public void printAll() {
		
		
	}
	
	
	public void print() {
		this.current=this.head;
		Node tmp=goThroughAll(this.current);
		
	}
	public Node goThroughAll(Node tmp) {
		
		if(tmp.left==null) {
			System.out.println(tmp.value);
			return tmp;
		}
		if(tmp.right==null) {
			System.out.println(tmp.value);
			return tmp;	
		}
		
		Node tmp1=goThroughAll(current.left);
		Node tmp2=goThroughAll(current.right);

		return tmp1;
			
	
		
		/*
		if(this.current.left==null) {
			System.out.println(this.current.value);
		}
		else if(this.current.left!=null) {
		this.current=this.current.left;
		goThroughAll();
		}
		if(this.current.right==null) {
			System.out.println(this.current.value);
		}
		else if(this.current.right!=null) {
		this.current=this.current.right;
		goThroughAll();
		}
		*/
	}

}

class Node{
	
	public int value;
	public Node left;
	public Node right;
}



