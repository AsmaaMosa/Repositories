package com.repositories.domain.model

data class RepositoriesModel(val items: MutableList<ItemModel>)

data class ItemModel(val name: String, val description: String, val owner: OwnerModel)
data class OwnerModel(val avatar_url: String)