package com.jungho;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@Tag("integration")
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public abstract class RepositoryTest {

}
