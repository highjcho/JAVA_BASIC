package collection.hashSet;

import collection.Member;

import java.util.HashSet;

public class MemberHashSet {
    HashSet<Member> set;

    public MemberHashSet(){
        set = new HashSet<Member>();
    }
    public void addMember(Member member) {
        set.add(member);
    }

    public void showAllMember() {
        for (Member m: set)
            System.out.println(m.toString());
    }
}
