package com.rungroup.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.service.ClubService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClubController {
    private ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService){
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String ListClubs(Model model) {
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs",clubs);
        return "clubs-list";
    }

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    
}
