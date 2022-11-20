import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4p implements sbi
{
    public final m8r<q4p> D0;
    public final boolean E0;
    
    public f4p(final m8r<q4p> d0, final boolean e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object a(final long n, final go6 go6) {
        return gw8.f();
    }
    
    public final long b(long n, final long n2, final int n3) {
        if (this.E0) {
            final q4p q4p = (q4p)this.D0.getValue();
            if (q4p.d.a()) {
                Objects.requireNonNull(wfj.Companion);
                n = wfj.b;
            }
            else {
                n = q4p.h(q4p.e(q4p.d.b(q4p.e(q4p.g(n2)))));
            }
        }
        else {
            Objects.requireNonNull(wfj.Companion);
            n = wfj.b;
        }
        return n;
    }
    
    public final Object c(long n, long e0, final go6<? super mqw> go6) {
        Object o = null;
        Label_0059: {
            if (go6 instanceof f4p$a) {
                final f4p$a f4p$a = (f4p$a)go6;
                final int h0 = f4p$a.H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    f4p$a.H0 = h0 + Integer.MIN_VALUE;
                    o = f4p$a;
                    break Label_0059;
                }
            }
            o = new f4p$a(this, (go6)go6);
        }
        Object o2 = ((f4p$a)o).F0;
        final dy6 d0 = dy6.D0;
        final int h2 = ((f4p$a)o).H0;
        f4p d2 = null;
        Label_0217: {
            if (h2 != 0) {
                if (h2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0 = ((f4p$a)o).E0;
                d2 = ((f4p$a)o).D0;
                b1n.u(o2);
            }
            else {
                b1n.u(o2);
                if (!this.E0) {
                    Objects.requireNonNull(mqw.Companion);
                    n = mqw.b;
                    d2 = this;
                    break Label_0217;
                }
                final q4p q4p = (q4p)this.D0.getValue();
                ((f4p$a)o).D0 = this;
                ((f4p$a)o).E0 = e0;
                ((f4p$a)o).H0 = 1;
                o2 = q4p.b(e0, (go6<? super mqw>)o);
                if (o2 == d0) {
                    return d0;
                }
                d2 = this;
            }
            n = mqw.d(e0, ((mqw)o2).a);
        }
        final mqw mqw = new mqw(n);
        ((q4p)d2.D0.getValue()).d(false);
        return mqw;
    }
    
    public final long f(final long n, int n2) {
        Objects.requireNonNull(ybi.Companion);
        if (n2 == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ((q4p)this.D0.getValue()).d(true);
        }
        Objects.requireNonNull(wfj.Companion);
        return wfj.b;
    }
}
