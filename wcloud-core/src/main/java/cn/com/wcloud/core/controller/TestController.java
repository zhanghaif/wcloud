package cn.com.wcloud.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @className: TestController
 * @description: 代码规范
 * @author zhanghaifeng
 * @dateTime 2019年3月1日 下午1:59:39
 */
@RestController
@RequestMapping("/")
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	public void logApp(){
	    logger.debug("log4j2 success ===== debug");
	    logger.warn("log4j2 success ===== warn");
	    logger.info("log4j2 success ===== info");
	    logger.error(System.getProperty("user.home") + " ===== error");
    }
	/**
	 * 
	 * @Title: main
	 * @Description: 测试日志
	 * @Author Administrator
	 * @DateTime 2019年3月11日 上午10:07:37
	 * @param args
	 */
	public static void main(String[] args) {
		TestController application = new TestController();
	    application.logApp();
	}
	
	@GetMapping("/{msg}")
	public String get(@PathVariable String msg) {
		return "hello "+msg;
	}
	
	@GetMapping("/")
	public String list() {
		return "hello world!";
	}
	
	/**
	 * 
	 * @Method: save
	 * @Description:演示 
	 * @param name 名字
	 * @param age 年龄
	 * @return 数据集
	 */
	@PostMapping("/save")
	public List<String> save(String name,String age) {
		List<String> list = new ArrayList<String>();
		list.add(name);
		list.add(age);
		return list;
	}
}
