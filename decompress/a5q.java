// 
// Decompiled by Procyon v0.6.0
// 

public final class a5q<T> implements f8b
{
    public final f8b F0;
    
    public a5q(final f8b f0) {
        this.F0 = f0;
    }
    
    public final Object a(final Object o, final mp6 mp6) {
        op6 op7 = null;
        Label_0051: {
            if (mp6 instanceof a5q$a) {
                final op6 op6 = (a5q$a)mp6;
                final int g0 = op6.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    op6.G0 = g0 + Integer.MIN_VALUE;
                    op7 = op6;
                    break Label_0051;
                }
            }
            op7 = new op6(this, mp6) {
                public Object F0;
                public int G0;
                public final a5q H0;
                
                public final Object invokeSuspend(final Object f0) {
                    this.F0 = f0;
                    this.G0 |= Integer.MIN_VALUE;
                    return this.H0.a(null, (mp6)this);
                }
            };
        }
        final Object f0 = op7.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = op7.G0;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
        }
        else {
            jb2.M0(f0);
            final f8b f3 = this.F0;
            if (o instanceof r4q) {
                op7.G0 = 1;
                if (f3.a(o, (mp6)op7) == f2) {
                    return f2;
                }
            }
        }
        return vzv.a;
    }
}
