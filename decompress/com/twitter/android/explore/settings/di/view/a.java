// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings.di.view;

import androidx.fragment.app.Fragment;
import android.view.View;

public final class a extends pue implements stb<View, xlx<? super dna, tma, yma>>
{
    public final Fragment F0;
    public final fci<?> G0;
    public final igt H0;
    public final sja I0;
    
    public a(final Fragment f0, final fci<?> g0, final igt h0, final sja i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        final Fragment f0 = this.F0;
        e0e.d((Object)f0, "null cannot be cast to non-null type com.twitter.app.common.inject.InjectedPreferenceFragment");
        return new xma((bod)f0, (fci)this.G0, this.H0, this.I0);
    }
}
