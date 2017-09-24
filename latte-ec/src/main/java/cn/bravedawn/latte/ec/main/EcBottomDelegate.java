package cn.bravedawn.latte.ec.main;


import android.graphics.Color;

import java.util.LinkedHashMap;

import cn.bravedawn.latte.delegates.bottom.BaseBottomDelegate;
import cn.bravedawn.latte.delegates.bottom.BottomItemDelegate;
import cn.bravedawn.latte.delegates.bottom.BottomTabBean;
import cn.bravedawn.latte.delegates.bottom.ItemBuilder;
import cn.bravedawn.latte.ec.main.index.IndexDelegate;
import cn.bravedawn.latte.ec.main.sort.SortDelegate;

/**
 * Created by 冯晓 on 2017/9/24.
 */

public class EcBottomDelegate extends BaseBottomDelegate {

    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItem(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "主页"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}", "分类"), new SortDelegate());
        items.put(new BottomTabBean("{fa-compass}", "发现"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-shopping-cart}", "购物车"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-user}", "我的"), new IndexDelegate());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }
}
