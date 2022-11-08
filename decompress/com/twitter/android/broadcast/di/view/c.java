// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.broadcast.di.view;

public final class c implements p7f
{
    public final /* synthetic */ rd6 C0;
    public final /* synthetic */ y8f D0;
    public final /* synthetic */ pcl E0;
    
    public c(final rd6 c0, final y8f d0, final pcl e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void g(final u4 u4) {
        this.C0.a(this.D0.d0().subscribe((fk6)new kd1((Object)this.E0, 3)));
    }
    
    public final void p(final u4 u4) {
        this.C0.e();
    }
}
