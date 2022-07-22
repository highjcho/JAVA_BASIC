package collection.treeSet;

import collection.Member;

import java.util.TreeSet;

public class MemberTreeSet {
    protected TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }


    public void showAllMember() {
        for (Member m : treeSet)
            System.out.println(m.toString());
        System.out.println("");
    }
}
