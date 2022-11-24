import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dg8 implements x43
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    
    public dg8(final float a, final float b, final float c, final float d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final l9r<s99> a(final boolean b, final hvd hvd, final d86 d86, final int n) {
        e0e.f((Object)hvd, "interactionSource");
        d86.x(-1588756907);
        final sa6$b a = sa6.a;
        d86.x(-492369756);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        final d86$a$a b2 = d86$a.b;
        Object o = y;
        if (y == b2) {
            o = new jjq();
            d86.p(o);
        }
        d86.O();
        final jjq jjq = (jjq)o;
        d86.x(511388516);
        final boolean p4 = d86.P((Object)hvd);
        final boolean p5 = d86.P((Object)jjq);
        final Object y2 = d86.y();
        Object o2;
        if ((p4 | p5) || (o2 = y2) == b2) {
            o2 = new hub<iz6, mp6<? super vzv>, Object>(hvd, jjq, null) {
                public int F0;
                public final hvd G0;
                public final jjq<fvd> H0;
                
                public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                    return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, this.H0, mp6) {
                        public int F0;
                        public final hvd G0;
                        public final jjq<fvd> H0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((dg8$a)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final jz6 f0 = jz6.F0;
                    final int f2 = this.F0;
                    if (f2 != 0) {
                        if (f2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jb2.M0(o);
                    }
                    else {
                        jb2.M0(o);
                        final e8b b = this.G0.b();
                        final f8b<fvd> f8b = (f8b<fvd>)new f8b<fvd>(this.H0) {
                            public final jjq<fvd> F0;
                            
                            public final Object a(final Object o, final mp6 mp6) {
                                final fvd fvd = (fvd)o;
                                if (fvd instanceof drc) {
                                    this.F0.add((Object)fvd);
                                }
                                else if (fvd instanceof erc) {
                                    this.F0.remove((Object)((erc)fvd).a);
                                }
                                else if (fvd instanceof yeb) {
                                    this.F0.add((Object)fvd);
                                }
                                else if (fvd instanceof zeb) {
                                    this.F0.remove((Object)((zeb)fvd).a);
                                }
                                else if (fvd instanceof sxk) {
                                    this.F0.add((Object)fvd);
                                }
                                else if (fvd instanceof txk) {
                                    this.F0.remove((Object)((txk)fvd).a);
                                }
                                else if (fvd instanceof rxk) {
                                    this.F0.remove((Object)((rxk)fvd).a);
                                }
                                return vzv.a;
                            }
                        };
                        this.F0 = 1;
                        if (b.b((f8b)f8b, (mp6)this) == f0) {
                            return f0;
                        }
                    }
                    return vzv.a;
                }
            };
            d86.p(o2);
        }
        d86.O();
        shw.h((Object)hvd, (hub)o2, d86);
        final fvd fvd = (fvd)rr4.L1((List)jjq);
        float n2;
        if (!b) {
            n2 = this.c;
        }
        else if (fvd instanceof sxk) {
            n2 = this.b;
        }
        else if (fvd instanceof drc) {
            n2 = this.d;
        }
        else if (fvd instanceof yeb) {
            n2 = this.e;
        }
        else {
            n2 = this.a;
        }
        d86.x(-492369756);
        Object y3;
        if ((y3 = d86.y()) == b2) {
            y3 = new b80((Object)new s99(n2), cqw.b(s99.Companion));
            d86.p(y3);
        }
        d86.O();
        final b80 b3 = (b80)y3;
        if (!b) {
            d86.x(-1598807481);
            shw.h((Object)new s99(n2), (hub)new hub<iz6, mp6<? super vzv>, Object>(b3, n2, null) {
                public int F0;
                public final b80<s99, ic0> G0;
                public final float H0;
                
                public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                    return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, this.H0, mp6) {
                        public int F0;
                        public final b80<s99, ic0> G0;
                        public final float H0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((dg8$b)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final jz6 f0 = jz6.F0;
                    final int f2 = this.F0;
                    if (f2 != 0) {
                        if (f2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jb2.M0(o);
                    }
                    else {
                        jb2.M0(o);
                        final b80<s99, ic0> g0 = this.G0;
                        final s99 s99 = new s99(this.H0);
                        this.F0 = 1;
                        if (g0.g((Object)s99, (mp6)this) == f0) {
                            return f0;
                        }
                    }
                    return vzv.a;
                }
            }, d86);
            d86.O();
        }
        else {
            d86.x(-1598807310);
            shw.h((Object)new s99(n2), (hub)new hub<iz6, mp6<? super vzv>, Object>(b3, this, n2, fvd, null) {
                public int F0;
                public final b80<s99, ic0> G0;
                public final dg8 H0;
                public final float I0;
                public final fvd J0;
                
                public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                    return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, this.H0, this.I0, this.J0, mp6) {
                        public int F0;
                        public final b80<s99, ic0> G0;
                        public final dg8 H0;
                        public final float I0;
                        public final fvd J0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((dg8$c)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final jz6 f0 = jz6.F0;
                    final int f2 = this.F0;
                    if (f2 != 0) {
                        if (f2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jb2.M0(o);
                    }
                    else {
                        jb2.M0(o);
                        final float f3 = ((s99)this.G0.e()).F0;
                        final boolean b = s99.b(f3, this.H0.b);
                        Object o2 = null;
                        if (b) {
                            Objects.requireNonNull(kgj.Companion);
                            o2 = new sxk(kgj.b);
                        }
                        else if (s99.b(f3, this.H0.d)) {
                            o2 = new drc();
                        }
                        else if (s99.b(f3, this.H0.e)) {
                            o2 = new yeb();
                        }
                        final b80<s99, ic0> g0 = this.G0;
                        final float i0 = this.I0;
                        final fvd j0 = this.J0;
                        this.F0 = 1;
                        if (cz9.a((b80)g0, i0, (fvd)o2, j0, (mp6)this) == f0) {
                            return f0;
                        }
                    }
                    return vzv.a;
                }
            }, d86);
            d86.O();
        }
        final bc0 c = b3.c;
        d86.O();
        return (l9r<s99>)c;
    }
}
