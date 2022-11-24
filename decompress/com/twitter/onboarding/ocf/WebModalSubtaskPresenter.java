// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf;

import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/onboarding/ocf/WebModalSubtaskPresenter;", "", "Companion", "b", "c", "subsystem.tfa.ocf.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class WebModalSubtaskPresenter
{
    public static final b Companion;
    public final Activity a;
    public final zb7 b;
    public final smx c;
    public final NavigationHandler d;
    public final rrd e;
    public rrd f;
    public boolean g;
    
    static {
        Companion = new b();
    }
    
    public WebModalSubtaskPresenter(final Activity a, final cbf cbf, final k9x k9x, final zb7 b, final smx c, final NavigationHandler d, final duo duo) {
        e0e.f((Object)a, "activity");
        e0e.f((Object)k9x, "lifecycle");
        e0e.f((Object)b, "customTabsManager");
        e0e.f((Object)c, "subtaskProperties");
        e0e.f((Object)d, "navigationHandler");
        e0e.f((Object)duo, "savedStateHandler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final dtv c2 = ((bur)c).c;
        e0e.c((Object)c2);
        final rrd rrd = new rrd(c2, (vrd)null);
        this.e = rrd;
        this.f = rrd;
        final fc7 l0 = b.L0;
        final PackageManager packageManager = l0.a.getPackageManager();
        final Intent setData = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String)null));
        e0e.e((Object)setData, "Intent()\n            .se\u2026mParts(\"http\", \"\", null))");
        boolean b2 = false;
        final List queryIntentActivities = packageManager.queryIntentActivities(setData, 0);
        e0e.e((Object)queryIntentActivities, "pm.queryIntentActivities(activityIntent, 0)");
        while (true) {
            for (final ResolveInfo resolveInfo : queryIntentActivities) {
                final Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent, 0) != null) {
                    b2 = true;
                    if (!b2 && !(this.b.L0.c().equals("chrome_not_available") ^ true)) {
                        w9.w("WebModalSubtask cannot proceed without a browser supporting Custom Tabs");
                        this.d.d(this.f, null);
                    }
                    else {
                        duo.b(this);
                        k9x.d().subscribe((rk6)new rm8((stb)new rmx(this), 5));
                        cbf.K((jn)new WebModalSubtaskPresenter$a(this));
                    }
                    return;
                }
            }
            final m9a m9a = new m9a((Throwable)new IllegalStateException("Custom_Tabs_Resolution_Error2"));
            l0.a(m9a, queryIntentActivities);
            r9a.c(m9a);
            continue;
        }
    }
    
    public static final class b
    {
    }
    
    public enum c
    {
        public static final a Companion;
        public static final c[] G0;
        public final String F0;
        
        static {
            G0 = new c[] { new c("next_link"), new c("fail_link") };
            Companion = new a();
        }
        
        public c(final String f0) {
            this.F0 = f0;
        }
        
        public static final class a
        {
        }
    }
}
