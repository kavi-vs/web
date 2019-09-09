package tech.kavi.vs.web

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Uri(val path: String, val uri:String)
