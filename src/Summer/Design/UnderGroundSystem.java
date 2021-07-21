package Summer.Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnderGroundSystem
{
    Map<Integer, Person> checkInMap=new HashMap<>();//A: 3 6  4 7
    Map<String,String> averageMap=new HashMap<>();// sanjose,sf  : (33,11)

    class Person
    {
        private int id;
        private String stationName;
        private int time;

        public Person(int id,String stationName,int time)
        {
            this.id=id;
            this.stationName=stationName;
            this.time=time;
        }
    }
    class Average
    {
        private int totalDifferenceTime;
        private double totalPassenger;

        public Average (int totalTime,double totalPassenger)
        {
            this.totalPassenger=totalPassenger;
            this.totalDifferenceTime=totalDifferenceTime;

        }

    }

    public UnderGroundSystem()
    {
        checkInMap =new HashMap<>();
        averageMap =new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t)
    {
        Person p=new Person(id,stationName,t);

        checkInMap.put(id,p);
    }

    public void checkOut(int id, String stationName, int t)
    {
        Person checkinOut=checkInMap.get(id);
        int checkInTime=checkinOut.time;
        int timeDifferece=t-checkInTime;
        if(averageMap.containsKey(checkinOut.stationName+","+stationName))
        {
            String res=averageMap.get(checkinOut.stationName+","+stationName);
            String[] split=res.split(",");
            int re1=Integer.parseInt(split[0])+timeDifferece;
            int re2=Integer.parseInt(split[1])+1;
            averageMap.put(checkinOut.stationName+","+stationName,re1+","+re2);
        }else{
            String res=checkinOut.stationName+","+stationName;
            String val=timeDifferece+","+1;
            averageMap.put(res,val);
        }
        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation)
    {
        String split1=averageMap.get(startStation+","+endStation);
        String[] splitted=split1.split(",");
        Double total;
        Double totaltime=Double.parseDouble(splitted[0]);
        Double totalCount=Double.parseDouble(splitted[1]);
        total=totaltime/totalCount;
        return total;
    }
}
