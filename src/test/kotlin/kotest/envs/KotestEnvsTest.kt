package kotest.envs
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@MicronautTest
class KotestEnvsTest(private val application: EmbeddedApplication<*>): StringSpec({

    "test the server is running" {
        assert(application.isRunning)
    }

    "test config is read from application-test.yml" {
        application.applicationContext.getProperty("config.value", String::class.java).get() shouldBe "fromtestyml"
    }
})
