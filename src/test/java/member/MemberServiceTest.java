package member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService=new MemberServiceImpl();
    @Test
    void join(){
        Member member= new Member(1L,"안정민", Grade.VIP);
        memberService.join(member);
        Member member1=memberService.findMember(1L);

        //확인
        Assertions.assertThat(member).isEqualTo(member1);
    }
}
