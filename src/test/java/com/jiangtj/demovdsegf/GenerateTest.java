package com.jiangtj.demovdsegf;

import com.zaxxer.hikari.HikariDataSource;
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
        String url = properties.getUrl();
        String username = properties.getUsername();
        String password = properties.getPassword();
        String schema = url.split("//")[1].split("/")[1].split("\\?")[0];
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
                    .withIncludes(".*")
                    .withInputSchema(schema)
                )
                .withTarget(new Target()
                    .withPackageName("com.jiangtj.demovdsegf.jooq")
                    .withDirectory("src/main/java")
                )
            );

        GenerationTool.generate(configuration);
    }

}
