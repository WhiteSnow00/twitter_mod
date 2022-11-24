// 
// Decompiled by Procyon v0.6.0
// 

public final class hkm<T> implements f8b
{
    public final f8b F0;
    
    public hkm(final f8b f0) {
        this.F0 = f0;
    }
    
    public final Object a(final Object o, final mp6 mp6) {
        hkm$a hkm$a2 = null;
        Label_0051: {
            if (mp6 instanceof hkm$a) {
                final hkm$a hkm$a = (hkm$a)mp6;
                final int g0 = hkm$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    hkm$a.G0 = g0 + Integer.MIN_VALUE;
                    hkm$a2 = hkm$a;
                    break Label_0051;
                }
            }
            hkm$a2 = new hkm$a(this, mp6);
        }
        final Object f0 = hkm$a2.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = hkm$a2.G0;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
        }
        else {
            jb2.M0(f0);
            final f8b f3 = this.F0;
            if (o instanceof ikm) {
                hkm$a2.G0 = 1;
                if (f3.a(o, (mp6)hkm$a2) == f2) {
                    return f2;
                }
            }
        }
        return vzv.a;
    }
}
