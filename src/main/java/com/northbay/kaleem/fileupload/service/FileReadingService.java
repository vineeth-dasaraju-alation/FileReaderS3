package com.northbay.kaleem.fileupload.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileReadingService {

	@Autowired
	AmazonClient amazonClient;

	public void readFiles() throws IOException {
		File file = new File(System.getProperty("user.dir") + "//");
		File[] files = file.listFiles();
		if (files != null && files.length > 0) {
			for (File f : files) {
				amazonClient.uploadFileTos3bucket(f.getName(), f);
			}
		}
	}

}
