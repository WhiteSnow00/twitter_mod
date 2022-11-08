import com.twitter.weaver.mvi.MviViewModel;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.business.profilemodule.about.AboutModuleViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.profilemodule.about.AboutModuleViewModel$subscribeAboutModuleData$2", f = "AboutModuleViewModel.kt", l = {}, m = "invokeSuspend")
public final class l9 extends xzr implements gub<gvj<? extends String, ? extends h7>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ AboutModuleViewModel D0;
    
    public l9(final AboutModuleViewModel d0, final ap6<? super l9> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final l9 l9 = new l9(this.D0, (ap6<? super l9>)ap6);
        l9.C0 = c0;
        return (ap6<oyv>)l9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l9 l9 = (l9)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        l9.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final gvj gvj = (gvj)this.C0;
        final String s = (String)gvj.C0;
        final h7 h7 = (h7)gvj.D0;
        final v7 r0 = this.D0.R0;
        zzd.e((Object)s, "profileId");
        r0.a(s);
        final AboutModuleViewModel d0 = this.D0;
        zzd.e((Object)h7, "aboutModule");
        Objects.requireNonNull(d0);
        final wt2 e = h7.b.e;
        final String s2 = "";
        String g = null;
        Label_0256: {
            if (e != null) {
                g = e.g;
                if (g != null) {
                    break Label_0256;
                }
            }
            Objects.requireNonNull(d0.P0);
            String m1;
            if (e != null) {
                final ArrayList<String> list = new ArrayList<String>();
                final ms.a companion = ms.Companion;
                list.add(ms.a.a(companion, e.a, e.d != null || e.b != null));
                list.add(ms.a.a(companion, e.d, e.b != null));
                list.add(e.b);
                list.add(e.c);
                m1 = or4.M1((Iterable)or4.E1((Iterable)list), (CharSequence)" ", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
            }
            else {
                m1 = "";
            }
            g = m1;
        }
        boolean b = false;
        Label_0305: {
            if (g.length() > 0) {
                Objects.requireNonNull(this.D0);
                if (h7.a.b) {
                    b = true;
                    break Label_0305;
                }
            }
            b = false;
        }
        final wcg q0 = this.D0.Q0;
        final tu2 a = h7.b.a;
        final jck jck = null;
        xu2 a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        Objects.requireNonNull(q0);
        String s3 = null;
        Label_0577: {
            if (a2 != null) {
                final pbk pbk = (pbk)q0.C0;
                final String a3 = a2.a;
                Integer b2;
                if (a3 != null) {
                    b2 = bkr.b1(a3);
                }
                else {
                    b2 = null;
                }
                final String b3 = a2.b;
                Long c1;
                if (b3 != null) {
                    c1 = bkr.c1(b3);
                }
                else {
                    c1 = null;
                }
                jck jck2 = jck;
                if (b2 != null) {
                    jck2 = jck;
                    if (c1 != null) {
                        jck2 = new jck();
                        jck2.a(b2);
                        jck2.E0 = c1;
                    }
                }
                s3 = pbk.a(jck2, 2);
                if (s3 != null) {
                    break Label_0577;
                }
            }
            s3 = s2;
            if (a2 != null) {
                final String a4 = a2.a;
                final String b4 = a2.b;
                final boolean b5 = a4 == null || a4.length() == 0;
                s3 = s2;
                if (!b5) {
                    final boolean b6 = b4 == null || b4.length() == 0;
                    s3 = s2;
                    if (!b6) {
                        s3 = af.z("+", gkr.E1(a4, (CharSequence)"+"), " ", b4);
                    }
                }
            }
        }
        final boolean b7 = s3.length() > 0;
        final j7 a5 = h7.a;
        final rk6 rk6 = new rk6(a5.e, a5.d && b7, a5.c, a5.f && b7, s3, 32);
        final boolean f = rk6.f;
        final AboutModuleViewModel d2 = this.D0;
        ((MviViewModel)d2).Q((rtb)new l9$a(d2, h7, s, f, b, g, rk6));
        this.D0.R0.p();
        if (b) {
            this.D0.R0.q();
        }
        if (f) {
            this.D0.R0.g();
        }
        return oyv.a;
    }
}
