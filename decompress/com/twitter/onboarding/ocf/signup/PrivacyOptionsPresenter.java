// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.signup;

import android.view.View$OnClickListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.twitter.onboarding.ocf.NavigationHandler;

@a91
public class PrivacyOptionsPresenter
{
    public Boolean a;
    public Boolean b;
    public final NavigationHandler c;
    public final z0l d;
    public y0l e;
    
    public PrivacyOptionsPresenter(final NavigationHandler c, final z0l d, final duo duo) {
        this.c = c;
        this.d = d;
        duo.b(this);
        d.b.o0((CompoundButton$OnCheckedChangeListener)new h2p((Object)this, 1));
        d.a.o0((CompoundButton$OnCheckedChangeListener)new i2p((Object)this, 1));
        d.d.setOnClickListener((View$OnClickListener)new zi2((Object)this, 19));
    }
    
    public final void a() {
        final x0l.a a = new x0l.a();
        a.a = this.d.a.l0();
        a.b = this.d.b.l0();
        final x0l x0l = (x0l)a.e();
        final NavigationHandler c = this.c;
        final dtv a2 = ((bur)this.e).a;
        vmw.g((Object)a2);
        c.d(new rrd(a2, (vrd)x0l), null);
    }
}
