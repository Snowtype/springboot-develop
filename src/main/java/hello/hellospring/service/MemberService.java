package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRespository = new MemoryMemberRepository();

    /**
     * 
     * 회원가입
     * @return
     */
    public Long join(Member member) {
        //같은 이름이 있는 중복 회원X
        Optional<Member> result = memberRespository.findByName(member.getName());
        result.get
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.")
        });

        memberRespository.save(member);
        return member.getId();

    }


}
