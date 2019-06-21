package com.nchu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nchu.pojo.Users;
import com.nchu.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService usersService;

	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}

	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Users users) {
		this.usersService.addUser(users);
		return "ok";
	}
	
	/**
	 * 查询全部用户
	 */
	@RequestMapping("/findUsersAll")
	public String findUsersAll(Model model) {
		List<Users> list = this.usersService.findUsersAll();
		model.addAttribute("list",list);
		return "showUsers";
	}
	
	/**
	 * 根据id查找用户,需要回写，需要model对象
	 */
	@RequestMapping("/findUsersById")
	public String findUsersById(int id,Model model) {
		Users user = this.usersService.findUsersById(id);
		model.addAttribute("users",user);
		return "updateUsers";
	}
	
	/**
	 * 修改用户信息
	 */
	@RequestMapping("/editUsers")
	public String editUsers(Users user) {
		this.usersService.updateUsers(user);
		return "ok";
	}
	
	/**
	 * 删除用户信息
	 */
	@RequestMapping("/delUserById")
	public String delUserById(int id) {
		this.usersService.deleteUserById(id);
		return "redirect:/users/findUsersAll";
	}
}

