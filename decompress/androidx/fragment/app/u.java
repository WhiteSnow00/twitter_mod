// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

public final class u implements Runnable
{
    public final /* synthetic */ v$a C0;
    public final /* synthetic */ v D0;
    
    public u(final v d0, final v$a c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        this.D0.b.remove(this.C0);
        this.D0.c.remove(this.C0);
    }
}
