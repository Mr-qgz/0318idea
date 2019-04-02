package com.newer.service;

import com.newer.domain.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberService {

    List<Member> findAll();

    List<Member> findById(@Param("name") String name,
                          @Param("card") String card);

    int DeleteMember(@Param("id") int id);

    int addMember(Member member);

    int updateMeber(Member member);
}
