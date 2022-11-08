// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.dock;

import java.util.Objects;

public final class a implements o69$a
{
    public final /* synthetic */ b a;
    
    public a(final b a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.d.a.i().f("overlay_permission_granted", false).e();
        Objects.requireNonNull(this.a);
    }
    
    public final void b() {
        this.a.d.a.i().f("overlay_permission_granted", true).e();
        Objects.requireNonNull(this.a);
    }
}
