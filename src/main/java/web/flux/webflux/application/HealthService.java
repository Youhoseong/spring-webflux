package web.flux.webflux.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import web.flux.webflux.aop.annotations.Validations;

@Service
@Slf4j
public class HealthService {

    @Validations
    public Mono<?> doValidate() {
        log.info("[service] :: signature={}", this);
        return Mono.create(monoSink -> monoSink.success("I'm alive."));
    }
}
