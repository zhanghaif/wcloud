package cn.com.wcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class WcloudCoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(WcloudCoresApplication.class, args);
	}

}
