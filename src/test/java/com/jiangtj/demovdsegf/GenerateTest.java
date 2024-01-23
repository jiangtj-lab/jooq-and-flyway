package com.jiangtj.demovdsegf;

import jakarta.annotation.Resource;
import org.jooq.DSLContext;
import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GenerateTest {

    @Resource
    DSLContext context;
    @Resource
    DataSourceProperties properties;

    @Test
    public void generate() throws Exception {
        String name = properties.getName();
        String password = properties.getPassword();
        String username = properties.getUsername();
        String url = properties.getUrl();
        Configuration configuration = new Configuration()

            // Configure the database connection here
            .withJdbc(new Jdbc()
                .withDriver(properties.getDriverClassName())
                .withUrl(url)
                .withUser(username)
                .withPassword(password)
            )
            .withGenerator(new Generator()
                .withDatabase(new Database()
                    .withInputSchema(name)
                )
                .withTarget(new Target()
                    .withPackageName("com.jiangtj.demovdsegf.jooq")
                    .withDirectory("src/main/java")
                )
            );

        GenerationTool.generate(configuration);
    }

}
