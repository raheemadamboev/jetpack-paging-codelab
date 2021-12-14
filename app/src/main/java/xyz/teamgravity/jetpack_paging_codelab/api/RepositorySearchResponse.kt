package xyz.teamgravity.jetpack_paging_codelab.api

import com.google.gson.annotations.SerializedName
import xyz.teamgravity.jetpack_paging_codelab.model.RepositoryModel

data class RepositorySearchResponse(
    @SerializedName("total_count") val total: Int = 0,
    @SerializedName("items") val items: List<RepositoryModel> = emptyList(),
    val nextPage: Int? = null
)
