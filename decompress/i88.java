// 
// Decompiled by Procyon v0.6.0
// 

public final class i88
{
    public static final <A, T> Object a(final wl9<A, T> wl9, final A a, final ap6<? super T> ap6) {
        i88$b i88$b2 = null;
        Label_0049: {
            if (ap6 instanceof i88$b) {
                final i88$b i88$b = (i88$b)ap6;
                final int d0 = i88$b.D0;
                if ((d0 & Integer.MIN_VALUE) != 0x0) {
                    i88$b.D0 = d0 + Integer.MIN_VALUE;
                    i88$b2 = i88$b;
                    break Label_0049;
                }
            }
            i88$b2 = new i88$b((ap6)ap6);
        }
        final Object c0 = i88$b2.C0;
        final zy6 c2 = zy6.C0;
        final int d2 = i88$b2.D0;
        Object b;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(c0);
            b = c0;
        }
        else {
            kq9.b1(c0);
            final n9q<T> s = wl9.S(a);
            i88$b2.D0 = 1;
            if ((b = jmo.b((ubq)s, (ap6)i88$b2)) == c2) {
                return c2;
            }
        }
        zzd.e(b, "querySingle(args).await()");
        return b;
    }
    
    public static final <A, T> Object b(final daq<A, T> daq, final A a, final ap6<? super T> ap6) {
        i88$a i88$a2 = null;
        Label_0049: {
            if (ap6 instanceof i88$a) {
                final i88$a i88$a = (i88$a)ap6;
                final int d0 = i88$a.D0;
                if ((d0 & Integer.MIN_VALUE) != 0x0) {
                    i88$a.D0 = d0 + Integer.MIN_VALUE;
                    i88$a2 = i88$a;
                    break Label_0049;
                }
            }
            i88$a2 = new i88$a((ap6)ap6);
        }
        final Object c0 = i88$a2.C0;
        final zy6 c2 = zy6.C0;
        final int d2 = i88$a2.D0;
        Object b;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(c0);
            b = c0;
        }
        else {
            kq9.b1(c0);
            final n9q s = daq.S((Object)a);
            i88$a2.D0 = 1;
            if ((b = jmo.b((ubq)s, (ap6)i88$a2)) == c2) {
                return c2;
            }
        }
        zzd.e(b, "querySingle(args).await()");
        return b;
    }
}
