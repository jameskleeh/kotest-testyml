package kotest.envs

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("kotest.envs")
		.start()
}

