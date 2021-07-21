package Summer.Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignTwetter
{
    Map<Integer,List<Integer>> follow;
    Map<Integer,Integer> post;
    Map<Integer,List<Integer>> latest;
    public DesignTwetter()
    {
        follow=new HashMap<>();
//        post=new HashMap<>();
        latest=new HashMap<>();
    }
    public void postTweet(int userId,int tweetId)
    {
       post.put(userId,tweetId);
       List<Integer>usersFollowers=follow.get(userId);
       List<Integer>latestTweetIds=latest.get(userId);
       if(latestTweetIds.size()>9)
       {
           latestTweetIds.remove(latestTweetIds.size()-1);
       }
       latestTweetIds.add(tweetId);
       for(int i=0;i<usersFollowers.size();i++)
       {
           int followerId=usersFollowers.get(i);
           List<Integer> followersTweetIds=latest.get(followerId);
           if(followersTweetIds.size()>9)
           {
               followersTweetIds.remove(followersTweetIds.size()-1);
           }
           followersTweetIds.add(tweetId);
       }
    }

    List<Integer> getNewsFeed(int user)
    {
       return latest.get(user);
    }

    public void follow(int followerId, int followeeId)
    {
        List<Integer> followers=follow.get(followerId);
        boolean found=false;
        for(int i=0;i<followers.size();i++)
        {
            if(followers.get(i)==followeeId) found=true; break;

        }
        if(found==false)
        {
            followers.add(followers.size(),followeeId);
        }

    }
    public void unfollow(int followerId, int followeeId)
    {
        List<Integer> followers=follow.get(followerId);
        for(int i=0;i<followers.size();i++)
        {
            if(followers.get(i)==followeeId)
            {
                followers.remove(i);
            }
        }
        follow.put(followeeId,followers);
    }

}
