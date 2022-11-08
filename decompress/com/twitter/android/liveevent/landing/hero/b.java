// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero;

import android.os.Parcelable;
import android.os.Bundle;

public final class b extends jt2
{
    public final /* synthetic */ c C0;
    
    public b(final c c0) {
        this.C0 = c0;
    }
    
    public final void a(final Bundle bundle) {
        if (this.C0.Q0.f()) {
            final c c0 = this.C0;
            c0.S0 = c0.K0.c();
            bundle.putBoolean("is_hero_collapsed", this.C0.S0);
        }
    }
    
    public final String getId() {
        return this.C0.getClass().getCanonicalName();
    }
    
    public final void v(final Parcelable parcelable) {
        this.C0.S0 = ((Bundle)parcelable).getBoolean("is_hero_collapsed", false);
    }
}
