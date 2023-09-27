package live.fin.configclient.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Service

@Service
@RefreshScope
class ConfigPrinter(@Value("\${foo}") private val foo: String) {

    fun print() {
        println("foo: $foo")
    }

}
