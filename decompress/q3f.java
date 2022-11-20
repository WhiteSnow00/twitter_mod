// 
// Decompiled by Procyon v0.6.0
// 

public final class q3f<T> implements e7b
{
    public final e7b D0;
    
    public q3f(final e7b d0) {
        this.D0 = d0;
    }
    
    public final Object a(final Object o, final go6 go6) {
        io6 io7 = null;
        Label_0051: {
            if (go6 instanceof q3f$a) {
                final io6 io6 = (q3f$a)go6;
                final int e0 = io6.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    io6.E0 = e0 + Integer.MIN_VALUE;
                    io7 = io6;
                    break Label_0051;
                }
            }
            io7 = new io6(this, go6) {
                public Object D0;
                public int E0;
                public final q3f F0;
                
                public final Object invokeSuspend(final Object d0) {
                    this.D0 = d0;
                    this.E0 |= Integer.MIN_VALUE;
                    return this.F0.a(null, (go6)this);
                }
            };
        }
        final Object d0 = io7.D0;
        final dy6 d2 = dy6.D0;
        final int e2 = io7.E0;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(d0);
        }
        else {
            b1n.u(d0);
            final e7b d3 = this.D0;
            if (o instanceof r3f) {
                io7.E0 = 1;
                if (d3.a(o, (go6)io7) == d2) {
                    return d2;
                }
            }
        }
        return fzv.a;
    }
}
