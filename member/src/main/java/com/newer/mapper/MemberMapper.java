package com.newer.mapper;

import com.newer.domain.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MemberMapper {

    @Select("select id,name,phone,level,time,card from member")
    List<Member> findAll();

    @Select("select id, name,phone,level,card,time from member where name=#{name} and card=#{card}")
    List<Member> findById(@Param("name") String name,
                          @Param("card") String card);

    @Delete("delete from member where id=#{id}")
    int DeleteMember(@Param("id") int id);

    @Update("insert into member values(null,#{name},#{phone},#{level},null,#{card})")
    int addMember(Member member);

    @Update("update member set name=#{name},phone=#{phone},level=#{level},time=#{time},card=#{card} where id=#{id}")
    int updateMeber(Member member);
}
