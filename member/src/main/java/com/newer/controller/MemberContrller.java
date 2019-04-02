package com.newer.controller;


import com.newer.domain.Member;
import com.newer.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mem")
public class MemberContrller {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> findAll(){
        return memberService.findAll();
    }


    @GetMapping("/{name}")
    public List<Member> findById(@PathVariable("name") String name,
                                 String card){

        return memberService.findById(name,card);
    }


    @DeleteMapping("/{id}")
    public Map<String,Object> deleteMember(@PathVariable("id") int id){
        int result=memberService.DeleteMember(id);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }

    @PostMapping
    public Map<String,Object> addEmp(Member member){
        int result=memberService.addMember(member);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }


    @PutMapping("/{id}")
    public Map<String,Object> updateMeber(@PathVariable("id") int id,Member member){
        member.setId(id);
        int result=memberService.updateMeber(member);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
}
