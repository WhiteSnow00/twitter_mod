// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import android.view.View;
import com.google.android.material.tabs.TabLayout$g;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/main/MainBadgeableTabLayout;", "Loh1;", "Lef9;", "drawerController", "Lfzv;", "setDrawerController", "feature.tfa.main.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class MainBadgeableTabLayout extends oh1
{
    public ef9 w1;
    
    public MainBadgeableTabLayout(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final void d(final TabLayout$g tabLayout$g, final boolean b) {
        czd.f((Object)tabLayout$g, "tab");
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
            final ef9 w1 = this.w1;
            if (w1 != null) {
                w1.a();
            }
        }
        else {
            super.s(tabLayout$g, b);
        }
    }
    
    public final void setDrawerController(final ef9 w1) {
        czd.f((Object)w1, "drawerController");
        this.w1 = w1;
    }
}
