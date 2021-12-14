package xyz.teamgravity.jetpack_paging_codelab.model

import androidx.lifecycle.LiveData
import androidx.paging.PagingData

data class RepositorySearchResponse(
    val data: LiveData<PagingData<RepositoryModel>>,
    val networkErrors: LiveData<String>
)
