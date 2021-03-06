package com.ecjtu.flesh.presenter

import android.app.Activity
import com.ecjtu.flesh.ui.adapter.CardListAdapter
import com.ecjtu.flesh.ui.adapter.LikeCardListAdapter
import com.ecjtu.netcore.model.PageModel

/**
 * Created by Ethan_Xiang on 2017/9/13.
 */
class PageLikeFragmentDelegate(owner: Activity, itemList: List<PageModel.ItemModel>) : BasePageActivityDelegate(owner, itemList) {
    override fun getCardListAdapter(pageModel: PageModel): CardListAdapter {
        return LikeCardListAdapter(pageModel)
    }

}