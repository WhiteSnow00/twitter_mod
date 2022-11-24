// 
// Decompiled by Procyon v0.6.0
// 

public final class dgp extends pue implements stb<bwe, vzv>
{
    public final zfp F0;
    
    public dgp(final zfp f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bwe j = (bwe)o;
        e0e.f((Object)j, "it");
        final zfp f0 = this.F0;
        f0.j = j;
        if (f0.g() && f0.h() != null) {
            final kgj i = new kgj(w9y.t(j));
            if (!e0e.a((Object)f0.i, (Object)i)) {
                f0.i = i;
                f0.o();
                f0.r();
            }
        }
        return vzv.a;
    }
}
