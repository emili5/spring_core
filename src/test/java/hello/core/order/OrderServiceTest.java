package hello.core.order;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService=new MemberServiceImpl();
    OrderService orderService=new OrderServiceImpl();
    @Test
    void createOrder(){
        //주문할 멤버 넣기
        Long id=1L;
        Member member=new Member(id,"안정민", Grade.VIP);
        memberService.join(member);
        //주문하기
        Order order= orderService.createOrder(id,"사과주스",4500);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
