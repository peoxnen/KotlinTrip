package iview.wsienski.kotlintrip.domain.mapper

import iview.wsienski.kotlintrip.domain.data.RepoKotlin
import iview.wsienski.kotlintrip.data.data.RepoKotlin as DataModelRepo

/**
 * Created by WSienski on 27/12/2017.
 */
class RepoMapperKotlin {

    fun convertFromDataModel(list: List<DataModelRepo>): List<RepoKotlin> {
        return list.mapIndexed { _, repoKotlin ->
            convertToDomain(repoKotlin)
        }
    }

    private fun convertToDomain(repoKotlin: DataModelRepo): RepoKotlin {
        with(repoKotlin) {
            return RepoKotlin(name, owner = owner.login)
        }
    }
}