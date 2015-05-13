package tree;
public class Node<T> {
	
	//instance variables
	private char ch;
	private int freq;
	private Node<T> lchild, rchild;
	
	public Node(char ch, int freq, Node<T> lchild, Node<T> rchild )
	{
		ch = ch;
		freq = freq;
		lchild = lchild;
		rchild = rchild;
	}
	
	public String display() 
	{
		return "(char = " + ch + ", freq = " + freq + ")\n"; 
	}
}