// 
// Decompiled by Procyon v0.6.0
// 

public final class w88
{
    public static final <A, T> Object a(final hm9<A, T> hm9, final A a, final mp6<? super T> mp6) {
        w88$b w88$b2 = null;
        Label_0050: {
            if (mp6 instanceof w88$b) {
                final w88$b w88$b = (w88$b)mp6;
                final int g0 = w88$b.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    w88$b.G0 = g0 + Integer.MIN_VALUE;
                    w88$b2 = w88$b;
                    break Label_0050;
                }
            }
            w88$b2 = new w88$b((mp6)mp6);
        }
        final Object f0 = w88$b2.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = w88$b2.G0;
        Object b;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
            b = f0;
        }
        else {
            jb2.M0(f0);
            final bbq s = hm9.S((Object)a);
            w88$b2.G0 = 1;
            if ((b = sno.b((idq)s, (mp6)w88$b2)) == f2) {
                return f2;
            }
        }
        e0e.e(b, "querySingle(args).await()");
        return b;
    }
    
    public static final <A, T> Object b(final rbq<A, T> rbq, final A a, final mp6<? super T> mp6) {
        w88$a w88$a2 = null;
        Label_0050: {
            if (mp6 instanceof w88$a) {
                final w88$a w88$a = (w88$a)mp6;
                final int g0 = w88$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    w88$a.G0 = g0 + Integer.MIN_VALUE;
                    w88$a2 = w88$a;
                    break Label_0050;
                }
            }
            w88$a2 = new w88$a((mp6)mp6);
        }
        final Object f0 = w88$a2.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = w88$a2.G0;
        Object b;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
            b = f0;
        }
        else {
            jb2.M0(f0);
            final bbq<T> s = rbq.S(a);
            w88$a2.G0 = 1;
            if ((b = sno.b((idq)s, (mp6)w88$a2)) == f2) {
                return f2;
            }
        }
        e0e.e(b, "querySingle(args).await()");
        return b;
    }
}
