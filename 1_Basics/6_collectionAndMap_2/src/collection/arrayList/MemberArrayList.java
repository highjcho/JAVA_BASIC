package collection.arrayList;

import collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    protected ArrayList<Member> memberArrayList;

    public MemberArrayList(){
        memberArrayList = new ArrayList<Member>();
    }


    public void addMember(Member member) {
        memberArrayList.add(member);
    }

    public void showAllMember() {
        for (Member m: memberArrayList)
            System.out.println(m.toString());
    }

    public boolean removeMember(int memberId) {
        for (Member m: memberArrayList)
        {
            if (m.getMemberId() == memberId)
            {
                memberArrayList.remove(m);
                return true;
            }
        }
        System.out.println("회원번호" + memberId + "가 존재하지 않습니다.");
        return false;
    }
}
