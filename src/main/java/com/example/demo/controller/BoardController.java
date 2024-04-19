package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class BoardController {
	
	
	
	/*
	 * @RequestMapping("/board/allBoardList") public ModelAndView
	 * allBoardList(HttpServletRequest request, BOARD_INFO boardInfo, Model model) {
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * List<BOARD_INFO> allBoardList = boardService.allBoardList();
	 * mv.addObject("allBoardList",allBoardList);
	 * 
	 * return mv;
	 * 
	 * }
	 */
	
	@RequestMapping(value={"/", "/index"}) 
    public ModelAndView main(HttpServletRequest request) { 
        ModelAndView mv = new ModelAndView(); 
        log.info("board/allboardList 호출");
        mv.setViewName("board/allBoardList"); 
        return mv;
    }
	
	@RequestMapping(value={"/test"}) 
    public ModelAndView test(HttpServletRequest request) { 
        ModelAndView mv = new ModelAndView(); 
        log.info("ontrollerTest 호출");
        mv.setViewName("test/controllerTest"); 
        return mv;
    }
}
