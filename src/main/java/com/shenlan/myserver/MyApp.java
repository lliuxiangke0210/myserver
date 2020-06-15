/**
 * 
 */
package com.shenlan.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuxk
 *
 * @version 2020年6月9日 下午6:29:34
 *
 * @description:
 */

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		System.out.println("today i come to  the new company");

		SpringApplication.run(MyApp.class, args);
	}

}
