package com.musicen.file.test.get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/get")
public class GetController {
	
	@GetMapping("/datas")
	public String getData(@RequestParam GetReq paylod) {
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"Bad Request";
	}
	
	@GetMapping("/datas2")
	public String getData2(@ModelAttribute GetReq paylod) {
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"ok";
	}
	
	@PostMapping("/datas3")
	public String getData(@RequestBody PostReq paylod) {
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"ok";
	}
	
	@PostMapping("/datas4")
	public String getData3(@ModelAttribute PostReq paylod) {
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"ok";
	}
}
