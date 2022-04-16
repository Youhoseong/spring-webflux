package web.flux.webflux.ui;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import web.flux.webflux.application.HealthService;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HealthController {
    private final HealthService proxyService;

    @GetMapping("/")
    public Mono<?> test() {
        log.info("[controller] :: signature={}", proxyService.getClass());
        return proxyService.doValidate();
    }
}
