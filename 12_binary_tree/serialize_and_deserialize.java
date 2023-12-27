//https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1



class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root);
	    Node curr = root;
	    while(!q.isEmpty())
	    {
	        curr = q.poll();
	        if(curr != null)
	        {
	            A.add(curr.data);
	            q.add(curr.left);
	            q.add(curr.right);
	        }
	        else
	            A.add(-1);
	    }
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        Node root = new Node(A.get(0));
        Node curr = root;
        int i=1, size;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            curr = q.poll();
            if(A.get(i) != -1)
            {
                curr.left = new Node(A.get(i));
                q.add(curr.left);
            }
            else
                curr.left = null;
            i++;
            
            if(A.get(i) != -1)
            {
                curr.right = new Node(A.get(i));
                q.add(curr.right);
            }
            else
                curr.right = null;
            i++;
        }
        return root;
    }
};