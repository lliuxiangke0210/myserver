/**
 * 
 */
package com.shenlan.myserver;
/**
 * @author liuxk
 *
 * @version 2020年6月12日 下午7:42:45
 *
 * @description: 
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller注解用于指示该类是一个控制器

@Controller
public class IndexController {

	@Value("${server.port}")
	private String port;

	// 映射"/"请求
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("IndexController index方法被调用......port is " + port);
		// 根据Thymeleaf默认模板，将返回resources/templates/index.html
		return "index";
	}

}
