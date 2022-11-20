// 
// Decompiled by Procyon v0.6.0
// 

public final class u78
{
    public static final <A, T> Object a(final fl9<A, T> fl9, final A a, final go6<? super T> go6) {
        u78$b u78$b2 = null;
        Label_0050: {
            if (go6 instanceof u78$b) {
                final u78$b u78$b = (u78$b)go6;
                final int e0 = u78$b.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    u78$b.E0 = e0 + Integer.MIN_VALUE;
                    u78$b2 = u78$b;
                    break Label_0050;
                }
            }
            u78$b2 = new u78$b((go6)go6);
        }
        final Object d0 = u78$b2.D0;
        final dy6 d2 = dy6.D0;
        final int e2 = u78$b2.E0;
        Object b;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(d0);
            b = d0;
        }
        else {
            b1n.u(d0);
            final eaq<T> r = fl9.R(a);
            u78$b2.E0 = 1;
            if ((b = ymo.b((lcq)r, (go6)u78$b2)) == d2) {
                return d2;
            }
        }
        czd.e(b, "querySingle(args).await()");
        return b;
    }
    
    public static final <A, T> Object b(final uaq<A, T> uaq, final A a, final go6<? super T> go6) {
        u78$a u78$a2 = null;
        Label_0050: {
            if (go6 instanceof u78$a) {
                final u78$a u78$a = (u78$a)go6;
                final int e0 = u78$a.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    u78$a.E0 = e0 + Integer.MIN_VALUE;
                    u78$a2 = u78$a;
                    break Label_0050;
                }
            }
            u78$a2 = new u78$a((go6)go6);
        }
        final Object d0 = u78$a2.D0;
        final dy6 d2 = dy6.D0;
        final int e2 = u78$a2.E0;
        Object b;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(d0);
            b = d0;
        }
        else {
            b1n.u(d0);
            final eaq r = uaq.R((Object)a);
            u78$a2.E0 = 1;
            if ((b = ymo.b((lcq)r, (go6)u78$a2)) == d2) {
                return d2;
            }
        }
        czd.e(b, "querySingle(args).await()");
        return b;
    }
}
