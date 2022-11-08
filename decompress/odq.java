// 
// Decompiled by Procyon v0.6.0
// 

public final class odq<T> implements h8b
{
    public final /* synthetic */ h8b C0;
    
    public odq(final h8b c0) {
        this.C0 = c0;
    }
    
    public final Object a(final Object o, final ap6 ap6) {
        cp6 cp7 = null;
        Label_0050: {
            if (ap6 instanceof odq$a) {
                final cp6 cp6 = (odq$a)ap6;
                final int d0 = cp6.D0;
                if ((d0 & Integer.MIN_VALUE) != 0x0) {
                    cp6.D0 = d0 + Integer.MIN_VALUE;
                    cp7 = cp6;
                    break Label_0050;
                }
            }
            cp7 = new cp6(ap6) {
                public /* synthetic */ Object C0;
                public int D0;
                public final /* synthetic */ odq E0;
                
                public final Object invokeSuspend(final Object c0) {
                    this.C0 = c0;
                    this.D0 |= Integer.MIN_VALUE;
                    return this.E0.a(null, (ap6)this);
                }
            };
        }
        final Object c0 = cp7.C0;
        final zy6 c2 = zy6.C0;
        final int d2 = cp7.D0;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(c0);
        }
        else {
            kq9.b1(c0);
            final h8b c3 = this.C0;
            if (o instanceof pdq) {
                cp7.D0 = 1;
                if (c3.a(o, (ap6)cp7) == c2) {
                    return c2;
                }
            }
        }
        return oyv.a;
    }
}
