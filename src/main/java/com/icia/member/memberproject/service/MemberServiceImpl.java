package com.icia.member.memberproject.service;

import com.icia.member.memberproject.dto.MemberSaveDTO;
import com.icia.member.memberproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository mr;
    
    @Override
    public void save(MemberSaveDTO memberSaveDTO) {

    }
}
