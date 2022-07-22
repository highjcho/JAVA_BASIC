package hashMap;


import collection.Member;

import java.util.HashMap;

public class MemberHashMap {
    public HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public void showAllMember() {
       for (Integer i: hashMap.keySet())
           System.out.println(hashMap.get(i).toString());
    }

    public void removeMember(int memberId) {

    }
}
