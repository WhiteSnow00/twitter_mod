import android.content.Context;
import androidx.fragment.app.Fragment;
import com.twitter.ui.tweet.inlineactions.InlineActionBar$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwg implements InlineActionBar$b
{
    public final xwg a;
    
    public vwg(final xwg a) {
        this.a = a;
    }
    
    public final void a(final fod fod, String d) {
        final xwg a = this.a;
        final ddu b = fod.b;
        final hp6 b2 = a.b2;
        if (b2 != null) {
            final ddu j0 = ddu.J0;
            d = "";
            if (b == j0) {
                final cku k2 = a.k2;
                String a2;
                if ((a2 = k2.a) == null) {
                    if (k2.d()) {
                        a2 = "protected_tweet";
                    }
                    else {
                        a2 = "";
                    }
                }
                if (a2.equals("limited_replies")) {
                    final pr6 d2 = b2.F0.d1;
                    if (d2 != null) {
                        a.l2.a(d2, b2, (iuu)null);
                        return;
                    }
                }
            }
            String s = ((Fragment)a).W0(2131955457);
            if (b == j0) {
                s = ((Fragment)a).W0(2131955456);
            }
            else if (b == ddu.G0) {
                s = ((Fragment)a).W0(2131955455);
            }
            else if (b == ddu.Y0) {
                s = ((Fragment)a).W0(2131955458);
            }
            final p4j y1 = a.Y1;
            final String w0 = ((Fragment)a).W0(2131955454);
            final sfv a3 = a.a2;
            if (a3 != null) {
                d = ((f0p)a3).d;
            }
            y1.S(s, w0, d, ((Fragment)a).R0());
        }
    }
    
    public final void b(fod y) {
        y = iuk.Y(y);
        if (y != null) {
            final ddu b = y.b;
            if (b == ddu.G0) {
                final xwg a = this.a;
                final hp6 c = y.c;
                final int x2 = xwg.x2;
                a.k2(c);
            }
            else if (b == ddu.K0) {
                final xwg a2 = this.a;
                a2.w2.a(y, (iuu)null, a2.c2);
            }
        }
    }
    
    public final void c(final fod fod, final y06 y06) {
        final xwg a = this.a;
        final hp6 b2 = a.b2;
        final dob l0 = ((Fragment)a).L0();
        final hp6 b3 = a.b2;
        if (b3 == null || !b3.f0()) {
            final int ordinal = fod.b.ordinal();
            if (ordinal != 1) {
                Label_0337: {
                    if (ordinal != 21) {
                        if (ordinal == 35) {
                            a.v2.h(b2).k(bhu.I0).l(a.a2).start();
                            break Label_0337;
                        }
                        if (ordinal != 66 && ordinal != 68) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    a.u2.a(b2);
                                    a.h2("reply", b2);
                                    break Label_0337;
                                }
                                if (ordinal == 5) {
                                    a.w2.a(fod, (iuu)null, a.c2);
                                    break Label_0337;
                                }
                                if (ordinal != 70 && ordinal != 71) {
                                    break Label_0337;
                                }
                            }
                            else {
                                if (l0 != null) {
                                    final qum$a qum$a = new qum$a(l0, a.o2, b2);
                                    qum$a.f = (fkj)a;
                                    qum$a.e = (Fragment)a;
                                    qum$a.g = a.p2;
                                    qum$a.h = a.q2;
                                    final qum qum = (qum)((z4j)qum$a).e();
                                    final qda a2 = pda.a(a.c2, a.d2);
                                    qum.a = null;
                                    qum.a((Runnable)new kh8((Object)qum, (Object)a2, 9));
                                }
                                break Label_0337;
                            }
                        }
                    }
                    final xdu t2 = a.t2;
                    if (t2 != null) {
                        t2.n(fod.b, b2, a.f2, (edu)null, false, (vxs)null, (uvp)null, a.p2, a.q2, bhu.M0, cdu.L0);
                    }
                }
                y06.onComplete();
            }
            else if (l0 != null) {
                if (!b2.F0.F0) {
                    if (a.m2 != null) {
                        final u0j o = d4j.O(((Context)((Fragment)a).L0()).getResources(), a.b2, a.p2);
                        final u0j a3 = v0j.a;
                        if (v0j.b.equals((Object)o)) {
                            a.k2(b2);
                            y06.onComplete();
                        }
                        else {
                            final hcf m2 = a.m2;
                            if (m2 != null) {
                                m2.a(b2, o, l0.P(), pda.a(a.c2, a.d2), (Fragment)a, a.q2);
                            }
                        }
                    }
                }
                else {
                    a.k2(b2);
                    y06.onComplete();
                }
            }
        }
    }
}
