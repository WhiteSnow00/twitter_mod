// 
// Decompiled by Procyon v0.6.0
// 

public final class h2p
{
    public static final Object a(final n3p n3p, final float n, final dc0<Float> dc0, final ap6<? super Float> ap6) {
        cp6 cp7 = null;
        Label_0053: {
            if (ap6 instanceof h2p$a) {
                final cp6 cp6 = (h2p$a)ap6;
                final int e0 = cp6.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    cp6.E0 = e0 + Integer.MIN_VALUE;
                    cp7 = cp6;
                    break Label_0053;
                }
            }
            cp7 = new cp6(ap6) {
                public y6m C0;
                public /* synthetic */ Object D0;
                public int E0;
                
                public final Object invokeSuspend(final Object d0) {
                    this.D0 = d0;
                    this.E0 |= Integer.MIN_VALUE;
                    return h2p.a(null, 0.0f, null, (ap6<? super Float>)this);
                }
            };
        }
        final Object d0 = cp7.D0;
        final zy6 c0 = zy6.C0;
        final int e2 = cp7.E0;
        y6m c2;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2 = cp7.C0;
            kq9.b1(d0);
        }
        else {
            kq9.b1(d0);
            final y6m c3 = new y6m();
            final h2p$b h2p$b = new h2p$b(n, (dc0)dc0, c3, (ap6)null);
            cp7.C0 = c3;
            cp7.E0 = 1;
            if (n3p.c(puh.C0, (gub)h2p$b, (ap6)cp7) == c0) {
                return c0;
            }
            c2 = c3;
        }
        return new Float(c2.C0);
    }
    
    public static final Object c(final n3p n3p, final float n, final ap6<? super Float> ap6) {
        cp6 cp7 = null;
        Label_0049: {
            if (ap6 instanceof h2p$c) {
                final cp6 cp6 = (h2p$c)ap6;
                final int e0 = cp6.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    cp6.E0 = e0 + Integer.MIN_VALUE;
                    cp7 = cp6;
                    break Label_0049;
                }
            }
            cp7 = new cp6(ap6) {
                public y6m C0;
                public /* synthetic */ Object D0;
                public int E0;
                
                public final Object invokeSuspend(final Object d0) {
                    this.D0 = d0;
                    this.E0 |= Integer.MIN_VALUE;
                    return h2p.c(null, 0.0f, (ap6<? super Float>)this);
                }
            };
        }
        final Object d0 = cp7.D0;
        final zy6 c0 = zy6.C0;
        final int e2 = cp7.E0;
        y6m c2;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2 = cp7.C0;
            kq9.b1(d0);
        }
        else {
            kq9.b1(d0);
            final y6m c3 = new y6m();
            final h2p$d h2p$d = new h2p$d(c3, n, (ap6)null);
            cp7.C0 = c3;
            cp7.E0 = 1;
            if (n3p.c(puh.C0, (gub)h2p$d, (ap6)cp7) == c0) {
                return c0;
            }
            c2 = c3;
        }
        return new Float(c2.C0);
    }
}
