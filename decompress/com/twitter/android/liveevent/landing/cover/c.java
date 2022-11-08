// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.cover;

import androidx.fragment.app.p;
import android.app.Dialog;
import java.util.Map;
import java.util.Objects;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.android.liveevent.dock.b;
import com.twitter.model.liveevent.LiveEventConfiguration;
import android.content.res.Resources;

public final class c implements mw8
{
    public final kn C0;
    public final Resources D0;
    public final b E0;
    public final LiveEventConfiguration F0;
    public final com.twitter.android.liveevent.dock.b G0;
    public final jvf H0;
    public boolean I0;
    public boolean J0;
    
    public c(final kn c0, final Resources d0, final b e0, final LiveEventConfiguration f0, final com.twitter.android.liveevent.dock.b g0, final sso sso, final jvf h0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        sso.a((vro)new jt2() {
            public final void a(final Bundle bundle) {
                bundle.putBoolean("has_shown_interstitial", c.this.I0);
                bundle.putBoolean("is_showing_interstitial", c.this.J0);
            }
            
            public final void v(final Parcelable parcelable) {
                final Bundle bundle = (Bundle)parcelable;
                c.this.I0 = bundle.getBoolean("has_shown_interstitial");
                c.this.J0 = bundle.getBoolean("is_showing_interstitial");
                final c c0 = c.this;
                if (!c0.J0 && c0.I0) {
                    ((ggm)c0.H0).a((Object)xxf.D0);
                }
            }
        });
    }
    
    public final xwm<xes> a(String string) {
        string = this.D0.getString(2131954747, new Object[] { pjr.l(string) });
        return (xwm<xes>)wxm.b(new String[] { this.D0.getString(2131952224) }, string);
    }
    
    public final void b(final String s, final xwm<xes> c, final String b) {
        this.J0 = true;
        final b e0 = this.E0;
        Objects.requireNonNull(e0);
        final wsb$a wsb$a = new wsb$a();
        wsb$a.a = new xwm(s, (Map)null);
        wsb$a.c = c;
        wsb$a.b = b;
        wsb$a.d = e0.b.getString(2131954765);
        wsb$a.g = false;
        final wsb wsb = (wsb)((h4j)wsb$a).e();
        final ssb$a ssb$a = new ssb$a(0);
        ((clp$a)ssb$a).z((Object)wsb);
        final cl1 w = ((dl1$a)ssb$a).w();
        w.T1 = this;
        final int a = w4j.a;
        w.e2(e0.a, "interstitial_dialog");
    }
    
    @Override
    public final void l0(final Dialog dialog, final int n, final int n2) {
        if (n2 == -2) {
            this.C0.cancel();
            ((ggm)this.H0).a((Object)xxf.E0);
        }
        else {
            ((ggm)this.H0).a((Object)xxf.C0);
        }
        this.J0 = false;
        this.I0 = true;
    }
    
    public static final class b
    {
        public final p a;
        public final Resources b;
        
        public b(final p a, final Resources b) {
            this.a = a;
            this.b = b;
        }
    }
}
