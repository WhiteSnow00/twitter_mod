// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = { 65, 66 }, m = "invokeSuspend")
public final class hjq extends l1s implements hub<k1l<Object>, mp6<? super vzv>, Object>
{
    public int F0;
    public Object G0;
    public final yy6 H0;
    public final e8b<Object> I0;
    
    public hjq(final yy6 h0, final e8b<Object> i0, final mp6<? super hjq> mp6) {
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
        final hjq hjq = new hjq(this.H0, this.I0, (mp6<? super hjq>)mp6);
        hjq.G0 = g0;
        return (mp6<vzv>)hjq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((hjq)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final jz6 f0 = jz6.F0;
        final int f2 = this.F0;
        if (f2 != 0) {
            if (f2 != 1 && f2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(o);
        }
        else {
            jb2.M0(o);
            final k1l k1l = (k1l)this.G0;
            if (e0e.a((Object)this.H0, (Object)w2a.F0)) {
                final e8b<Object> i0 = this.I0;
                final hjq$a hjq$a = new hjq$a(k1l);
                this.F0 = 1;
                if (i0.b((f8b)hjq$a, (mp6)this) == f0) {
                    return f0;
                }
            }
            else {
                final yy6 h0 = this.H0;
                final hub<iz6, mp6<? super vzv>, Object> hub = (hub<iz6, mp6<? super vzv>, Object>)new hub<iz6, mp6<? super vzv>, Object>(this.I0, k1l, null) {
                    public int F0;
                    public final e8b<Object> G0;
                    public final k1l<Object> H0;
                    
                    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                        return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, this.H0, mp6) {
                            public int F0;
                            public final e8b<Object> G0;
                            public final k1l<Object> H0;
                        };
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((hjq$b)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
                            final e8b<Object> g0 = this.G0;
                            final hjq$b$a hjq$b$a = new hjq$b$a((k1l)this.H0);
                            this.F0 = 1;
                            if (g0.b((f8b)hjq$b$a, (mp6)this) == f0) {
                                return f0;
                            }
                        }
                        return vzv.a;
                    }
                };
                this.F0 = 2;
                if (ma7.T(h0, (hub)hub, (mp6)this) == f0) {
                    return f0;
                }
            }
        }
        return vzv.a;
    }
}
