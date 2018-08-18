package studio.forface.bottomappbar.materialpanels.panelitems

import studio.forface.bottomappbar.materialpanels.holders.ColorHolder
import studio.forface.bottomappbar.materialpanels.holders.SizeHolder
import studio.forface.bottomappbar.materialpanels.holders.TextSizeHolder

open class SecondaryPanelItem: BasePanelItem() {
    override val thisRef get() = this
    override val iconMarginStartDp = 48f
    override val iconMarginEndDp = 12f
    override val iconAlpha = 0.5f

    override var titleTextSizeHolder =  TextSizeHolder( sp = 14f )

    override var iconColorHolder =      ColorHolder()
    override var iconSizeHolder =       SizeHolder( dp = 20f )
}