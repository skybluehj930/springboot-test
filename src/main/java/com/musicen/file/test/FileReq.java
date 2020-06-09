package com.musicen.file.test;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileReq {
	MultipartFile file;
	String data1;
	String data2;
	String data3;
}
