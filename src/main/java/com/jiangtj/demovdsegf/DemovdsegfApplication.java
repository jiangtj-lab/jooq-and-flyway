package com.jiangtj.demovdsegf;

import jakarta.annotation.Resource;
import org.jooq.DSLContext;
import org.jooq.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

@SpringBootApplication
public class DemovdsegfApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemovdsegfApplication.class, args);
    }

}
