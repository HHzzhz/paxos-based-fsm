package huazheng.paxosbasedfsm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaxosBasedFsmApplication

fun main(args: Array<String>) {
	runApplication<PaxosBasedFsmApplication>(*args)
}

