//https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1



class Activity{
    int start;
    int end;
    Activity(int a,int b){
        this.start = a;
        this.end = b;
    }
}

class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        Activity[] activities = new Activity[n];
        for(int i=0;i<n;i++){
            activities[i] = new Activity(start[i],end[i]);
        }
        Arrays.sort(activities,(x,y)->x.end-y.end);
        int count = 0;
        int currEnd = 0;
        for(int i=0;i<n;i++){
            if(activities[i].start > currEnd){
                count++;
                currEnd = activities[i].end;
            }
        }
        return count++;
    }
}

