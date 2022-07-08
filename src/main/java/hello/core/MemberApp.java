package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

/*
* main메서드로 테스트 작성
* */
public class MemberApp {

    public static void main(String[] args) {
        //회원 가입
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"안정민", Grade.VIP);
        memberService.join(member);

        //회원 조회
        Member member1 = memberService.findMember(1L);
        System.out.println("new member="+member.getName());
        System.out.println("find member="+member1.getName());

    }
}

