package top.unltra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import top.unltra.domain.Pick;
import top.unltra.service.PickService;

/**
 * 处理拾物请求控制器
 * */
@Controller
public class PickController {
	
	/**
	 * 自动注入PickService
	 * */
	@Autowired
	@Qualifier("pickService")
	private PickService pickService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// 获得所有图书集合
		List<Pick> pick_list = pickService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("pick_list", pick_list);
		// 跳转到main页面
		return "main";
	}
	
}
