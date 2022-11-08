// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.quickshare;

public final class a extends gue implements rtb<z28, oyv>
{
    public final /* synthetic */ zml<cvp> C0;
    
    public a(final zml<cvp> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final z28 z28 = (z28)o;
        zzd.f((Object)z28, "suggestion");
        this.C0.onNext((Object)new cvp$d(z28));
        return oyv.a;
    }
}
