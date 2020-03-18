package com.northbay.kaleem.fileupload;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.northbay.kaleem.fileupload.schedular.FileReaderSchedular;

@SpringJUnitConfig(FileReaderSchedular.class)
class FileUploadS3ApplicationTests {

	@Test
	public void whenWaitOneminute_thenScheduledIsCalledAtLeastoneTimes() {
		org.awaitility.Awaitility.await().atMost(org.awaitility.Duration.ONE_MINUTE);

	}
}
