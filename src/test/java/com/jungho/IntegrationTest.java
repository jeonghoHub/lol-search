package com.jungho;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("integration")
public abstract class IntegrationTest {

    @BeforeAll
    public static void feignValidation() {
        System.out.println("Valid Bean Set");
    }
}
