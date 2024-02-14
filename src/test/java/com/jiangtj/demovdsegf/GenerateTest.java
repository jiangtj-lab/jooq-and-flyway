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
    @Resource
    org.jooq.Configuration configuration;

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
                                .withGenerate(new Generate()

                                                // Possible values for generatedAnnotationType
                                                // - DETECT_FROM_JDK
                                                // - JAVAX_ANNOTATION_GENERATED
                                                // - JAVAX_ANNOTATION_PROCESSING_GENERATED
                                                // - ORG_JOOQ_GENERATED
//                    .withGeneratedAnnotation(true)
//                    .withGeneratedAnnotationType(GeneratedAnnotationType.DETECT_FROM_JDK)
//                    .withGeneratedAnnotationDate(true)
//                    .withGeneratedAnnotationJooqVersion(true)
//                    .withNullableAnnotation(true)
//                    .withNullableAnnotationType("javax.annotation.Nullable")
//                    .withNonnullAnnotation(true)
//                    .withNonnullAnnotationType("javax.annotation.Nonnull")
//                    .withJpaAnnotations(true)
//                    .withJpaVersion("2.2")
//                    .withValidationAnnotations(true)
//
//                    .withKotlinSetterJvmNameAnnotationsOnIsPrefix(true)
//                    .withConstructorPropertiesAnnotation(true)
//                    .withConstructorPropertiesAnnotationOnPojos(true)
//                    .withConstructorPropertiesAnnotationOnRecords(true)

                                                .withPojos(true)
                                                .withPojosAsJavaRecordClasses(true)
                                )
                );

        GenerationTool.generate(configuration);
    }

}
