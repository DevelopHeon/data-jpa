package study.datajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import study.datajpa.entity.Member;

/**
 * @since       2023.01.06
 * @author      sony
 * @description member dto
 **********************************************************************************************************************/
@Data
@AllArgsConstructor
public class MemberDto {

    private Long id;
    private String name;
    private String teamName;

    public MemberDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MemberDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
    }
}