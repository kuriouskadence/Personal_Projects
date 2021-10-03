import java.util.ArrayList;
public class ClubMembers {
    
    private ArrayList <MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }
    public MemberInfo getMember(int index){
        return memberList.get(index);
    }
    

    public void addMembers(String [] names, int gradYear){
        for(int i = 0; i < names.length; i++){
            MemberInfo member = new MemberInfo(names[i], gradYear, true);
            memberList.add(member);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int gradYear){
        ArrayList<MemberInfo> graduatedGoodStanding = new ArrayList<>();
        int index = 0; 
        while(index < memberList.size()){
            // MemberInfo member = memberList.get(index);
            if(memberList.get(index).getGradYear() <= gradYear){
                if(memberList.get(index).inGoodStanding() == true){
                    graduatedGoodStanding.add(memberList.get(index));
                }
                memberList.remove(index);
            } else{
                index++;
            }
        } 
        return graduatedGoodStanding;
    }

    @Override
    public String toString() {
        return memberList.toString();
    }


}
