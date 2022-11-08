import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfg extends gue implements jub<jkh, m76, Integer, jkh>
{
    public final /* synthetic */ rtb<dp8, qfj> C0;
    public final /* synthetic */ rtb<dp8, qfj> D0;
    public final /* synthetic */ float E0;
    public final /* synthetic */ rtb<h99, oyv> F0;
    public final /* synthetic */ ohk G0;
    public final /* synthetic */ rfg H0;
    
    public pfg(final rtb<? super dp8, qfj> c0, final rtb<? super dp8, qfj> d0, final float e0, final rtb<? super h99, oyv> f0, final ohk g0, final rfg h0) {
        this.C0 = (rtb<dp8, qfj>)c0;
        this.D0 = (rtb<dp8, qfj>)d0;
        this.E0 = e0;
        this.F0 = (rtb<h99, oyv>)f0;
        this.G0 = g0;
        this.H0 = h0;
        super(3);
    }
    
    public static final long a(final luh luh) {
        return ((qfj)((q7r)luh).getValue()).a;
    }
    
    public static final long b(final q7r q7r) {
        return ((qfj)q7r.getValue()).a;
    }
    
    public final Object h0(Object o, Object o2, final Object o3) {
        final jkh jkh = (jkh)o;
        final m76 m76 = (m76)o2;
        lf.x((Number)o3, jkh, "$this$composed", m76, -454877003);
        final ea6$b a = ea6.a;
        final View view = (View)m76.m((re6)a30.f);
        final dp8 dp8 = (dp8)m76.m((re6)te6.e);
        m76.x(-492369756);
        o2 = m76.y();
        Objects.requireNonNull(m76.Companion);
        final m76$a$a b = m76$a.b;
        o = o2;
        if (o2 == b) {
            Objects.requireNonNull(qfj.Companion);
            o = nkz.r((Object)new qfj(qfj.d));
            m76.p(o);
        }
        m76.O();
        final luh luh = (luh)o;
        final q7r v = nkz.v((Object)this.C0, m76);
        final q7r v2 = nkz.v((Object)this.D0, m76);
        final q7r v3 = nkz.v((Object)this.E0, m76);
        final q7r v4 = nkz.v((Object)this.F0, m76);
        m76.x(-492369756);
        o2 = m76.y();
        if ((o = o2) == b) {
            o = nkz.k((otb)new ofg(dp8, (q7r<? extends rtb<? super dp8, qfj>>)v, luh));
            m76.p(o);
        }
        m76.O();
        final q7r q7r = (q7r)o;
        m76.x(-492369756);
        o2 = m76.y();
        if ((o = o2) == b) {
            o = nkz.k((otb)new nfg(q7r));
            m76.p(o);
        }
        m76.O();
        final q7r q7r2 = (q7r)o;
        m76.x(-492369756);
        o2 = m76.y();
        if ((o = o2) == b) {
            o = ili.h(1, 0, er2.D0, 2);
            m76.p(o);
        }
        m76.O();
        final juh juh = (juh)o;
        float e0;
        if (this.G0.b()) {
            e0 = 0.0f;
        }
        else {
            e0 = this.E0;
        }
        final rfg h0 = this.H0;
        Objects.requireNonNull(rfg.Companion);
        final boolean a2 = zzd.a((Object)h0, (Object)rfg.h);
        o2 = new ifg(this.G0, this.H0, view, dp8, this.E0, juh, v4, q7r2, q7r, v2, luh, v3, (ap6)null);
        jgw.i(new Object[] { view, dp8, e0, h0, a2 }, (gub)o2, m76);
        m76.x(1157296644);
        final boolean p3 = m76.P((Object)luh);
        o2 = m76.y();
        if (p3 || (o = o2) == b) {
            o = new jfg(luh);
            m76.p(o);
        }
        m76.O();
        final jkh a3 = gd9.a(k3j.t(jkh, (rtb)o), (rtb)new kfg(juh));
        m76.x(1157296644);
        final boolean p4 = m76.P((Object)q7r);
        o2 = m76.y();
        if (p4 || (o = o2) == b) {
            o = new mfg(q7r);
            m76.p(o);
        }
        m76.O();
        final jkh k = x3j.K(a3, false, (rtb)o);
        m76.O();
        return k;
    }
}
