// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
public final class h0n extends l1s implements hub<iz6, mp6<? super iae>, Object>
{
    public Object F0;
    public final g0n G0;
    
    public h0n(final g0n g0, final mp6<? super h0n> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final h0n h0n = new h0n(this.G0, (mp6<? super h0n>)mp6);
        h0n.F0 = f0;
        return (mp6<vzv>)h0n;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((h0n)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final iz6 iz6 = (iz6)this.F0;
        ma7.D(iz6, (yy6)null, 0, (hub)new hub<iz6, mp6<? super vzv>, Object>(this.G0, null) {
            public int F0;
            public final g0n G0;
            
            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, mp6) {
                    public int F0;
                    public final g0n G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h0n$a)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
                    final b80 g = this.G0.g;
                    final Float n = new Float(1.0f);
                    final jcu m0 = eg8.M0(75, 0, (nq9)pq9.d, 2);
                    this.F0 = 1;
                    if (b80.c(g, (Object)n, (ac0)m0, (stb)null, (mp6)this, 12) == f0) {
                        return f0;
                    }
                }
                return vzv.a;
            }
        }, 3);
        ma7.D(iz6, (yy6)null, 0, (hub)new hub<iz6, mp6<? super vzv>, Object>(this.G0, null) {
            public int F0;
            public final g0n G0;
            
            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, mp6) {
                    public int F0;
                    public final g0n G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h0n$b)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
                    final b80 h = this.G0.h;
                    final Float n = new Float(1.0f);
                    final jcu m0 = eg8.M0(225, 0, (nq9)pq9.a, 2);
                    this.F0 = 1;
                    if (b80.c(h, (Object)n, (ac0)m0, (stb)null, (mp6)this, 12) == f0) {
                        return f0;
                    }
                }
                return vzv.a;
            }
        }, 3);
        return ma7.D(iz6, (yy6)null, 0, (hub)new hub<iz6, mp6<? super vzv>, Object>(this.G0, null) {
            public int F0;
            public final g0n G0;
            
            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, mp6) {
                    public int F0;
                    public final g0n G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h0n$c)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
                    final b80 i = this.G0.i;
                    final Float n = new Float(1.0f);
                    final jcu m0 = eg8.M0(225, 0, (nq9)pq9.d, 2);
                    this.F0 = 1;
                    if (b80.c(i, (Object)n, (ac0)m0, (stb)null, (mp6)this, 12) == f0) {
                        return f0;
                    }
                }
                return vzv.a;
            }
        }, 3);
    }
}
