import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = { 176 }, m = "invokeSuspend")
public final class ib9 extends p0s implements ftb<ppk, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final qsb<wfj, fzv> F0;
    public final ftb<hpk, wfj, fzv> G0;
    public final nsb<fzv> H0;
    public final nsb<fzv> I0;
    
    public ib9(final qsb<? super wfj, fzv> f0, final ftb<? super hpk, ? super wfj, fzv> g0, final nsb<fzv> h0, final nsb<fzv> i0, final go6<? super ib9> go6) {
        this.F0 = (qsb<wfj, fzv>)f0;
        this.G0 = (ftb<hpk, wfj, fzv>)g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final ib9 ib9 = new ib9(this.F0, this.G0, this.H0, this.I0, (go6<? super ib9>)go6);
        ib9.E0 = e0;
        return (go6<fzv>)ib9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ib9)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final dy6 d0 = dy6.D0;
        final int d2 = this.D0;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(o);
        }
        else {
            b1n.u(o);
            final ppk ppk = (ppk)this.E0;
            final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, this.I0, null) {
                public hpk E0;
                public q7m F0;
                public le1 G0;
                public zok H0;
                public q7m I0;
                public hpk J0;
                public int K0;
                public float L0;
                public float M0;
                public float N0;
                public int O0;
                public Object P0;
                public final qsb<wfj, fzv> Q0;
                public final ftb<hpk, wfj, fzv> R0;
                public final nsb<fzv> S0;
                public final nsb<fzv> T0;
                
                public final go6<fzv> create(final Object p2, final go6<?> go6) {
                    final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(this.Q0, this.R0, this.S0, this.T0, go6) {
                        public hpk E0;
                        public q7m F0;
                        public le1 G0;
                        public zok H0;
                        public q7m I0;
                        public hpk J0;
                        public int K0;
                        public float L0;
                        public float M0;
                        public float N0;
                        public int O0;
                        public Object P0;
                        public final qsb<wfj, fzv> Q0;
                        public final ftb<hpk, wfj, fzv> R0;
                        public final nsb<fzv> S0;
                        public final nsb<fzv> T0;
                    };
                    ftb.P0 = p2;
                    return (go6<fzv>)ftb;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((ib9$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                }
                
                public final Object invokeSuspend(Object d) {
                    final dy6 d2 = dy6.D0;
                    final int o0 = this.O0;
                    Object o6 = null;
                    Label_1386: {
                        le1 p3 = null;
                        q7m q7m2 = null;
                        dy6 dy7 = null;
                        hpk hpk2 = null;
                        while (true) {
                            Label_1216: {
                                hpk e0 = null;
                                dy6 dy6 = null;
                                go6 go8 = null;
                                le1 le6 = null;
                                Label_1065: {
                                    le1 p2 = null;
                                    Object o5 = null;
                                    q7m q7m = null;
                                Label_0451:
                                    while (true) {
                                        q7m i0 = null;
                                        hpk j0 = null;
                                        Label_1045: {
                                            float n0 = 0.0f;
                                            float m0 = 0.0f;
                                            float l0 = 0.0f;
                                            int n2 = 0;
                                            Object o2 = null;
                                            le1 le1 = null;
                                            Object d3 = null;
                                            q7m f2 = null;
                                            Object o4 = null;
                                            le1 p = null;
                                            Label_0578: {
                                                Object b;
                                                if (o0 != 0) {
                                                    if (o0 != 1) {
                                                        if (o0 == 2) {
                                                            n0 = this.N0;
                                                            m0 = this.M0;
                                                            l0 = this.L0;
                                                            n2 = this.K0;
                                                            i0 = this.I0;
                                                            o2 = this.H0;
                                                            le1 = this.G0;
                                                            final q7m f0 = this.F0;
                                                            e0 = this.E0;
                                                            final le1 le2 = (le1)this.P0;
                                                            b1n.u(d);
                                                            final Object o3 = d;
                                                            dy6 = d2;
                                                            d3 = o3;
                                                            f2 = f0;
                                                            o4 = this;
                                                            p = le2;
                                                            break Label_0578;
                                                        }
                                                        if (o0 == 3) {
                                                            n0 = this.N0;
                                                            final float m2 = this.M0;
                                                            final float l2 = this.L0;
                                                            n2 = this.K0;
                                                            j0 = this.J0;
                                                            final q7m i2 = this.I0;
                                                            o2 = this.H0;
                                                            le1 = this.G0;
                                                            final q7m f3 = this.F0;
                                                            e0 = this.E0;
                                                            p2 = (le1)this.P0;
                                                            b1n.u(d);
                                                            o5 = this;
                                                            dy6 = d2;
                                                            q7m = f3;
                                                            i0 = i2;
                                                            break Label_1045;
                                                        }
                                                        if (o0 == 4) {
                                                            b1n.u(d);
                                                            o6 = this;
                                                            break Label_1386;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    else {
                                                        final le1 le3 = (le1)this.P0;
                                                        b1n.u(d);
                                                        b = d;
                                                        p3 = le3;
                                                    }
                                                }
                                                else {
                                                    b1n.u(d);
                                                    p3 = (le1)this.P0;
                                                    this.P0 = p3;
                                                    this.O0 = 1;
                                                    if ((b = yas.b(p3, false, (go6<? super hpk>)this)) == d2) {
                                                        return d2;
                                                    }
                                                }
                                                final hpk hpk = (hpk)b;
                                                q7m2 = new q7m();
                                                Objects.requireNonNull(wfj.Companion);
                                                q7m2.D0 = wfj.b;
                                                final Object o7 = this;
                                                dy7 = d2;
                                                final long a = hpk.a;
                                                final int h = hpk.h;
                                                final hb9$a a2 = hb9.a;
                                                o2 = hb9.a;
                                                if (hb9.f(p3.e0(), a)) {
                                                    hpk2 = null;
                                                    o6 = o7;
                                                    break Label_1216;
                                                }
                                                final float l2 = hb9.g(p3.getViewConfiguration(), h);
                                                final q7m i3 = new q7m();
                                                i3.D0 = a;
                                                n0 = 0.0f;
                                                n2 = 0;
                                                final hpk e2 = hpk;
                                                le1 = p3;
                                                final float m2 = 0.0f;
                                                o5 = o7;
                                                final q7m f4 = q7m2;
                                                p2 = p3;
                                                dy6 = dy7;
                                                ((ib9$a)o5).P0 = p2;
                                                ((ib9$a)o5).E0 = e2;
                                                ((ib9$a)o5).F0 = f4;
                                                ((ib9$a)o5).G0 = le1;
                                                ((ib9$a)o5).H0 = (zok)o2;
                                                ((ib9$a)o5).I0 = i3;
                                                ((ib9$a)o5).J0 = null;
                                                ((ib9$a)o5).K0 = n2;
                                                ((ib9$a)o5).L0 = l2;
                                                ((ib9$a)o5).M0 = m2;
                                                ((ib9$a)o5).N0 = n0;
                                                ((ib9$a)o5).O0 = 2;
                                                d3 = g4k.d(le1, (bpk)null, (go6)o5, 1, (Object)null);
                                                if (d3 == dy6) {
                                                    return dy6;
                                                }
                                                i0 = i3;
                                                p = p2;
                                                l0 = l2;
                                                o4 = o5;
                                                f2 = f4;
                                                m0 = m2;
                                                e0 = e2;
                                            }
                                            final apk apk = (apk)d3;
                                            final List a3 = apk.a;
                                            final int size = a3.size();
                                            int k = 0;
                                            final float l3 = l0;
                                            while (true) {
                                                while (k < size) {
                                                    final Object value = a3.get(k);
                                                    if (gpk.a(((hpk)value).a, i0.D0)) {
                                                        final hpk hpk3 = (hpk)value;
                                                        j0 = hpk3;
                                                        Label_0766: {
                                                            if (j0 != null) {
                                                                if (!j0.d()) {
                                                                    Label_1430: {
                                                                        if (gmw.l(j0)) {
                                                                            final List a4 = apk.a;
                                                                            final int size2 = a4.size();
                                                                            int n3 = 0;
                                                                            while (true) {
                                                                                while (n3 < size2) {
                                                                                    final Object value2 = a4.get(n3);
                                                                                    if (((hpk)value2).d) {
                                                                                        final hpk hpk4 = (hpk)value2;
                                                                                        if (hpk4 == null) {
                                                                                            break Label_0766;
                                                                                        }
                                                                                        i0.D0 = hpk4.a;
                                                                                        break Label_1430;
                                                                                    }
                                                                                    else {
                                                                                        ++n3;
                                                                                    }
                                                                                }
                                                                                final Object value2 = null;
                                                                                continue;
                                                                            }
                                                                        }
                                                                        final long c = j0.c;
                                                                        final long f5 = j0.f;
                                                                        final float a5 = ((zok)o2).a(c);
                                                                        final float a6 = ((zok)o2).a(f5);
                                                                        final float c2 = ((zok)o2).c(c);
                                                                        final float c3 = ((zok)o2).c(f5);
                                                                        final float m3 = m0 + (a5 - a6);
                                                                        final float n4 = n0 + (c2 - c3);
                                                                        float n5;
                                                                        if (n2 != 0) {
                                                                            n5 = Math.abs(m3);
                                                                        }
                                                                        else {
                                                                            n5 = wfj.c(((zok)o2).b(m3, n4));
                                                                        }
                                                                        if (n5 < l3) {
                                                                            final bpk f6 = bpk.F0;
                                                                            ((ib9$a)o4).P0 = p;
                                                                            ((ib9$a)o4).E0 = e0;
                                                                            ((ib9$a)o4).F0 = f2;
                                                                            ((ib9$a)o4).G0 = le1;
                                                                            ((ib9$a)o4).H0 = (zok)o2;
                                                                            ((ib9$a)o4).I0 = i0;
                                                                            ((ib9$a)o4).J0 = j0;
                                                                            ((ib9$a)o4).K0 = n2;
                                                                            ((ib9$a)o4).L0 = l3;
                                                                            ((ib9$a)o4).M0 = m3;
                                                                            ((ib9$a)o4).N0 = n4;
                                                                            ((ib9$a)o4).O0 = 3;
                                                                            if (le1.g0(f6, (go6)o4) == dy6) {
                                                                                return dy6;
                                                                            }
                                                                            final go6 go6 = (go6)o4;
                                                                            final float n6 = m3;
                                                                            final q7m q7m3 = f2;
                                                                            final le1 le4 = p;
                                                                            final float l2 = l3;
                                                                            o5 = go6;
                                                                            q7m = q7m3;
                                                                            final float m2 = n6;
                                                                            n0 = n4;
                                                                            p2 = le4;
                                                                            break Label_1045;
                                                                        }
                                                                        else {
                                                                            long d4;
                                                                            if (n2 != 0) {
                                                                                d4 = ((zok)o2).b(m3 - Math.signum(m3) * l3, n4);
                                                                            }
                                                                            else {
                                                                                final long b2 = ((zok)o2).b(m3, n4);
                                                                                d4 = wfj.g(b2, wfj.i(wj1.a(wfj.d(b2) / n5, wfj.e(b2) / n5), l3));
                                                                            }
                                                                            j0.a();
                                                                            f2.D0 = d4;
                                                                            if (j0.d()) {
                                                                                final le1 le5 = p;
                                                                                dy7 = dy6;
                                                                                o6 = o4;
                                                                                q7m2 = f2;
                                                                                final hpk hpk = e0;
                                                                                p3 = le5;
                                                                                hpk2 = j0;
                                                                                break Label_1216;
                                                                            }
                                                                            m0 = 0.0f;
                                                                            n0 = 0.0f;
                                                                        }
                                                                    }
                                                                    final go6 go7 = (go6)o4;
                                                                    final float n7 = l3;
                                                                    p2 = p;
                                                                    final q7m i3 = i0;
                                                                    final hpk e2 = e0;
                                                                    final float m2 = m0;
                                                                    final q7m f4 = f2;
                                                                    o5 = go7;
                                                                    final float l2 = n7;
                                                                    continue Label_0451;
                                                                }
                                                            }
                                                        }
                                                        go8 = (go6)o4;
                                                        q7m2 = f2;
                                                        le6 = p;
                                                        break Label_1065;
                                                    }
                                                    ++k;
                                                }
                                                final hpk hpk3 = null;
                                                continue;
                                            }
                                        }
                                        if (!j0.d()) {
                                            final hpk e2 = e0;
                                            final q7m f4 = q7m;
                                            final q7m i3 = i0;
                                            continue Label_0451;
                                        }
                                        break;
                                    }
                                    go8 = (go6)o5;
                                    le6 = p2;
                                    q7m2 = q7m;
                                }
                                o6 = go8;
                                hpk2 = null;
                                dy7 = dy6;
                                p3 = le6;
                                final hpk hpk = e0;
                            }
                            if (hpk2 != null && !hpk2.d()) {
                                final Object o7 = o6;
                                continue;
                            }
                            break;
                        }
                        if (hpk2 == null) {
                            return fzv.a;
                        }
                        ((ib9$a)o6).Q0.invoke((Object)new wfj(hpk2.c));
                        ((ib9$a)o6).R0.invoke((Object)hpk2, (Object)new wfj(q7m2.D0));
                        final long a7 = hpk2.a;
                        final ib9$a$a ib9$a$a = new ib9$a$a((ftb)((ib9$a)o6).R0);
                        ((ib9$a)o6).P0 = null;
                        ((ib9$a)o6).E0 = null;
                        ((ib9$a)o6).F0 = null;
                        ((ib9$a)o6).G0 = null;
                        ((ib9$a)o6).H0 = null;
                        ((ib9$a)o6).I0 = null;
                        ((ib9$a)o6).J0 = null;
                        ((ib9$a)o6).O0 = 4;
                        if ((d = hb9.d(p3, a7, (qsb<? super hpk, fzv>)ib9$a$a, (go6<? super Boolean>)o6)) == dy7) {
                            return dy7;
                        }
                    }
                    if (!(boolean)d) {
                        ((ib9$a)o6).S0.invoke();
                    }
                    else {
                        ((ib9$a)o6).T0.invoke();
                    }
                    return fzv.a;
                }
            };
            this.D0 = 1;
            if (ppk.Z((ftb)ftb, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
