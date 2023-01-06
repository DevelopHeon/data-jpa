package study.datajpa.repository;

import study.datajpa.entity.Member;

import java.util.List;

/**
 * @since       2023.01.06
 * @author      tony
 * @description member repository custom
 **********************************************************************************************************************/
public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}