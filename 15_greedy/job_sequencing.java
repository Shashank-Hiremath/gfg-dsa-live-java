//https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
//Optimal version to explore further: https://www.geeksforgeeks.org/job-sequencing-problem-using-disjoint-set/


class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
       //Sorting according to profit so that max profit job will be done first
       Arrays.sort(arr,(a,b)->(b.profit-a.profit));
       int max=0;
       for(int i=0;i<n;i++){
           max=Math.max(arr[i].deadline,max);
       }
       int res[] = new int [max+1];
       for(int i=0;i<=max;i++){
           res[i]=-1; //-1 indicates slot is free
       }
       int totalJobs=0,totalProfit=0;
       for(int i=0;i<n;i++){ //arr is sorted according to max profit
           for(int j=arr[i].deadline;j>0;j--){
               if(res[j]==-1){ //free slot is found
                   res[j]=i;
                   totalJobs++;
                   totalProfit+=arr[i].profit;
                   break;
               }
           }
       }
       
       int ans[] = new int[2];
       ans[0]=totalJobs;
       ans[1]=totalProfit;
       return ans;
    }
}
