// 
// Decompiled by Procyon v0.6.0
// 

public final class je2 extends xd2 implements tkh<zd2>, zd2
{
    public he2 G0;
    public lvj<c6m, ? extends k9e> H0;
    public lvj<c6m, ? extends k9e> I0;
    
    public je2(final zd2 zd2) {
        czd.f((Object)zd2, "defaultParent");
        super(zd2);
    }
    
    public static final Object c(final je2 je2, final lvj i0, final eve eve, final go6 go6) {
        je2.I0 = (lvj<c6m, ? extends k9e>)i0;
        final c6m c6m = (c6m)i0.D0;
        final he2 g0 = je2.G0;
        if (g0 != null) {
            Object o = sh4.h((ftb)new ke2(je2, eve, c6m, g0.a(c6m), null), go6);
            if (o != dy6.D0) {
                o = fzv.a;
            }
            return o;
        }
        czd.m("responder");
        throw null;
    }
    
    public final Object a(final eve eve, final nsb<c6m> nsb, final go6<? super fzv> go6) {
        final Object h = sh4.h((ftb)new ftb<cy6, go6<? super fzv>, Object>(this, eve, nsb, null) {
            public lvj D0;
            public lvj E0;
            public int F0;
            public Object G0;
            public final je2 H0;
            public final eve I0;
            public final nsb<c6m> J0;
            
            public final go6<fzv> create(final Object g0, final go6<?> go6) {
                final ftb<cy6, go6<? super fzv>, Object> ftb = (ftb<cy6, go6<? super fzv>, Object>)new ftb<cy6, go6<? super fzv>, Object>(this.H0, this.I0, this.J0, go6) {
                    public lvj D0;
                    public lvj E0;
                    public int F0;
                    public Object G0;
                    public final je2 H0;
                    public final eve I0;
                    public final nsb<c6m> J0;
                };
                ftb.G0 = g0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((je2$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(Object i0) {
                final dy6 d0 = dy6.D0;
                final int f0 = this.F0;
                Object o2 = null;
                Label_0648: {
                    Label_0582: {
                        eve b = null;
                        je2 je2 = null;
                        Label_0551: {
                            Label_0536: {
                                Label_0129: {
                                    if (f0 != 0) {
                                        Object o = null;
                                        Label_0638: {
                                            Label_0102: {
                                                if (f0 == 1) {
                                                    break Label_0102;
                                                }
                                                Label_0062: {
                                                    if (f0 == 2) {
                                                        break Label_0062;
                                                    }
                                                    Label_0052: {
                                                        if (f0 != 3) {
                                                            break Label_0052;
                                                        }
                                                        Object d2 = o = this.G0;
                                                        try {
                                                            b1n.u(i0);
                                                            break Label_0536;
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            final lvj e0 = this.E0;
                                                            d2 = this.D0;
                                                            b = (eve)this.G0;
                                                            o = d2;
                                                            try {
                                                                b1n.u(i0);
                                                                break Label_0536;
                                                            }
                                                            finally {
                                                                break Label_0536;
                                                            }
                                                            d2 = (o = this.G0);
                                                            b1n.u(i0);
                                                            break Label_0582;
                                                        }
                                                        finally {
                                                            break Label_0638;
                                                        }
                                                    }
                                                }
                                            }
                                            break Label_0129;
                                        }
                                        final lvj lvj = (lvj)o;
                                        o2 = i0;
                                        i0 = lvj;
                                        break Label_0648;
                                    }
                                }
                                b1n.u(i0);
                                final cy6 cy6 = (cy6)this.G0;
                                b = this.H0.b();
                                if (b == null) {
                                    return fzv.a;
                                }
                                if (!this.I0.j()) {
                                    return fzv.a;
                                }
                                final eve i2 = this.I0;
                                final c6m c6m = (c6m)this.J0.invoke();
                                if (c6m == null) {
                                    return fzv.a;
                                }
                                final boolean b2 = false;
                                final c6m g = c6m.g(b.w(i2, false).d());
                                i0 = new lvj((Object)g, (Object)b1n.l(cy6.A()));
                                je2 = this.H0;
                                final lvj e0 = je2.H0;
                                je2.H0 = (lvj<c6m, ? extends k9e>)i0;
                                if (e0 == null) {
                                    break Label_0551;
                                }
                                try {
                                    final c6m c6m2 = (c6m)e0.D0;
                                    int n = b2 ? 1 : 0;
                                    if (c6m2.a <= g.a) {
                                        n = (b2 ? 1 : 0);
                                        if (c6m2.b <= g.b) {
                                            n = (b2 ? 1 : 0);
                                            if (c6m2.c >= g.c) {
                                                n = (b2 ? 1 : 0);
                                                if (c6m2.d >= g.d) {
                                                    n = 1;
                                                }
                                            }
                                        }
                                    }
                                    if (n == 0) {
                                        break Label_0551;
                                    }
                                    final k9e k9e = (k9e)e0.E0;
                                    this.G0 = b;
                                    this.D0 = (lvj)i0;
                                    this.E0 = e0;
                                    this.F0 = 2;
                                    if (k9e.h((go6)this) == d0) {
                                        return d0;
                                    }
                                    je2 = this.H0;
                                    Object o3 = i0;
                                    if (je2.I0 == e0) {
                                        this.G0 = i0;
                                        this.D0 = null;
                                        this.E0 = null;
                                        this.F0 = 3;
                                        if (je2.c(je2, (lvj)i0, b, (go6)this) == d0) {
                                            return d0;
                                        }
                                        o3 = i0;
                                    }
                                    final je2 h0 = this.H0;
                                    i0 = h0.I0;
                                    final lvj<c6m, ? extends k9e> h2 = h0.H0;
                                    if (i0 == h2) {
                                        h0.I0 = null;
                                    }
                                    if (h2 == o3) {
                                        h0.H0 = null;
                                    }
                                    return fzv.a;
                                    final Object o;
                                    i0 = o;
                                }
                                finally {}
                            }
                            break Label_0648;
                        }
                        this.G0 = i0;
                        this.F0 = 1;
                        if (je2.c(je2, (lvj)i0, b, (go6)this) == d0) {
                            return d0;
                        }
                    }
                    final fzv a = fzv.a;
                    final je2 h3 = this.H0;
                    final lvj<c6m, ? extends k9e> i3 = h3.I0;
                    final lvj<c6m, ? extends k9e> h4 = h3.H0;
                    if (i3 == h4) {
                        h3.I0 = null;
                    }
                    if (h4 == i0) {
                        h3.H0 = null;
                    }
                    return a;
                }
                final je2 h5 = this.H0;
                final lvj<c6m, ? extends k9e> i4 = h5.I0;
                final lvj<c6m, ? extends k9e> h6 = h5.H0;
                if (i4 == h6) {
                    h5.I0 = null;
                }
                if (h6 == i0) {
                    h5.H0 = null;
                }
                throw o2;
            }
        }, (go6)go6);
        if (h == dy6.D0) {
            return h;
        }
        return fzv.a;
    }
    
    public final aml<zd2> getKey() {
        return yd2.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
