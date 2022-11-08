// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.quickshare;

public final class b extends gue implements rtb<n38, Long>
{
    public static final b C0;
    
    static {
        C0 = new b();
    }
    
    public b() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final n38 n38 = (n38)o;
        zzd.f((Object)n38, "selection");
        return n38.a().y().hashCode();
    }
}
