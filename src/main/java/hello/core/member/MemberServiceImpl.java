package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //해당 서비스를 사용하기 위한 인터페이스 필요
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long Id) {
        return memberRepository.findById(Id);
    }
}
