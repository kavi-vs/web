package tech.kavi.vs.web

import io.vertx.core.http.HttpMethod
import org.springframework.stereotype.Controller

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Controller
annotation class HandlerRequest(val path: String, val method: HttpMethod)
