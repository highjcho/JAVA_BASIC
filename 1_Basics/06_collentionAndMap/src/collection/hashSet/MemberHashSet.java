package collection.hashSet;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    protected HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<>();
    }


    public void addMember(Member member) {
        hashSet.add(member);
    }

public boolean removeMember(int memberId){
    Iterator<Member> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        Member member = iterator.next();
        if (member.getMemberId() == memberId){
            hashSet.remove(member);
            return true;
        }
    }
    System.out.println("일치하는 회원이 존재하지 않습니다.");
    return false;
}
    public void showAllMember() {
        for (Member m : hashSet)
            System.out.println(m);
        System.out.println("");
    }
}
