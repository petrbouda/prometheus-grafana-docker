package pbouda.prometheus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
  		return registry -> registry.config().commonTags("application", "my-app");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
