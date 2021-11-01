package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * Bootstrap Class
 * 
 * 1. 스프링 부트 어플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 class로 역할 (Configuration Class)
 * 
 * */


@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		
		/*
		 * 1. 어플리케이션 컨텍스트 (Application Context, Spring Container) 생성
		 * 2. 웹어플리케이션 타입 (Web Application인 경우, MVC or Reactive)
		 * 3. 어노테이션 스캐닝 (Auto) or Configuraion 클래스(Explicit)를 통한 Bean 생성 및 등록
		 * 4. 웹 어플리케이션인 경우(MVC)
		 * 		-내장(embedded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 * 		-서버 인스턴스에 웹 어플리케이션을 배포
		 * 		-서버 인스턴스 실행
		 * 5. 인터페이스 ApplicationRunner 구현 Bean의 run() 실행
		 * 
		 */
		
		SpringApplication.run(HelloWorldApplication.class, args);

	}

}
