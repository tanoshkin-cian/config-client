package live.fin.configclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import live.fin.configclient.service.ConfigPrinter

@Configuration
@EnableScheduling
class ScheduledPropertyReporter(private val configPrinter: ConfigPrinter) {

    @Scheduled(fixedDelay = 1000)
    fun report() {
        configPrinter.print()
    }

}
