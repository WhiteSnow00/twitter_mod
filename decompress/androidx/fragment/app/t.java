// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

public final class t implements Runnable
{
    public final /* synthetic */ v$a C0;
    public final /* synthetic */ v D0;
    
    public t(final v d0, final v$a c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        if (this.D0.b.contains(this.C0)) {
            final v$a c0 = this.C0;
            mag.a(((v.b)c0).a, ((v.b)c0).c.j1);
        }
    }
}
