// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import android.view.View;
import com.google.android.material.tabs.TabLayout$g;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/main/MainBadgeableTabLayout;", "Lqh1;", "Lhg9;", "drawerController", "Lvzv;", "setDrawerController", "feature.tfa.main.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class MainBadgeableTabLayout extends qh1
{
    public hg9 y1;
    
    public MainBadgeableTabLayout(final Context context, final AttributeSet set) {
        e0e.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final void d(final TabLayout$g tabLayout$g, final boolean b) {
        e0e.f((Object)tabLayout$g, "tab");
        super.d(tabLayout$g, b);
        if (tabLayout$g.i == 2131428830) {
            tabLayout$g.e((View)null);
        }
    }
    
    public final void s(final TabLayout$g tabLayout$g, final boolean b) {
        int n = 0;
        if (tabLayout$g != null) {
            n = n;
            if (tabLayout$g.i == 2131428830) {
                n = 1;
            }
        }
        if (n != 0) {
            final hg9 y1 = this.y1;
            if (y1 != null) {
                y1.a();
            }
        }
        else {
            super.s(tabLayout$g, b);
        }
    }
    
    public final void setDrawerController(final hg9 y1) {
        e0e.f((Object)y1, "drawerController");
        this.y1 = y1;
    }
}
