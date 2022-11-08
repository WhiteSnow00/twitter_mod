// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.composer.di;

public final class a extends gue implements rtb<z28, oyv>
{
    public final /* synthetic */ zml<ai7> C0;
    
    public a(final zml<ai7> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final z28 z28 = (z28)o;
        zzd.f((Object)z28, "suggestion");
        this.C0.onNext((Object)new ai7$b(z28));
        return oyv.a;
    }
}
