import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uob<T> implements f6j<pmi, t2g<T>>, orm, i3g
{
    public final g3g C0;
    public final kyr<z2g<T>> D0;
    public final int E0;
    public final tob F0;
    public final rv1<t2g<T>> G0;
    
    public uob(final g3g c0, final kyr d0, final ibm ibm, final int n, final int n2, final hg8 hg8) {
        zzd.f((Object)d0, "loaderSupplier");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        this.D0 = (kyr<z2g<T>>)d0;
        this.E0 = 1;
        this.F0 = new tob(this);
        this.G0 = (rv1<t2g<T>>)new rv1();
        ibm.i((rj)new czo((Object)this, 21));
    }
    
    public final boolean a() {
        final z2g c = this.C0.c(this.E0);
        i3g i3g;
        if (c instanceof i3g) {
            i3g = (i3g)c;
        }
        else {
            i3g = null;
        }
        boolean b = true;
        if (i3g == null || !i3g.a()) {
            b = false;
        }
        return b;
    }
    
    public final void d() {
        this.C0.e(this.E0, (Bundle)null, (g3g$a)this.F0);
    }
    
    @Override
    public final b5j v(final Object o) {
        zzd.f((Object)o, "args");
        this.C0.d(this.E0, (Bundle)null, (g3g$a)this.F0);
        return (b5j)this.G0;
    }
}
