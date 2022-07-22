package collection.arrayList;

import collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    ArrayList<Member> memberArrayList;
    public MemberArrayList(){
        memberArrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        memberArrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (Member m : memberArrayList){
            if (m.getMemberId() == memberId)
            {
                memberArrayList.remove(m);
                return true;
            }
        }
        System.out.println("일치하는 회원을 찾을 수 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member m : memberArrayList){
            System.out.println(m);
        }
        System.out.println("");
    }
}
