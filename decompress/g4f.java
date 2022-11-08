// 
// Decompiled by Procyon v0.6.0
// 

public final class g4f<T> implements h8b
{
    public final /* synthetic */ h8b C0;
    
    public g4f(final h8b c0) {
        this.C0 = c0;
    }
    
    public final Object a(final Object o, final ap6 ap6) {
        g4f$a g4f$a2 = null;
        Label_0050: {
            if (ap6 instanceof g4f$a) {
                final g4f$a g4f$a = (g4f$a)ap6;
                final int d0 = g4f$a.D0;
                if ((d0 & Integer.MIN_VALUE) != 0x0) {
                    g4f$a.D0 = d0 + Integer.MIN_VALUE;
                    g4f$a2 = g4f$a;
                    break Label_0050;
                }
            }
            g4f$a2 = new g4f$a(this, ap6);
        }
        final Object c0 = g4f$a2.C0;
        final zy6 c2 = zy6.C0;
        final int d2 = g4f$a2.D0;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(c0);
        }
        else {
            kq9.b1(c0);
            final h8b c3 = this.C0;
            if (o instanceof h4f) {
                g4f$a2.D0 = 1;
                if (c3.a(o, (ap6)g4f$a2) == c2) {
                    return c2;
                }
            }
        }
        return oyv.a;
    }
}
