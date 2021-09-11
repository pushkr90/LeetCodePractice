package Summer.TeslaOnlineCoding;

public class LexigraphicallySmallestStringFormedByRemovingAtMostOneCharacter {
    public String make(String S)
    {
        int i=0;
        for(;i<S.length()-1;i++)
        {
            if(S.charAt(i)>S.charAt(i+1))
            {
                break;
            }
        }
        String res=S.substring(0,i)+S.substring(i+1,S.length());
        return res;

    }
}
