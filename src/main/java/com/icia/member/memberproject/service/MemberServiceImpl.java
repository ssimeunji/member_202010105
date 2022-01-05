package com.icia.member.memberproject.service;

import com.icia.member.memberproject.dto.MemberDetailDTO;
import com.icia.member.memberproject.dto.MemberSaveDTO;
import com.icia.member.memberproject.entity.MemberEntity;
import com.icia.member.memberproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository mr;

    @Override
    public Long save(MemberSaveDTO memberSaveDTO) {
        /*
            1. MemberSaveDTO -> MemberEntity에 옮기기 (MemberEntity의 saveMember 메서드)
            2. MemberRepository의 save 메서드 호출하면서 MemberEntity 객체 전달
         */
        MemberEntity memberEntity = MemberEntity.saveMember(memberSaveDTO);
        return mr.save(memberEntity).getId();
    }

    @Override
    public MemberDetailDTO findById(Long memberId) {
        /*
            1. MemberRepository로 부터 해당 회원의 정보를 MemberEntity로 가져옴
            2. MemberEntity를 MemberDetailDTO로 바꿔서 컨드롤러로 리턴
         */
        // 1.
        MemberEntity member = mr.findById(memberId).get();
        // 2.
        MemberDetailDTO memberDetailDTO = MemberDetailDTO.toMemberDetailDTO(member);
        System.out.println("memberDetailDTO = " + memberDetailDTO);
        System.out.println("memberDetailDTO.toString() = " + memberDetailDTO.toString());
        
        return memberDetailDTO;
    }
}
