import android.app.Activity;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qew implements r2g$a<n3e<cgv>>
{
    public final Context D0;
    public final r2g E0;
    public a F0;
    public UserIdentifier G0;
    public long H0;
    public String I0;
    public boolean J0;
    
    public qew(final Context d0, final r2g e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void f(final k2g<n3e<cgv>> k2g) {
    }
    
    public final void h(final k2g k2g, final Object o) {
        final n3e n3e = (n3e)o;
        final a f0 = this.F0;
        if (f0 != null) {
            final cgv j1 = (cgv)fq4.p((Iterable)n3e);
            final d9l d9l = (d9l)((b5w)f0).D0;
            if (!d9l.d3) {
                if (!((Activity)((u9)d9l).E0).isFinishing()) {
                    final boolean b = false;
                    if (j1 != null) {
                        final ncw a = ncw.a();
                        final long d0 = j1.D0;
                        final dcg a2 = a.a;
                        jvg a3 = null;
                        final ncw$a ncw$a = (ncw$a)a2.e(d0);
                        if (ncw$a != null) {
                            a3 = ncw$a.a;
                        }
                        if (a3 != null && a3.g().toString().equals(j1.E0)) {
                            a.e(j1.D0);
                        }
                        if (j1.i()) {
                            d9l.M5(j1, false);
                        }
                    }
                    if (d9l.g3 > 0L || ikr.g((CharSequence)d9l.h3)) {
                        boolean b2 = false;
                        Label_0270: {
                            if (j1 != null) {
                                if (!d9l.f3) {
                                    final m4s a4 = hq1.a;
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    if (d9l.N1 ? (j1.c1 + 300000L < currentTimeMillis) : (j1.Z0 + 0L < currentTimeMillis || (j1.M0 && chw.b0(j1.I1)))) {
                                        b2 = true;
                                        break Label_0270;
                                    }
                                }
                            }
                            b2 = false;
                        }
                        if (b2 || j1 == null || !j1.i() || j1.G0.I0 == null || j1.d1 == null || j1.R0 == null) {
                            d9l.S5();
                            return;
                        }
                    }
                    if (j1 != null) {
                        final boolean e3 = d9l.e3;
                        int n = b ? 1 : 0;
                        Label_0410: {
                            if (!e3) {
                                final oma t0 = j1.T0;
                                if (t0 != null) {
                                    boolean b3 = false;
                                    Label_0400: {
                                        if (!e3) {
                                            final m4s a5 = hq1.a;
                                            if (t0.g + 300000L < System.currentTimeMillis()) {
                                                b3 = true;
                                                break Label_0400;
                                            }
                                        }
                                        b3 = false;
                                    }
                                    n = (b ? 1 : 0);
                                    if (!b3) {
                                        break Label_0410;
                                    }
                                }
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            final cnb e4 = ((u9)d9l).E0;
                            final UserIdentifier k0 = ((u9)d9l).K0;
                            final m1c m1c = new m1c((Context)e4, k0, vav.c2(k0));
                            m1c.j1 = j1;
                            d9l.t3.d((anm)m1c);
                            d9l.e3 = true;
                        }
                        d9l.i3.i();
                    }
                }
            }
        }
    }
    
    public final k2g<n3e<cgv>> i(final int n, final Bundle bundle) {
        osl f;
        if (this.H0 > 0L) {
            final osl$a osl$a = new osl$a();
            ((fp1$a)osl$a).t(itl.c("user_id"), new Object[] { this.H0 });
            f = (osl)((n4j)osl$a).e();
        }
        else {
            final osl$a osl$a2 = new osl$a();
            final StringBuilder sb = new StringBuilder();
            sb.append(itl.c("username"));
            sb.append(" COLLATE NOCASE");
            ((fp1$a)osl$a2).u(sb.toString(), new String[] { this.I0 });
            ((fp1$a)osl$a2).q("1");
            f = (osl)((n4j)osl$a2).e();
        }
        final a1m$a a1m$a = new a1m$a(this.D0, ((np1)vav.c2(this.G0)).T());
        a1m$a.c = llw.class;
        a1m$a.d = cgv.class;
        a1m$a.e = bgv$q.a;
        a1m$a.f = f;
        return (k2g<n3e<cgv>>)((n4j)a1m$a).e();
    }
    
    public interface a
    {
    }
}
