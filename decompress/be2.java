// 
// Decompiled by Procyon v0.6.0
// 

public final class be2 implements ae2
{
    public final suh<ge2> a;
    
    public be2() {
        this.a = (suh<ge2>)new suh((Object[])new ge2[16]);
    }
    
    public final Object a(c6m d0, final go6<? super fzv> go6) {
        final dy6 d2 = dy6.D0;
        be2$a be2$a2 = null;
        Label_0056: {
            if (go6 instanceof be2$a) {
                final be2$a be2$a = (be2$a)go6;
                final int j0 = be2$a.J0;
                if ((j0 & Integer.MIN_VALUE) != 0x0) {
                    be2$a.J0 = j0 + Integer.MIN_VALUE;
                    be2$a2 = be2$a;
                    break Label_0056;
                }
            }
            be2$a2 = new be2$a(this, (go6)go6);
        }
        final Object h0 = be2$a2.H0;
        final int j2 = be2$a2.J0;
        while (true) {
            int g0 = 0;
            int f0 = 0;
            dy6 dy6 = null;
            Label_0312: {
                go6 go7;
                Object[] e2;
                int f2;
                dy6 dy7;
                if (j2 != 0) {
                    if (j2 == 1) {
                        g0 = be2$a2.G0;
                        f0 = be2$a2.F0;
                        final Object[] e0 = be2$a2.E0;
                        d0 = be2$a2.D0;
                        b1n.u(h0);
                        dy6 = d2;
                        go7 = (go6)be2$a2;
                        e2 = e0;
                        break Label_0312;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    b1n.u(h0);
                    final suh<ge2> a = this.a;
                    f2 = a.F0;
                    if (f2 <= 0) {
                        return fzv.a;
                    }
                    final Object[] d3 = a.D0;
                    czd.d((Object)d3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    final go6 go8 = (go6)be2$a2;
                    g0 = 0;
                    dy7 = d2;
                    e2 = d3;
                    go7 = go8;
                }
                final ge2 ge2 = (ge2)e2[g0];
                ((be2$a)go7).D0 = d0;
                ((be2$a)go7).E0 = e2;
                ((be2$a)go7).F0 = f2;
                ((be2$a)go7).G0 = g0;
                ((be2$a)go7).J0 = 1;
                zd2 zd2;
                if ((zd2 = ge2.E0) == null) {
                    zd2 = ge2.D0;
                }
                final eve b = ge2.b();
                Object o = null;
                Label_0294: {
                    if (b != null) {
                        o = zd2.a(b, (nsb)new fe2(d0, ge2), go7);
                        if (o == d2) {
                            break Label_0294;
                        }
                    }
                    o = fzv.a;
                }
                dy6 = dy7;
                f0 = f2;
                if (o == dy7) {
                    return dy7;
                }
            }
            final int n = g0 + 1;
            dy6 dy7 = dy6;
            int f2;
            if ((g0 = n) < (f2 = f0)) {
                continue;
            }
            break;
        }
        return fzv.a;
    }
}
