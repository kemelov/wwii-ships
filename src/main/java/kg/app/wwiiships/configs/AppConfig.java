package kg.app.wwiiships.configs;

import kg.app.wwiiships.mappers.ClassesMapper;
import kg.app.wwiiships.mappers.OutcomesMapper;
import kg.app.wwiiships.mappers.ShipsMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ClassesMapper classesMapper(){
        return ClassesMapper.INSTANCE;
    }

    @Bean
    public ShipsMapper shipsMapper(){
        return ShipsMapper.INSTANCE;
    }

    @Bean
    public OutcomesMapper outcomesMapper(){
        return OutcomesMapper.INSTANCE;
    }
}
