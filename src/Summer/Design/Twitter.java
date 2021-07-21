package Summer.Design;

import java.util.*;

class Twitter
{
    Map<Integer, List<Integer>> follow;//user id - followers userid
    Map<Integer,List<Tweet>> latest;// user id - 10 latestTwettIds
    int count;
    class Tweet
    {
        int userId;
        int time;
        int tweetId;
        public Tweet(int time,int tweetId,int userId)
        {
            this.time=time;
            this.tweetId=tweetId;
            this.userId=userId;
        }
    }
    /** Initialize your data structure here. */
    public Twitter()
    {
        follow=new HashMap();
        // post=new HashMap();
        latest=new HashMap();//
        count=0;
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId)
    {
        count++;
        Tweet tw=new Tweet(count,tweetId,userId);
        if(!latest.containsKey(userId))
        {
            latest.put(userId,new ArrayList<>());
        }
        latest.get(userId).add(tw);
    }


    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId)
    {
        List<Tweet> res1=new ArrayList<>();
        if(latest.containsKey(userId))
        {
            res1.addAll(latest.get(userId));
        }
        List<Integer> ans=new ArrayList<>();
        if(follow.containsKey(userId))
        {
            for (int i = 0; i < follow.get(userId).size(); i++)
            {
                if(latest.containsKey(follow.get(userId).get(i)))
                {
                res1.addAll(latest.get(follow.get(userId).get(i)));
                }
            }
        }

        PriorityQueue<Tweet> pq=new PriorityQueue<>(new Comparator<Tweet>() {
            @Override
            public int compare(Tweet o1, Tweet o2) {
                return o2.time-o1.time;
            }
        });

        for(int i=0;i<res1.size();i++)
        {
            pq.add(res1.get(i));
        }
        int i=0;
        while (i<10 && !pq.isEmpty())
        {
            ans.add(pq.poll().tweetId);
            i++;
        }
        return ans;

    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId)
    {
        System.out.println("followerId"+followerId);
        if(!follow.containsKey(followerId))
        {
            follow.put(followerId,new ArrayList<>());
        }

        List<Integer> followers=follow.get(followerId);
        System.out.println("size"+followers.size());
        boolean found=false;
        for(int i=0;i<followers.size();i++)
        {
            if(followers.get(i)==followeeId) found=true; break;

        }
        if(found==false)
        {
            followers.add(followers.size(),followeeId);
        }
        follow.put(followerId,followers);

    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId)
    {
        System.out.println("followerId in unfollow"+followerId);
        if(follow.containsKey(followerId))
        {
            Set<Integer> followerSet=new HashSet<>(follow.get(followerId));
            System.out.println("size in unfollow"+followerSet.size());
            if(followerSet.contains(followeeId))
            {
                follow.get(followerId).remove((Integer) followeeId);
            }
        }

    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */