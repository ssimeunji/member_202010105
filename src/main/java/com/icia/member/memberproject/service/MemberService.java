package com.icia.member.memberproject.service;

import com.icia.member.memberproject.dto.MemberDetailDTO;
import com.icia.member.memberproject.dto.MemberSaveDTO;

public interface MemberService {
    Long save(MemberSaveDTO memberSaveDTO);

    MemberDetailDTO findById(Long memberId);
}
