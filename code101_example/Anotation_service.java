package code101_example;

public class Anotation_service {
	
    @MetaData
	public void method1() {
		System.out.println("실행 내용1");
	}

	@MetaData("*")
	public void method2() {
		System.out.println("실행 내용2");
	}	
	
	@code101_example.MetaData(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}	

    public void method4() {
		System.out.println("실행 내용4");
	}	
}
