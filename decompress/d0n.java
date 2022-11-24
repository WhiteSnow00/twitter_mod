import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = { 356 }, m = "invokeSuspend")
public final class d0n extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public Object G0;
    public final hvd H0;
    public final n0n I0;
    
    public d0n(final hvd h0, final n0n i0, final mp6<? super d0n> mp6) {
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
        final d0n d0n = new d0n(this.H0, this.I0, (mp6<? super d0n>)mp6);
        d0n.G0 = g0;
        return (mp6<vzv>)d0n;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((d0n)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final iz6 iz6 = (iz6)this.G0;
            final e8b b = this.H0.b();
            final f8b<fvd> f8b = (f8b<fvd>)new f8b<fvd>(this.I0, iz6) {
                public final n0n F0;
                public final iz6 G0;
                
                public final Object a(fvd e, final mp6<? super vzv> mp6) {
                    e = e;
                    if (e instanceof sxk) {
                        this.F0.e((sxk)e, this.G0);
                    }
                    else if (e instanceof txk) {
                        this.F0.g(((txk)e).a);
                    }
                    else if (e instanceof rxk) {
                        this.F0.g(((rxk)e).a);
                    }
                    else {
                        final n0n f0 = this.F0;
                        final iz6 g0 = this.G0;
                        Objects.requireNonNull(f0);
                        e0e.f((Object)e, "interaction");
                        e0e.f((Object)g0, "scope");
                        final r9r f2 = f0.F0;
                        Objects.requireNonNull(f2);
                        final boolean b = e instanceof drc;
                        if (b) {
                            f2.d.add(e);
                        }
                        else if (e instanceof erc) {
                            f2.d.remove(((erc)e).a);
                        }
                        else if (e instanceof yeb) {
                            f2.d.add(e);
                        }
                        else if (e instanceof zeb) {
                            f2.d.remove(((zeb)e).a);
                        }
                        else if (e instanceof nc9) {
                            f2.d.add(e);
                        }
                        else if (e instanceof oc9) {
                            f2.d.remove(((oc9)e).a);
                        }
                        else {
                            if (!(e instanceof mc9)) {
                                return vzv.a;
                            }
                            f2.d.remove(((mc9)e).a);
                        }
                        final fvd e2 = (fvd)rr4.L1((List)f2.d);
                        if (!e0e.a((Object)f2.e, (Object)e2)) {
                            if (e2 != null) {
                                float n;
                                if (b) {
                                    n = ((f0n)f2.b.getValue()).c;
                                }
                                else if (e instanceof yeb) {
                                    n = ((f0n)f2.b.getValue()).b;
                                }
                                else if (e instanceof nc9) {
                                    n = ((f0n)f2.b.getValue()).a;
                                }
                                else {
                                    n = 0.0f;
                                }
                                final jcu a = o0n.a;
                                jcu jcu;
                                if (e2 instanceof drc) {
                                    jcu = o0n.a;
                                }
                                else if (e2 instanceof yeb) {
                                    jcu = new jcu(45, (nq9)pq9.d, 2);
                                }
                                else if (e2 instanceof nc9) {
                                    jcu = new jcu(45, (nq9)pq9.d, 2);
                                }
                                else {
                                    jcu = o0n.a;
                                }
                                ma7.D(g0, (yy6)null, 0, (hub)new p9r(f2, n, (ac0)jcu, (mp6)null), 3);
                            }
                            else {
                                e = f2.e;
                                final jcu a2 = o0n.a;
                                jcu jcu2;
                                if (e instanceof drc) {
                                    jcu2 = o0n.a;
                                }
                                else if (e instanceof yeb) {
                                    jcu2 = o0n.a;
                                }
                                else if (e instanceof nc9) {
                                    jcu2 = new jcu(150, (nq9)pq9.d, 2);
                                }
                                else {
                                    jcu2 = o0n.a;
                                }
                                ma7.D(g0, (yy6)null, 0, (hub)new q9r(f2, (ac0)jcu2, (mp6)null), 3);
                            }
                            f2.e = e2;
                        }
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
}
