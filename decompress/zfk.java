import java.util.Set;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfk implements zzr<yfk>
{
    public final Context a;
    public final p8d b;
    public final agk c;
    
    public zfk(final Context a, final se9 se9) {
        final t8d t = t8d.t;
        xd.K(t, "ImagePipelineFactory was not initialized!");
        this.a = a;
        if (t.k == null) {
            t.k = t.a();
        }
        final p8d k = t.k;
        this.b = k;
        final agk c = new agk();
        this.c = c;
        final Resources resources = a.getResources();
        synchronized (dm8.class) {
            if (dm8.a == null) {
                dm8.a = new em8();
            }
            final em8 a2 = dm8.a;
            monitorexit(dm8.class);
            final q90 b = t.b();
            Object b2 = null;
            Object a3;
            if (b == null) {
                a3 = null;
            }
            else {
                a3 = b.a();
            }
            if (htv.G0 == null) {
                htv.G0 = new htv();
            }
            final htv g0 = htv.G0;
            final k4h e = k.e;
            ded a4;
            if (se9 != null) {
                a4 = se9.a;
            }
            else {
                a4 = null;
            }
            if (se9 != null) {
                b2 = se9.b;
            }
            c.F0 = resources;
            c.G0 = a2;
            c.H0 = a3;
            c.I0 = g0;
            c.J0 = e;
            c.K0 = a4;
            c.L0 = b2;
        }
    }
    
    public final yfk a() {
        final yfk yfk = new yfk(this.a, this.c, this.b, (Set)null, (Set)null);
        yfk.p = null;
        return yfk;
    }
    
    @Override
    public final /* bridge */ Object get() {
        return this.a();
    }
}
