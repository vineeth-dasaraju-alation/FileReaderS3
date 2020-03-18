package com.northbay.kaleem.fileupload.schedular;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.northbay.kaleem.fileupload.service.FileReadingService;

@Configuration
@EnableScheduling
@EnableAsync
public class FileReaderSchedular {

	@Autowired
	FileReadingService fileReadingService;

	@Scheduled(cron = "0 0/1 * * * ?")
	public void processFiles() throws IOException {
		fileReadingService.readFiles();
	}

}
