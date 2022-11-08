// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.violations.di;

import android.view.View;

public final class a extends gue implements rtb<View, okx>
{
    public final /* synthetic */ de6 C0;
    public final /* synthetic */ de6 D0;
    public final /* synthetic */ tqm E0;
    public final /* synthetic */ nw8 F0;
    public final /* synthetic */ w7t G0;
    public final /* synthetic */ ibm H0;
    public final /* synthetic */ z7x I0;
    
    public a(final de6 c0, final de6 d0, final tqm e0, final nw8 f0, final w7t g0, final ibm h0, final z7x i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        zzd.f((Object)view, "view");
        return new yqw(view, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0);
    }
}
