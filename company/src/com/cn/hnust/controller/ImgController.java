package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/img")
public class ImgController {
	
	@RequestMapping("/turnToImgList")
	public String turoToImgList(){
		return "imgManger/imgList" ;
	}
	
	
}