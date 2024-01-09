//https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1


class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int capacity, Item arr[], int n) 
    {
        PriorityQueue<Item> pq = new PriorityQueue<Item>(n, new ItemComparator());
        for(Item i: arr)
            pq.add(i);
        
        double total_value = 0;
        while (!pq.isEmpty())
        {
            Item top = pq.poll();
            if (top.weight <= capacity)
            {
                total_value += top.value;
                capacity -= top.weight;
            }
            else
            {
                total_value += (double)top.value / top.weight * capacity;
                return total_value;
            }
        }
        return total_value;
    }
}


class ItemComparator implements Comparator<Item>{
    public int compare(Item min, Item max) {
        return (double)max.value / max.weight > (double)min.value / min.weight ? 1 : -1;
    }
}