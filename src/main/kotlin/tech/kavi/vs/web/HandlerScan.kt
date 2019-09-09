package tech.kavi.vs.web

import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller

/**
 * @param value 当前控制器下的模块包
 * @param isPrefixPath 是否使用包名作为路径前缀
 * */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Controller
@ComponentScan(nameGenerator = AnnotationBeanNameGenerator::class)
annotation class HandlerScan(vararg val value: String, val isPrefixPath: Boolean = true, val uris:Array<Uri> = [])