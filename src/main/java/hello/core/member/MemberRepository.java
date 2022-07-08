package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    hello.core.member.Member findById(Long Id);
}
