package example.micronaut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller("/hello")
class HelloController {

    @Get
    String index(@QueryValue String name, @QueryValue String surname) {
        return "Hello $name $surname"
    }
}
