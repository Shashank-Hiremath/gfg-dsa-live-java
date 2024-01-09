//https://leetcode.com/problems/find-median-from-data-stream/description/

class MedianFinder {
    //Max heap
    PriorityQueue<Integer> left = new PriorityQueue<Integer>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<Integer>(); //Min heap

    public MedianFinder() {    
        left = new PriorityQueue<Integer>(Collections.reverseOrder());
        right = new PriorityQueue<Integer>();
        while(!left.isEmpty()){
            left.poll();
        }
        while(!right.isEmpty()){
            right.poll();
        }
    }
    
    public void addNum(int num) {
        left.add(num);
        if(!right.isEmpty()){
            left.add(right.poll());
        }
        while(left.size()-right.size() > 1){
            right.add(left.poll());
        }
    }
    
    public double findMedian() {
        if((left.size() + right.size()) % 2 == 1){
            return left.peek();
        }
        return (left.peek() + right.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */