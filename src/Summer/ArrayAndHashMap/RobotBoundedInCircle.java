package Summer.ArrayAndHashMap;

public class RobotBoundedInCircle
{
    enum Directions{
        North,
        West,
        East,
        South
    }
    public boolean isRobotBounded(String instructions)
    {

        Directions direction=Directions.North;
        int x=0;int y=0;


        for(char ch: instructions.toCharArray())
        {
            if(ch=='G')
            {
                switch (direction)
                {
                    case North:
                        y++;
                        break;
                    case East:
                        x++;
                        break;
                    case West:
                        x--;
                        break;
                    case South:
                        y--;
                        break;
                }
            }
               else if(ch=='R')
                {
                    switch (direction)
                    {
                        case North:
                            direction=Directions.East;
                            break;
                        case South:
                            direction=Directions.West;
                            break;
                        case East:
                            direction=Directions.South;
                            break;
                        case West:
                            direction=Directions.North;
                            break;

                    }
                }
                else if(ch=='L')
                {
                    switch (direction)
                    {
                        case North:
                            direction=Directions.West;
                            break;
                        case South:
                            direction=Directions.East;
                            break;
                        case East:
                            direction=Directions.North;
                            break;
                        case West:
                            direction=Directions.South;
                            break;
                    }
                }

            }

        if(x==0 && y==0) return  true;
        if(direction==Directions.North) return  false;
        return true;

    }
}
