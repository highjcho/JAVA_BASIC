package collection.hashMap;

import collection.Member;

import java.util.HashMap;

public class MemberHashMap {
    protected HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }


    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("일치하는 회원이 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Integer i: hashMap.keySet())
            System.out.println(hashMap.get(i).toString());
        System.out.println("");
    }
}
