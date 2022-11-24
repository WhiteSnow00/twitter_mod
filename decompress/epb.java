import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epb<GettersT> implements x6j<kni, b3g<? extends j1m<GettersT>>>, usm, q3g
{
    public final x6j<kni, b3g<Cursor>> F0;
    public final rmq G0;
    
    public epb(final x6j<kni, b3g<Cursor>> f0, final rmq g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean a() {
        final x6j<kni, b3g<Cursor>> f0 = this.F0;
        q3g q3g;
        if (f0 instanceof q3g) {
            q3g = (q3g)f0;
        }
        else {
            q3g = null;
        }
        boolean b = true;
        if (q3g == null || !q3g.a()) {
            b = false;
        }
        return b;
    }
    
    public final void close() {
    }
    
    @Override
    public final void d() {
        final x6j<kni, b3g<Cursor>> f0 = this.F0;
        usm usm;
        if (f0 instanceof usm) {
            usm = (usm)f0;
        }
        else {
            usm = null;
        }
        if (usm != null) {
            usm.d();
        }
    }
    
    @Override
    public final t5j w(final Object o) {
        e0e.f((Object)o, "args");
        final t5j map = this.F0.w(kni.a).map((rtb)new x0i((stb)new dpb(this), 8));
        e0e.e((Object)map, "override fun queryObserv\u2026t\n            }\n        }");
        return map;
    }
}
