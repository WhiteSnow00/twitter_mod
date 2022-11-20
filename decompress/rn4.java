// 
// Decompiled by Procyon v0.6.0
// 

public final class rn4<T> implements e7b
{
    public final e7b D0;
    
    public rn4(final e7b d0) {
        this.D0 = d0;
    }
    
    public final Object a(final Object o, final go6 go6) {
        rn4$a rn4$a2 = null;
        Label_0051: {
            if (go6 instanceof rn4$a) {
                final rn4$a rn4$a = (rn4$a)go6;
                final int e0 = rn4$a.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    rn4$a.E0 = e0 + Integer.MIN_VALUE;
                    rn4$a2 = rn4$a;
                    break Label_0051;
                }
            }
            rn4$a2 = new rn4$a(this, go6);
        }
        final Object d0 = rn4$a2.D0;
        final dy6 d2 = dy6.D0;
        final int e2 = rn4$a2.E0;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(d0);
        }
        else {
            b1n.u(d0);
            final e7b d3 = this.D0;
            if (o instanceof jo4) {
                rn4$a2.E0 = 1;
                if (d3.a(o, (go6)rn4$a2) == d2) {
                    return d2;
                }
            }
        }
        return fzv.a;
    }
}
