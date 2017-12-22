package iview.wsienski.kotlintrip.data.data

/**
 * Created by Witold Sienski on 05.12.2017.
 */
data class RepoKotlin(
        var id: Long,
        var private: Boolean,
        var name: String,
        var description: String,
        var url: String,
        var createdAt: String,
        var owner: OwnerKotlin
)
