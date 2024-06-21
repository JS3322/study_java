//package

@Service
public class CrawlingService {

	public void captureScreenshot() throws IOException {

	// 서버 배포 시 os에 맞춰 크롬과 크라이브 두 툴 필요

 	// webDriver 없을 경우
	// WebDriverManager.chromedriver().setup();
	// win기준 64
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	ChromeOptions options = new ChromeOptions();

	// 실행 창 안보이게
	options.addArguments("--headless", "--desable-gpu");
	// 실행 창 보이게
	options.addArguments("--start-maximized");
	options.addArguments("--disable-popup-blocking"); // redirect시 효과없음
	options.addArguments("--disable-default-apps");
	WebDriver driver = new ChromeDriver(options);

	try {
		//login page(tag 찾아 로그인), request에 필요 param 넣고 response 값으로 쿠키 설정 후 로그인 방법 찾기
		driver.get(loginUrl);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userNameInput"))).sendKeys("cleancode.admin");
		driver.findElement(By.id("passwordInput")).sendKeys("None");
		driver.findElement(By.id("submitButton")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
		Thread.sleep(sleepTimer);

		//local storage 가져오기
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		String localStorageValue = (String) javascriptExecutor.executeScript(
			"return localStorage.getItem('authStore');"
		)

		//이미지 캡쳐
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		BufferedIamge bufferedImage = ImageIO.read(srcFile);
		ImageIO.write(bufferImage, "png", new File(imagePath+"0.png"))
		
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	} finaly {
		driver.quit();
	}


	}

}