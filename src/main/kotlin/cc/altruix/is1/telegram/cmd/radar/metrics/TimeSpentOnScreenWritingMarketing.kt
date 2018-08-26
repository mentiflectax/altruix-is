package cc.altruix.is1.telegram.cmd.radar.metrics

import cc.altruix.is1.mongo.IAltruixIs1MongoSubsystem
import cc.altruix.is1.telegram.cmd.radar.AbstractTotalProductiveTimeCollMetric
import cc.altruix.is1.telegram.cmd.radar.RadarChartMetric
import cc.altruix.is1.tpt.TotalProductiveTimeJob
import java.time.LocalDate

/**
 * Created by pisarenko on 16.05.2017.
 */
object TimeSpentOnScreenWritingMarketing: AbstractTotalProductiveTimeCollMetric(
        TotalProductiveTimeJob.ScreenWritingMarketing,
        "SMT",
        "Movie marketing effort",
        "Hours",
        100
) {

}