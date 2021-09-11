package Summer.google;

public class StudentAttendanceRecordOne {
    public boolean checkRecord(String s)
    {
        int counA=0;
        int counL=0;
        int i=0;
        while(i<s.length())
        {

            char c=s.charAt(i);


            if(c=='A')
            {
                counA++;
                i++;
                // System.out.println("A - "+counA);
                if(counA>=2) return false;
            }
            else if(c=='L')
            {
                //counL++;
                if(counL>=3)
                {
                    return false;
                }
                while(i<s.length() && s.charAt(i)=='L')
                {
                    counL++;
                    i++;
                    // System.out.println("l -"+counL);
                    if(counL>=3)
                    {

                        return false;
                    }
                }
                counL=0;

            }
            else
            {
                i++;
            }


        }
        return true;

    }
}
