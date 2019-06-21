package com.nchu.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * SpringBoot文件上传
 * @author 时间
 *
 */
//@Controller
@RestController // 表示该类下所有方法的返回值回自动做jason格式的转换
public class FileUploadController {
	/**
	 * 处理文件上传
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/fileUploadController")
	public Map<String,Object> fileUpload(MultipartFile fileName) throws IllegalStateException, IOException{
		System.out.println(fileName.getOriginalFilename());
		fileName.transferTo(new File("c:/"+fileName.getName()));
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("msg", "ok");
		return map;
	}
}
