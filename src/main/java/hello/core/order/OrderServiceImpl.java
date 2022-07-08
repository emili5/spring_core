package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //주문 서비스를 이용하려면 멤버 정보와 할인 정책 정보 필요
    MemberRepository memberRepository=new MemoryMemberRepository();
    DiscountPolicy discountPolicy=new FixDiscountPolicy();
    @Override
    public Order createOrder(Long id, String itemName, int itemPrice) {
        Member member=memberRepository.findById(id);
        int discountPrice=discountPolicy.discount(member,itemPrice);
        return new Order(id,itemName,itemPrice,discountPrice);
    }
}
