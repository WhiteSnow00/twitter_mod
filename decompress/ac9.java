import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = { 176 }, m = "invokeSuspend")
public final class ac9 extends xzr implements gub<hpk, ap6<? super oyv>, Object>
{
    public int C0;
    public /* synthetic */ Object D0;
    public final /* synthetic */ rtb<qfj, oyv> E0;
    public final /* synthetic */ gub<zok, qfj, oyv> F0;
    public final /* synthetic */ otb<oyv> G0;
    public final /* synthetic */ otb<oyv> H0;
    
    public ac9(final rtb<? super qfj, oyv> e0, final gub<? super zok, ? super qfj, oyv> f0, final otb<oyv> g0, final otb<oyv> h0, final ap6<? super ac9> ap6) {
        this.E0 = (rtb<qfj, oyv>)e0;
        this.F0 = (gub<zok, qfj, oyv>)f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object d0, final ap6<?> ap6) {
        final ac9 ac9 = new ac9(this.E0, this.F0, this.G0, this.H0, (ap6<? super ac9>)ap6);
        ac9.D0 = d0;
        return (ap6<oyv>)ac9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ac9)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int c2 = this.C0;
        if (c2 != 0) {
            if (c2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(o);
        }
        else {
            kq9.b1(o);
            final hpk hpk = (hpk)this.D0;
            final gub<pe1, ap6<? super oyv>, Object> gub = (gub<pe1, ap6<? super oyv>, Object>)new gub<pe1, ap6<? super oyv>, Object>(this.H0) {
                public zok D0;
                public a7m E0;
                public pe1 F0;
                public qok G0;
                public a7m H0;
                public zok I0;
                public int J0;
                public float K0;
                public float L0;
                public float M0;
                public int N0;
                public /* synthetic */ Object O0;
                public final /* synthetic */ rtb<qfj, oyv> P0;
                public final /* synthetic */ gub<zok, qfj, oyv> Q0;
                public final /* synthetic */ otb<oyv> R0;
                public final /* synthetic */ otb<oyv> S0;
                
                public final ap6<oyv> create(final Object o0, final ap6<?> ap6) {
                    final gub<pe1, ap6<? super oyv>, Object> gub = (gub<pe1, ap6<? super oyv>, Object>)new gub<pe1, ap6<? super oyv>, Object>() {
                        public zok D0;
                        public a7m E0;
                        public pe1 F0;
                        public qok G0;
                        public a7m H0;
                        public zok I0;
                        public int J0;
                        public float K0;
                        public float L0;
                        public float M0;
                        public int N0;
                        public /* synthetic */ Object O0;
                        public final /* synthetic */ rtb<qfj, oyv> P0 = this.P0;
                        public final /* synthetic */ gub<zok, qfj, oyv> Q0 = this.Q0;
                        public final /* synthetic */ otb<oyv> R0 = this.R0;
                        public final /* synthetic */ otb<oyv> S0 = this.S0;
                    };
                    gub.O0 = o0;
                    return (ap6<oyv>)gub;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((ac9$a)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
                }
                
                public final Object invokeSuspend(Object d) {
                    final zy6 c0 = zy6.C0;
                    final int n0 = this.N0;
                    Object o6 = null;
                    Label_1361: {
                        pe1 o7 = null;
                        a7m e3 = null;
                        zy6 zy7 = null;
                        zok zok = null;
                        while (true) {
                            Label_1204: {
                                zy6 zy6 = null;
                                ap6<? super rok> ap8 = null;
                                pe1 pe5 = null;
                                Label_1048: {
                                    pe1 o4 = null;
                                    Object o5 = null;
                                    a7m a7m2 = null;
                                Label_0431:
                                    while (true) {
                                        a7m h0 = null;
                                        zok d2 = null;
                                        zok i0 = null;
                                        Label_1029: {
                                            float m0 = 0.0f;
                                            float l0 = 0.0f;
                                            float k0 = 0.0f;
                                            int n2 = 0;
                                            Object o = null;
                                            pe1 pe1 = null;
                                            Object j = null;
                                            a7m a7m = null;
                                            gub<pe1, ap6<? super oyv>, Object> gub = null;
                                            pe1 o3 = null;
                                            Label_0560: {
                                                Object b;
                                                if (n0 != 0) {
                                                    if (n0 != 1) {
                                                        if (n0 == 2) {
                                                            m0 = this.M0;
                                                            l0 = this.L0;
                                                            k0 = this.K0;
                                                            n2 = this.J0;
                                                            h0 = this.H0;
                                                            o = this.G0;
                                                            pe1 = this.F0;
                                                            final a7m e0 = this.E0;
                                                            d2 = this.D0;
                                                            final pe1 pe2 = (pe1)this.O0;
                                                            kq9.b1(d);
                                                            final Object o2 = d;
                                                            zy6 = c0;
                                                            j = o2;
                                                            a7m = e0;
                                                            gub = this;
                                                            o3 = pe2;
                                                            break Label_0560;
                                                        }
                                                        if (n0 == 3) {
                                                            m0 = this.M0;
                                                            final float l2 = this.L0;
                                                            final float k2 = this.K0;
                                                            n2 = this.J0;
                                                            i0 = this.I0;
                                                            final a7m h2 = this.H0;
                                                            o = this.G0;
                                                            pe1 = this.F0;
                                                            final a7m e2 = this.E0;
                                                            d2 = this.D0;
                                                            o4 = (pe1)this.O0;
                                                            kq9.b1(d);
                                                            o5 = this;
                                                            zy6 = c0;
                                                            a7m2 = e2;
                                                            h0 = h2;
                                                            break Label_1029;
                                                        }
                                                        if (n0 == 4) {
                                                            kq9.b1(d);
                                                            o6 = this;
                                                            break Label_1361;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    else {
                                                        final pe1 pe3 = (pe1)this.O0;
                                                        kq9.b1(d);
                                                        b = d;
                                                        o7 = pe3;
                                                    }
                                                }
                                                else {
                                                    kq9.b1(d);
                                                    o7 = (pe1)this.O0;
                                                    this.O0 = o7;
                                                    this.N0 = 1;
                                                    if ((b = das.b(o7, false, (ap6)this)) == c0) {
                                                        return c0;
                                                    }
                                                }
                                                d2 = (zok)b;
                                                e3 = new a7m();
                                                Objects.requireNonNull(qfj.Companion);
                                                e3.C0 = qfj.b;
                                                o5 = this;
                                                zy7 = c0;
                                                final sok i2 = null;
                                                final long a = d2.a;
                                                final int h3 = d2.h;
                                                final qok a2 = (qok)zb9.a;
                                                o = zb9.a;
                                                if (zb9.f(o7.e0(), a)) {
                                                    zok = null;
                                                    o6 = o5;
                                                    break Label_1204;
                                                }
                                                final float k2 = zb9.g(o7.getViewConfiguration(), h3);
                                                final a7m h4 = new a7m();
                                                h4.C0 = a;
                                                m0 = 0.0f;
                                                n2 = 0;
                                                final zok d3 = d2;
                                                pe1 = o7;
                                                final float l2 = 0.0f;
                                                final a7m e4 = e3;
                                                o4 = o7;
                                                zy6 = zy7;
                                                ((ac9$a)o5).O0 = o4;
                                                ((ac9$a)o5).D0 = d3;
                                                ((ac9$a)o5).E0 = e4;
                                                ((ac9$a)o5).F0 = pe1;
                                                ((ac9$a)o5).G0 = (qok)o;
                                                ((ac9$a)o5).H0 = h4;
                                                ((ac9$a)o5).I0 = (zok)i2;
                                                ((ac9$a)o5).J0 = n2;
                                                ((ac9$a)o5).K0 = k2;
                                                ((ac9$a)o5).L0 = l2;
                                                ((ac9$a)o5).M0 = m0;
                                                ((ac9$a)o5).N0 = 2;
                                                j = pn.j(pe1, i2, (ap6)o5, 1, i2);
                                                if (j == zy6) {
                                                    return zy6;
                                                }
                                                h0 = h4;
                                                o3 = o4;
                                                k0 = k2;
                                                gub = (ac9$a)o5;
                                                a7m = e4;
                                                l0 = l2;
                                                d2 = d3;
                                            }
                                            final rok rok = (rok)j;
                                            final List a3 = rok.a;
                                            final int size = a3.size();
                                            int n3 = 0;
                                            final float k3 = k0;
                                            final ap6 ap6 = (ap6)gub;
                                            final List list = a3;
                                            while (true) {
                                                while (n3 < size) {
                                                    final Object value = list.get(n3);
                                                    if (yok.a(((zok)value).a, h0.C0)) {
                                                        e3 = a7m;
                                                        o5 = ap6;
                                                        i0 = (zok)value;
                                                        Label_0761: {
                                                            if (i0 != null) {
                                                                if (!i0.d()) {
                                                                    Label_1404: {
                                                                        if (h6q.n(i0)) {
                                                                            final List a4 = rok.a;
                                                                            final int size2 = a4.size();
                                                                            int n4 = 0;
                                                                            while (true) {
                                                                                while (n4 < size2) {
                                                                                    final Object value2 = a4.get(n4);
                                                                                    if (((zok)value2).d) {
                                                                                        final zok zok2 = (zok)value2;
                                                                                        if (zok2 == null) {
                                                                                            break Label_0761;
                                                                                        }
                                                                                        h0.C0 = zok2.a;
                                                                                        break Label_1404;
                                                                                    }
                                                                                    else {
                                                                                        ++n4;
                                                                                    }
                                                                                }
                                                                                final Object value2 = null;
                                                                                continue;
                                                                            }
                                                                        }
                                                                        final long c2 = i0.c;
                                                                        final long f = i0.f;
                                                                        final float a5 = ((qok)o).a(c2);
                                                                        final float a6 = ((qok)o).a(f);
                                                                        final float c3 = ((qok)o).c(c2);
                                                                        final float c4 = ((qok)o).c(f);
                                                                        final float l3 = l0 + (a5 - a6);
                                                                        final float m2 = m0 + (c3 - c4);
                                                                        float n5;
                                                                        if (n2 != 0) {
                                                                            n5 = Math.abs(l3);
                                                                        }
                                                                        else {
                                                                            n5 = qfj.c(((qok)o).b(l3, m2));
                                                                        }
                                                                        if (n5 < k3) {
                                                                            final sok e5 = sok.E0;
                                                                            ((ac9$a)o5).O0 = o3;
                                                                            ((ac9$a)o5).D0 = d2;
                                                                            ((ac9$a)o5).E0 = e3;
                                                                            ((ac9$a)o5).F0 = pe1;
                                                                            ((ac9$a)o5).G0 = (qok)o;
                                                                            ((ac9$a)o5).H0 = h0;
                                                                            ((ac9$a)o5).I0 = i0;
                                                                            ((ac9$a)o5).J0 = n2;
                                                                            ((ac9$a)o5).K0 = k3;
                                                                            ((ac9$a)o5).L0 = l3;
                                                                            ((ac9$a)o5).M0 = m2;
                                                                            ((ac9$a)o5).N0 = 3;
                                                                            if (pe1.g0(e5, (ap6<? super rok>)o5) == zy6) {
                                                                                return zy6;
                                                                            }
                                                                            final float n6 = l3;
                                                                            final a7m a7m3 = e3;
                                                                            o4 = o3;
                                                                            final float k2 = k3;
                                                                            a7m2 = a7m3;
                                                                            final float l2 = n6;
                                                                            m0 = m2;
                                                                            break Label_1029;
                                                                        }
                                                                        else {
                                                                            final a7m a7m4 = e3;
                                                                            final float n7 = k3;
                                                                            long c5;
                                                                            if (n2 != 0) {
                                                                                c5 = ((qok)o).b(l3 - Math.signum(l3) * n7, m2);
                                                                            }
                                                                            else {
                                                                                final long b2 = ((qok)o).b(l3, m2);
                                                                                c5 = qfj.g(b2, qfj.i(ukg.m(qfj.d(b2) / n5, qfj.e(b2) / n5), n7));
                                                                            }
                                                                            i0.a();
                                                                            a7m4.C0 = c5;
                                                                            if (i0.d()) {
                                                                                final ap6<? super rok> ap7 = (ap6<? super rok>)o5;
                                                                                e3 = a7m4;
                                                                                final pe1 pe4 = o3;
                                                                                zy7 = zy6;
                                                                                o6 = ap7;
                                                                                o7 = pe4;
                                                                                zok = i0;
                                                                                break Label_1204;
                                                                            }
                                                                            l0 = 0.0f;
                                                                            m0 = 0.0f;
                                                                        }
                                                                    }
                                                                    final sok i2 = null;
                                                                    final a7m a7m5 = e3;
                                                                    final float n8 = l0;
                                                                    final float k2 = k3;
                                                                    o4 = o3;
                                                                    final a7m h4 = h0;
                                                                    final zok d3 = d2;
                                                                    final float l2 = n8;
                                                                    final a7m e4 = a7m5;
                                                                    continue Label_0431;
                                                                }
                                                            }
                                                        }
                                                        ap8 = (ap6<? super rok>)o5;
                                                        pe5 = o3;
                                                        break Label_1048;
                                                    }
                                                    ++n3;
                                                }
                                                final Object value = null;
                                                continue;
                                            }
                                        }
                                        if (!i0.d()) {
                                            final sok i2 = null;
                                            final zok d3 = d2;
                                            final a7m e4 = a7m2;
                                            final a7m h4 = h0;
                                            continue Label_0431;
                                        }
                                        break;
                                    }
                                    ap8 = (ap6<? super rok>)o5;
                                    pe5 = o4;
                                    e3 = a7m2;
                                }
                                o6 = ap8;
                                zok = null;
                                zy7 = zy6;
                                o7 = pe5;
                            }
                            if (zok != null && !zok.d()) {
                                final Object o5 = o6;
                                continue;
                            }
                            break;
                        }
                        if (zok == null) {
                            return oyv.a;
                        }
                        ((ac9$a)o6).P0.invoke((Object)new qfj(zok.c));
                        ((ac9$a)o6).Q0.invoke((Object)zok, (Object)new qfj(e3.C0));
                        final long a7 = zok.a;
                        final rtb<zok, oyv> rtb = (rtb<zok, oyv>)new rtb<zok, oyv>() {
                            public final /* synthetic */ gub<zok, qfj, oyv> C0 = ((ac9$a)o6).Q0;
                            
                            public final Object invoke(final Object o) {
                                final zok zok = (zok)o;
                                zzd.f((Object)zok, "it");
                                this.C0.invoke((Object)zok, (Object)new qfj(h6q.P(zok)));
                                zok.a();
                                return oyv.a;
                            }
                        };
                        ((ac9$a)o6).O0 = null;
                        ((ac9$a)o6).D0 = null;
                        ((ac9$a)o6).E0 = null;
                        ((ac9$a)o6).F0 = null;
                        ((ac9$a)o6).G0 = null;
                        ((ac9$a)o6).H0 = null;
                        ((ac9$a)o6).I0 = null;
                        ((ac9$a)o6).N0 = 4;
                        if ((d = zb9.d(o7, a7, (rtb)rtb, (ap6)o6)) == zy7) {
                            return zy7;
                        }
                    }
                    if (!(boolean)d) {
                        ((ac9$a)o6).R0.invoke();
                    }
                    else {
                        ((ac9$a)o6).S0.invoke();
                    }
                    return oyv.a;
                }
            };
            this.C0 = 1;
            if (hpk.Z((gub)gub, (ap6)this) == c0) {
                return c0;
            }
        }
        return oyv.a;
    }
}
