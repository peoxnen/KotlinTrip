package iview.wsienski.kotlintrip.domain.command

import iview.wsienski.kotlintrip.Constants
import iview.wsienski.kotlintrip.domain.data.RepoKotlin
import iview.wsienski.kotlintrip.domain.mapper.RepoMapperKotlin
import iview.wsienski.kotlintrip.network.Request

/**
 * Created by WSienski on 27/12/2017.
 */
class RepoCommand : Command<List<RepoKotlin>> {
    override fun run(): List<RepoKotlin> {
        val request = Request(Constants.Companion.URL)
        return RepoMapperKotlin().convertFromDataModel(request.run())
    }

}