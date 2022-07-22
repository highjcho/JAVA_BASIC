package collection.treeSet;

import collection.Member;

import java.util.TreeSet;

public class MemberTreeSet{

    TreeSet<Member> set;
    public MemberTreeSet(){
        set = new TreeSet<Member>();
    }
    public void addMember(Member member) {
        set.add(member);
    }

    public void showAllMember() {
        for (Member m: set)
            System.out.println(m.toString());
    }
}
