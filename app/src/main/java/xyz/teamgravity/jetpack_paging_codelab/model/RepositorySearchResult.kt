package xyz.teamgravity.jetpack_paging_codelab.model

sealed class RepositorySearchResult {
    data class Success(val data: List<RepositoryModel>) : RepositorySearchResult()
    data class Error(val error: Exception) : RepositorySearchResult()
}
