// 
// Decompiled by Procyon v0.6.0
// 

public final class d8i<T> implements f8b
{
    public final f8b F0;
    
    public d8i(final f8b f0) {
        this.F0 = f0;
    }
    
    public final Object a(final Object o, final mp6 mp6) {
        d8i$a d8i$a2 = null;
        Label_0051: {
            if (mp6 instanceof d8i$a) {
                final d8i$a d8i$a = (d8i$a)mp6;
                final int g0 = d8i$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    d8i$a.G0 = g0 + Integer.MIN_VALUE;
                    d8i$a2 = d8i$a;
                    break Label_0051;
                }
            }
            d8i$a2 = new d8i$a(this, mp6);
        }
        final Object f0 = d8i$a2.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = d8i$a2.G0;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
        }
        else {
            jb2.M0(f0);
            final f8b f3 = this.F0;
            if (o instanceof u7i) {
                d8i$a2.G0 = 1;
                if (f3.a(o, (mp6)d8i$a2) == f2) {
                    return f2;
                }
            }
        }
        return vzv.a;
    }
}
