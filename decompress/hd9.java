import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = { 260 }, m = "invokeSuspend")
public final class hd9 extends l1s implements hub<bqk, mp6<? super vzv>, Object>
{
    public int F0;
    public Object G0;
    public final boolean H0;
    public final l9r<stb<tpk, Boolean>> I0;
    public final l9r<ptb<Boolean>> J0;
    public final dpj K0;
    public final xp3<jc9> L0;
    public final boolean M0;
    
    public hd9(final boolean h0, final l9r<? extends stb<? super tpk, Boolean>> i0, final l9r<? extends ptb<Boolean>> j0, final dpj k0, final xp3<jc9> l0, final boolean m0, final mp6<? super hd9> mp6) {
        this.H0 = h0;
        this.I0 = (l9r<stb<tpk, Boolean>>)i0;
        this.J0 = (l9r<ptb<Boolean>>)j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
        final hd9 hd9 = new hd9(this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, (mp6<? super hd9>)mp6);
        hd9.G0 = g0;
        return (mp6<vzv>)hd9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((hd9)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final bqk bqk = (bqk)this.G0;
            if (!this.H0) {
                return vzv.a;
            }
            final hub<iz6, mp6<? super vzv>, Object> hub = (hub<iz6, mp6<? super vzv>, Object>)new hub<iz6, mp6<? super vzv>, Object>(bqk, this.I0, this.J0, this.K0, this.L0, this.M0, null) {
                public int F0;
                public Object G0;
                public final bqk H0;
                public final l9r<stb<tpk, Boolean>> I0;
                public final l9r<ptb<Boolean>> J0;
                public final dpj K0;
                public final xp3<jc9> L0;
                public final boolean M0;
                
                public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
                    final hub<iz6, mp6<? super vzv>, Object> hub = (hub<iz6, mp6<? super vzv>, Object>)new hub<iz6, mp6<? super vzv>, Object>(this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, mp6) {
                        public int F0;
                        public Object G0;
                        public final bqk H0;
                        public final l9r<stb<tpk, Boolean>> I0;
                        public final l9r<ptb<Boolean>> J0;
                        public final dpj K0;
                        public final xp3<jc9> L0;
                        public final boolean M0;
                    };
                    hub.G0 = g0;
                    return (mp6<vzv>)hub;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((hd9$a)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
                }
                
                public final Object invokeSuspend(Object g0) {
                    final jz6 f0 = jz6.F0;
                    final int f2 = this.F0;
                    Label_0132: {
                        if (f2 != 0) {
                            if (f2 == 1) {
                                final iz6 iz6 = (iz6)this.G0;
                                try {
                                    jb2.M0(g0);
                                    return vzv.a;
                                }
                                catch (final CancellationException f0) {
                                    g0 = iz6;
                                    break Label_0132;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jb2.M0(g0);
                        g0 = this.G0;
                        try {
                            final bqk h0 = this.H0;
                            final hub<oe1, mp6<? super vzv>, Object> hub = (hub<oe1, mp6<? super vzv>, Object>)new hub<oe1, mp6<? super vzv>, Object>(g0, this.I0, this.J0, this.K0, this.L0, this.M0, null) {
                                public erw G0;
                                public xp3 H0;
                                public iz6 I0;
                                public boolean J0;
                                public int K0;
                                public Object L0;
                                public final iz6 M0;
                                public final l9r<stb<tpk, Boolean>> N0;
                                public final l9r<ptb<Boolean>> O0;
                                public final dpj P0;
                                public final xp3<jc9> Q0;
                                public final boolean R0;
                                
                                public final mp6<vzv> create(final Object l0, final mp6<?> mp6) {
                                    final hub<oe1, mp6<? super vzv>, Object> hub = (hub<oe1, mp6<? super vzv>, Object>)new hub<oe1, mp6<? super vzv>, Object>(this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, mp6) {
                                        public erw G0;
                                        public xp3 H0;
                                        public iz6 I0;
                                        public boolean J0;
                                        public int K0;
                                        public Object L0;
                                        public final iz6 M0;
                                        public final l9r<stb<tpk, Boolean>> N0;
                                        public final l9r<ptb<Boolean>> O0;
                                        public final dpj P0;
                                        public final xp3<jc9> Q0;
                                        public final boolean R0;
                                    };
                                    hub.L0 = l0;
                                    return (mp6<vzv>)hub;
                                }
                                
                                public final Object invoke(final Object o, final Object o2) {
                                    return ((hd9$a$a)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
                                }
                                
                                public final Object invokeSuspend(Object l0) {
                                    final jz6 f0 = jz6.F0;
                                    final int k0 = this.K0;
                                    while (true) {
                                        Object i0 = null;
                                        Object h0 = null;
                                        Object q0 = null;
                                        Object o = null;
                                        hub<oe1, mp6<? super vzv>, Object> hub = null;
                                        Label_0566: {
                                            erw g2 = null;
                                            Object a2 = null;
                                            Label_0256: {
                                                Object o2;
                                                if (k0 != 0) {
                                                    if (k0 != 1) {
                                                        if (k0 == 2) {
                                                            final boolean j0 = this.J0;
                                                            i0 = this.I0;
                                                            h0 = this.H0;
                                                            final erw g0 = this.G0;
                                                            q0 = this.L0;
                                                            Object a = h0;
                                                            try {
                                                                try {
                                                                    jb2.M0(l0);
                                                                    o = this;
                                                                    a = i0;
                                                                    i0 = l0;
                                                                }
                                                                finally {}
                                                            }
                                                            catch (final CancellationException o) {
                                                                hub = this;
                                                                break Label_0566;
                                                            }
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    g2 = this.G0;
                                                    h0 = this.L0;
                                                    jb2.M0(l0);
                                                    a2 = l0;
                                                    l0 = this;
                                                    break Label_0256;
                                                }
                                                else {
                                                    jb2.M0(l0);
                                                    l0 = this.L0;
                                                    o2 = this;
                                                }
                                                if (!r1n.R(((hd9$a$a)o2).M0)) {
                                                    return vzv.a;
                                                }
                                                g2 = new erw();
                                                final l9r<stb<tpk, Boolean>> n0 = ((hd9$a$a)o2).N0;
                                                final l9r<ptb<Boolean>> o3 = ((hd9$a$a)o2).O0;
                                                final dpj p0 = ((hd9$a$a)o2).P0;
                                                ((hd9$a$a)o2).L0 = l0;
                                                ((hd9$a$a)o2).G0 = g2;
                                                ((hd9$a$a)o2).H0 = null;
                                                ((hd9$a$a)o2).I0 = null;
                                                ((hd9$a$a)o2).K0 = 1;
                                                a2 = id9.a((oe1)l0, (l9r)n0, (l9r)o3, g2, p0, (mp6)o2);
                                                if (a2 == f0) {
                                                    return f0;
                                                }
                                                final Object o4 = o2;
                                                h0 = l0;
                                                l0 = o4;
                                            }
                                            o = a2;
                                            if (o == null) {
                                                final Object o5 = h0;
                                                final Object o2 = l0;
                                                l0 = o5;
                                                continue;
                                            }
                                            q0 = ((hd9$a$a)l0).Q0;
                                            final boolean r0 = ((hd9$a$a)l0).R0;
                                            final dpj p2 = ((hd9$a$a)l0).P0;
                                            i0 = ((hd9$a$a)l0).M0;
                                            Label_0554: {
                                                try {
                                                    final tpk tpk = (tpk)((awj)o).F0;
                                                    final long a3 = ((kgj)((awj)o).G0).a;
                                                    final boolean b = r0;
                                                    ((hd9$a$a)l0).L0 = h0;
                                                    ((hd9$a$a)l0).G0 = g2;
                                                    ((hd9$a$a)l0).H0 = (xp3)q0;
                                                    ((hd9$a$a)l0).I0 = (iz6)i0;
                                                    ((hd9$a$a)l0).J0 = r0;
                                                    ((hd9$a$a)l0).K0 = 2;
                                                    try {
                                                        final Object b2 = id9.b((oe1)h0, tpk, a3, g2, (eip)q0, b, p2, (mp6)l0);
                                                        if (b2 == f0) {
                                                            return f0;
                                                        }
                                                        final oe1 oe1 = (oe1)h0;
                                                        h0 = q0;
                                                        o = i0;
                                                        final boolean j0 = r0;
                                                        q0 = oe1;
                                                        final erw g0 = g2;
                                                        i0 = b2;
                                                        Object a = o;
                                                        try {
                                                            if (i0) {
                                                                final long b3 = g0.b();
                                                                float n2;
                                                                if (j0) {
                                                                    n2 = -1.0f;
                                                                }
                                                                else {
                                                                    n2 = 1.0f;
                                                                }
                                                                a = new jc9$d(zzz.i(crw.b(b3) * n2, crw.c(b3) * n2));
                                                            }
                                                            else {
                                                                a = jc9$a.a;
                                                            }
                                                            ((eip)h0).o(a);
                                                        }
                                                        catch (final CancellationException o) {}
                                                        finally {
                                                            a = h0;
                                                        }
                                                    }
                                                    catch (final CancellationException o) {}
                                                }
                                                catch (final CancellationException o) {
                                                    break Label_0554;
                                                }
                                                ((eip)q0).o((Object)jc9$a.a);
                                            }
                                            final eip eip = (eip)q0;
                                            q0 = h0;
                                            h0 = eip;
                                        }
                                        if (!r1n.R((iz6)i0)) {
                                            throw o;
                                        }
                                        ((eip)h0).o((Object)jc9$a.a);
                                        h0 = q0;
                                        final hub<oe1, mp6<? super vzv>, Object> hub2 = (hub<oe1, mp6<? super vzv>, Object>)hub;
                                        l0 = h0;
                                        Object o2 = hub2;
                                        continue;
                                    }
                                }
                            };
                            this.G0 = g0;
                            this.F0 = 1;
                            if (h0.Z((hub<? super oe1, ? super mp6<? super Object>, ?>)hub, (mp6<? super Object>)this) == f0) {
                                return f0;
                            }
                            return vzv.a;
                        }
                        catch (final CancellationException ex) {}
                    }
                    if (!r1n.R((iz6)g0)) {
                        throw f0;
                    }
                    return vzv.a;
                }
            };
            this.F0 = 1;
            if (r1n.u((hub)hub, (mp6)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
