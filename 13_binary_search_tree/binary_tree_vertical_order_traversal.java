//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1


class Pair{
    Node node;
    Integer column;
    Pair(Node node, Integer column){
        this.node = node;
        this.column = column;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<Integer, ArrayList<Integer>>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            ArrayList<Integer> currList = new ArrayList<Integer>();
            if(mp.containsKey(curr.column))
                currList = mp.get(curr.column);
            currList.add(curr.node.data);
            mp.put(curr.column, currList);
            
            if(curr.node.left != null)
                q.add(new Pair(curr.node.left, curr.column-1));
            if(curr.node.right != null)
                q.add(new Pair(curr.node.right, curr.column+1));
        }
        
        for (Map.Entry<Integer, ArrayList<Integer>> entry: mp.entrySet()){
            ans.addAll(entry.getValue());
        }
        return ans;
    }
}