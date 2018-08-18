package studio.forface.bottomappbar.materialpanels.panelitems

import studio.forface.bottomappbar.materialpanels.holders.SizeHolder
import studio.forface.bottomappbar.materialpanels.holders.TextSizeHolder
import studio.forface.bottomappbar.materialpanels.holders.TextStyleHolder

open class PrimaryPanelItem: BasePanelItem() {
    override val thisRef get() = this
    override val iconMarginStartDp = 24f
    override val iconMarginEndDp = 24f
    override val iconAlpha = 0.7f

    override var titleTextSizeHolder =  TextSizeHolder( sp = 18f )
    override var titleTextStyleHolder = TextStyleHolder( bold = true )
    override var iconSizeHolder =       SizeHolder( dp = 24f )
}