import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qt1
{
    public static final void a(final String s, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n) {
        zzd.f((Object)s, "label");
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(-63353083);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)s)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.P((Object)gub)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            h.x(1157296644);
            final boolean p4 = h.P((Object)s);
            final Object y = h.y();
            tu1 tu1 = null;
            Label_0206: {
                if (!p4) {
                    Objects.requireNonNull(m76.Companion);
                    if ((tu1 = (tu1)y) != m76$a.b) {
                        break Label_0206;
                    }
                }
                tu1 = new tu1(s);
                h.p((Object)tu1);
            }
            h.O();
            b(tu1, gub, h, (n4 & 0x70) | 0x8);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new qt1$a(s, (gub)gub, n));
        }
    }
    
    public static final void b(final tu1 tu1, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n) {
        zzd.f((Object)tu1, "bceMetadata");
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(-15087799);
        final ea6$b a = ea6.a;
        final dda dda = (dda)h.m((re6)fda.a);
        h.x(511388516);
        final boolean p4 = h.P((Object)tu1);
        final boolean p5 = h.P((Object)dda);
        final Object y = h.y();
        dbm dbm = null;
        Label_0123: {
            if (!(p4 | p5)) {
                Objects.requireNonNull(m76.Companion);
                if ((dbm = (dbm)y) != m76$a.b) {
                    break Label_0123;
                }
            }
            dbm = new dbm((ibm)null);
            h.p((Object)dbm);
        }
        h.O();
        final dbm dbm2 = dbm;
        Object o;
        if (h.m((re6)tsd.a)) {
            o = lli.a;
        }
        else {
            o = j4p.a(h).z0(nda.class).w8();
        }
        jgw.g(o, (Object)dbm2, (gub)new gub<yy6, ap6<? super oyv>, Object>(tu1) {
            public final /* synthetic */ oda<m6x, x00> C0;
            public final /* synthetic */ dbm<m6x> D0;
            public final /* synthetic */ dda<m6x> E0;
            public final /* synthetic */ tu1 F0;
            
            public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
                return (ap6<oyv>)new gub<yy6, ap6<? super oyv>, Object>() {
                    public final /* synthetic */ oda<m6x, x00> C0 = this.C0;
                    public final /* synthetic */ dbm<m6x> D0 = this.D0;
                    public final /* synthetic */ dda<m6x> E0 = this.E0;
                    public final /* synthetic */ tu1 F0 = this.F0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final gub<yy6, ap6<? super oyv>, Object> gub = (gub<yy6, ap6<? super oyv>, Object>)this.create(o, (ap6<?>)o2);
                final oyv a = oyv.a;
                gub.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                kq9.b1(o);
                this.C0.i((dda)this.D0, this.E0.getId());
                this.C0.g((dda)this.D0, (ida)new nte(this.F0.a, (String)null, 2, (hg8)null));
                this.C0.g((dda)this.D0, (ida)new xlp(this.F0.b));
                return oyv.a;
            }
        }, h);
        fda.a((dda)dbm2, (gub)m8y.j(h, -1257873273, new qt1$c((gub)gub, n)), h, 56);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new qt1$d(tu1, (gub)gub, n));
        }
    }
}
