package com.icia.member.memberproject;

import com.icia.member.memberproject.dto.MemberSaveDTO;
import com.icia.member.memberproject.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {
    /*
        MemberServiceImpl.save() 메서드가 잘 동작하는지를 테스트

        회원가입테스트
        save.html 에서 회원정보 입력 후 가입 클릭
        DB 확인
     */
    @Autowired
    private MemberService ms;

    @Test
    @DisplayName("회원가입테스트")
    public void memberSaveTest() {
        MemberSaveDTO memberSaveDTO = new MemberSaveDTO();
        memberSaveDTO.setMemberEmail("테스트회원이메일1");
        memberSaveDTO.setMemberPassword("테스트비번1");
        memberSaveDTO.setMemberName("테스트회원이름1");

        ms.save(memberSaveDTO);

    }
}
