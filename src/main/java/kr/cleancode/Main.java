package kr.cleancode;

import kr.cleancode.s510_function.service.ExampleService;
import kr.cleancode.s520_generic.APIJobStart1VO;
import kr.cleancode.s520_generic.APIJobStart2VO;
import kr.cleancode.s520_generic._TestVOProcessor;
import kr.cleancode.s610_aop.service.ExampleAOPService;

public class Main {

  public static void main(String[] args) {
    ExampleService exampleService = new ExampleService();
    exampleService.TestService();
    System.out.println("Hello world!");

    APIJobStart1VO apiJobStart1VO = new APIJobStart1VO();
    APIJobStart2VO apiJobStart2VO = new APIJobStart2VO();

    _TestVOProcessor.printFieldsAndValues(apiJobStart1VO);
    _TestVOProcessor.printFieldsAndValues(apiJobStart2VO);

    ExampleAOPService exampleAOPService = new ExampleAOPService();
    exampleAOPService.riskyMethod();

		// 환경변수 log
		ApllicationContect contect = SpringApplication.run(CleancodeAppication.class, args);
		Environment env = context.getEnvironment();
		boolean isSSL = Boolean.valueOf(env.getProperty(Costants.ENV_SERVER_SSL_ENASBLED));
		log.info(env.getProperty(Constants.ENV_APPLICATION_NAME));
		log.info(env.getProperty(Constants.ENV_HTTP_PORT));
		log.info(Arrays.toString(env.getActiveProfiles()));
  }

	@Override
	public void onStartup(ServletContext servletContext) throw ServletException {
		log.info(servletContext.getServerInfo());

		super.onStartup(servletContext);
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return super.run(application);
	}
}