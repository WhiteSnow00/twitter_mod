// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/main/MainBadgeableTabLayout;", "Lth1;", "Lwf9;", "drawerController", "Loyv;", "setDrawerController", "feature.tfa.main.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class MainBadgeableTabLayout extends th1
{
    public wf9 v1;
    
    public MainBadgeableTabLayout(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final void d(final TabLayout.g g, final boolean b) {
        zzd.f((Object)g, "tab");
        super.d(g, b);
        if (g.i == 2131428830) {
            g.e(null);
        }
    }
    
    public final void s(final TabLayout.g g, final boolean b) {
        int n = 0;
        if (g != null) {
            n = n;
            if (g.i == 2131428830) {
                n = 1;
            }
        }
        if (n != 0) {
            final wf9 v1 = this.v1;
            if (v1 != null) {
                v1.a();
            }
        }
        else {
            super.s(g, b);
        }
    }
    
    public final void setDrawerController(final wf9 v1) {
        zzd.f((Object)v1, "drawerController");
        this.v1 = v1;
    }
}
