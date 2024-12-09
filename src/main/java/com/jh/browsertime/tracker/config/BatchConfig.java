package com.jh.browsertime.tracker.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job myJob(Step step1) {
        return jobBuilderFactory.get("myJob")
                                 .start(step1)
                                 .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                                  .tasklet(new MyTasklet())
                                  .build();
    }
}
