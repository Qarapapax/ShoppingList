package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItem: Int) {
        shopListRepository.getShopItem(shopItem)
    }
}