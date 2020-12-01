package com.junit5.Junit5.Demo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.DescriptorKey;

import static org.junit.jupiter.api.Assertions.assertNotNull;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)//어떤식으로 테스트 이름을 생성할지?
class Junit5DemoApplicationTests {

	@Test//굳이 public일 필요가 없다.
	@DisplayName("첫번쨰 스터디!")//원하는 테스트명-> 이모지도 가능 -> 가장 추천하는 방법.
	void create_new_study() {
		Junit5DemoApplication junit5DemoApplication = new Junit5DemoApplication();
		assertNotNull(junit5DemoApplication);
		System.out.println("create");
	}

	@Test
	//@Disabled //전체 테스트 실행 시 해당 테스트케이스만 비활성화 시킴
	void create_new_study_again() {
		System.out.println("create1");
	}

	/**
	 * beforeAll, afterAll
	 * 어떤 테스트가 실행이 되던 실행 전후에 반드시 딱 한번만 실행되는 어노테이션
	 * static이어야 함.
	 * private 불가
	 * return type 있으면 안됨. ==>> 무조건 static void
	 */
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}

	/**
	 * beforeEach, afterEach
	 * 각각의 테스트를 실행하기 이전과 이후에 호출
	 *
	 */
	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach");
	}

	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}

}
