// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.annotation.SuppressLint;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

public final class c
{
    public final cnb a;
    public final Context b;
    public final com.twitter.analytics.tracking.a c;
    public final o5w d;
    public final do0 e;
    
    public c(final cnb a, final com.twitter.analytics.tracking.a c, final o5w d, final do0 e) {
        this.a = a;
        this.d = d;
        this.b = ((Context)a).getApplicationContext();
        this.c = c;
        this.e = e;
    }
    
    @SuppressLint({ "CheckResult" })
    public final void a(final a a) {
        final Intent intent = ((Activity)this.a).getIntent();
        final String stringExtra = intent.getStringExtra("attribution_link");
        intent.removeExtra("attribution_link");
        if (ikr.g((CharSequence)stringExtra)) {
            final jhl n2 = jhl.n2(2131951959);
            ((Fragment)n2).S1();
            n2.p2(this.a.P(), (String)null);
            final com.twitter.analytics.tracking.a c = this.c;
            final b$a b$a = new b$a();
            b$a.c = stringExtra;
            ((eaq)new fcq((lcq)((enm)new ue6(UserIdentifier.getCurrent(), (cnm)new hy0(this.b, this.e))).R((Object)c.c(2, (b)((n4j)b$a).e())), (psb)new gy0((Object)n2, 0), (Object)null)).G((lj6)new fy0((Object)this, (Object)a, (Object)n2, 0), (lj6)jub.e);
        }
        else {
            a.b(false);
        }
    }
    
    public interface a
    {
        void b(final boolean p0);
    }
}
