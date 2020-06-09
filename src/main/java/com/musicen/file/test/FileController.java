package com.musicen.file.test;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.musicen.file.test.get.PostReq;

@RestController
@RequestMapping(value = "/v1/file")
public class FileController {

	@PostMapping("/upload_1")
	public String fileUpload(MultipartFile file) {
		System.out.println("file name : " + file.getOriginalFilename());
		return"ok";
	}
	
	@PostMapping("/upload_2")
	public String fileUpload(@RequestParam MultipartFile file, @RequestParam String data) {
		System.out.println("file name : " + file.getOriginalFilename());
		System.out.println("data : " + data);
		return"ok";
	}
	
	@PostMapping("/upload_3")
	public String fileUpload(@RequestParam MultipartFile file, @RequestBody FileReq paylod) {
		System.out.println("file name : " + file.getOriginalFilename());
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"Unsupported Media Type";
	}
	
	@PostMapping("/upload_4")
	public String fileUpload(FileReq paylod) {
		System.out.println("file name : " + paylod.getFile().getOriginalFilename());
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"ok";
	}
	
	@PostMapping("/upload_5")
	public String fileUpload5(@ModelAttribute FileReq paylod) {
		System.out.println("file name : " + paylod.getFile().getOriginalFilename());
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"ok";
	}
	
	@PostMapping("/upload_6")
	public String fileUpload(@RequestParam MultipartFile file, @RequestBody PostReq paylod) {
		System.out.println("file name : " + file.getOriginalFilename());
		System.out.println("data1 : " + paylod.getData1());
		System.out.println("data2 : " + paylod.getData2());
		System.out.println("data3 : " + paylod.getData3());
		return"Unsupported Media Type";
	}
	
}
