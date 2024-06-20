//package

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrawingController {

	//private final CrawlingService crawlingService;

	@GetMapping("/api/v1/crawling/create/pdf")
	public ResponseEntity<String> createPdfExampleBySelenium() {

	String[] urlList = new String[] {
		"https://log.cleancode.kr/works",
		"https://log.cleancode.kr/study"
	}

	String imagePath = "cleancode";
	String pdfPath = "cleancode-pdf"

	try {
		crawlingService.captureScreenshot(urlList, imagePath);
		crawlingService.saveImageToPdf(imagePath, pdfPath);
	} catch (Exception e) {
		return ResponseEntity.ok(e.getLocalizedMessage());	
	}

	return ResponseEntity.ok(HttpStatus.OK.name());

}