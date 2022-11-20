import android.os.BaseBundle;
import com.google.android.exoplayer2.w;
import com.twitter.app.dm.DMConversationSettingsPreferenceFragment;
import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import java.util.ArrayList;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.w$a;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.f;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.exoplayer2.d;
import com.google.android.exoplayer2.j;
import java.util.Map;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.source.o;
import android.net.Uri;
import com.twitter.report.subsystem.ReportFlowWebViewResult;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost;
import android.content.Intent;
import com.google.android.exoplayer2.f$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9l implements tsm, z1r$d, too$a, f$a, kj6, pna, g4d$a, a, mrg$a, ytk, gtb, r2$b, w9h$b
{
    public static final b9l E0;
    public static final b9l F0;
    public static final b9l G0;
    public static final b9l H0;
    public static final b9l I0;
    public static final b9l J0;
    public static final b9l K0;
    public static final b9l L0;
    public static final b9l M0;
    public static final b9l N0;
    public static final b9l O0;
    public static final b9l P0;
    public static final b9l Q0;
    public static final b9l R0;
    public static final b9l S0;
    public static final b9l T0;
    public static final b9l U0;
    public static final b9l V0;
    public static final b9l W0;
    public static final b9l X0;
    public static final b9l Y0;
    public static final b9l Z0;
    public final int D0;
    
    static {
        E0 = new b9l(0);
        F0 = new b9l(1);
        G0 = new b9l(2);
        H0 = new b9l(0);
        I0 = new b9l(2);
        J0 = new b9l(4);
        K0 = new b9l(6);
        L0 = new b9l(8);
        M0 = new b9l(9);
        N0 = new b9l(10);
        O0 = new b9l(11);
        P0 = new b9l(13);
        Q0 = new b9l(14);
        R0 = new b9l(15);
        S0 = new b9l(16);
        T0 = new b9l(17);
        U0 = new b9l(18);
        V0 = new b9l(19);
        W0 = new b9l(20);
        X0 = new b9l(21);
        Y0 = new b9l(22);
        Z0 = new b9l(23);
    }
    
    public b9l(final int d0) {
        this.D0 = d0;
    }
    
    public Object a(final Intent intent) {
        switch (this.D0) {
            default: {
                final String[] v0 = SelectBannerSubtaskViewHost.V0;
                return rm6.f(intent.getExtras(), PermissionContentViewResult.class);
            }
            case 1: {
                final String[] u1 = dl1.u1;
                return rm6.f(intent.getExtras(), PermissionContentViewResult.class);
            }
            case 0: {
                final Uri y3 = d9l.Y3;
                return rm6.f(intent.getExtras(), ReportFlowWebViewResult.class);
            }
        }
    }
    
    public void accept(final Object o) {
        switch (this.D0) {
            default: {
                ((o.b)o).b.release();
                return;
            }
            case 5: {
                ((c$a)o).c();
            }
        }
    }
    
    public Object apply(final Object o) {
        final Throwable t = (Throwable)o;
        final t3a i0 = too.I0;
        throw new SynchronizationException("Timed out while trying to acquire the lock.", t);
    }
    
    public boolean b(final int n, final int n2, final int n3, final int n4, final int n5) {
        final b9l f0 = g4d.F0;
        return false;
    }
    
    public int c() {
        final i71 h = w9h.h;
        return z9h.a().b;
    }
    
    public Object d(final Object o, final Object o2) {
        final Integer n = (Integer)o;
        final njw njw = (njw)o2;
        final int i2 = a1h.i2;
        final long a = njw.a;
        final int intValue = n;
        final String h = njw.h;
        final gfv gfv = new gfv();
        gfv.c = 3;
        gfv.a = a;
        gfv.f = intValue + 1;
        gfv.k = h;
        return gfv;
    }
    
    public ina[] e(final Uri uri, final Map map) {
        switch (this.D0) {
            default: {
                final int a = ona.a;
                break;
            }
            case 6: {
                final int a2 = ona.a;
                break;
            }
        }
        return this.g();
    }
    
    public void f(final j j) {
        czd.f((Object)j, "it");
        final d d = (d)j;
        d.m(-((w)d).L0());
    }
    
    public ina[] g() {
        switch (this.D0) {
            default: {
                return new ina[] { (ina)new cog() };
            }
            case 6: {
                final int a = ona.a;
                return new ina[0];
            }
        }
    }
    
    public Object j(final JsonReader jsonReader) {
        return k07.b(jsonReader);
    }
    
    public void k(final g3 g3) {
    }
    
    public boolean l() {
        return false;
    }
    
    public f m(Bundle bundle) {
        final int d0 = this.D0;
        int i = 0;
        switch (d0) {
            default: {
                return (f)new rq4(((BaseBundle)bundle).getInt(rq4.c(0), -1), ((BaseBundle)bundle).getInt(rq4.c(1), -1), ((BaseBundle)bundle).getInt(rq4.c(2), -1), bundle.getByteArray(rq4.c(3)));
            }
            case 4: {
                final int int1 = ((BaseBundle)bundle).getInt(e0$b.h(0), 0);
                final long long1 = ((BaseBundle)bundle).getLong(e0$b.h(1), -9223372036854775807L);
                final long long2 = ((BaseBundle)bundle).getLong(e0$b.h(2), 0L);
                final boolean boolean1 = bundle.getBoolean(e0$b.h(3));
                bundle = bundle.getBundle(e0$b.h(4));
                qq j0;
                if (bundle != null) {
                    j0 = (qq)qq.L0.m(bundle);
                }
                else {
                    j0 = qq.J0;
                }
                final e0$b e0$b = new e0$b();
                e0$b.i((Object)null, (Object)null, int1, long1, long2, j0, boolean1);
                return (f)e0$b;
            }
            case 3: {
                final w$a e0 = w$a.E0;
                final ArrayList integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
                w$a e2;
                if (integerArrayList == null) {
                    e2 = w$a.E0;
                }
                else {
                    final SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                    while (i < integerArrayList.size()) {
                        sparseBooleanArray.append((int)integerArrayList.get(i), true);
                        ++i;
                    }
                    e2 = new w$a(new l1b(sparseBooleanArray));
                }
                return (f)e2;
            }
            case 2: {
                omy.g(((BaseBundle)bundle).getInt(com.google.android.exoplayer2.o.a(0), -1) == 0);
                com.google.android.exoplayer2.o o;
                if (bundle.getBoolean(com.google.android.exoplayer2.o.a(1), false)) {
                    o = new com.google.android.exoplayer2.o(bundle.getBoolean(com.google.android.exoplayer2.o.a(2), false));
                }
                else {
                    o = new com.google.android.exoplayer2.o();
                }
                return (f)o;
            }
        }
    }
    
    public boolean test(Object b) {
        final int d0 = this.D0;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        switch (d0) {
            default: {
                final boolean booleanValue = (boolean)b;
                final b9l a = dno.a;
                return booleanValue ^ true;
            }
            case 18: {
                final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction = (ReportFlowWebViewResultForAction)b;
                final int m2 = DMConversationSettingsPreferenceFragment.M2;
                if (reportFlowWebViewResultForAction.getResult() != 3) {
                    b4 = false;
                }
                return b4;
            }
            case 17: {
                return chw.u((PermissionContentViewResult)b);
            }
            case 16: {
                b = ((m2j)b).b;
                jee.l(b);
                return b == s8x.D0 && b2;
            }
            case 15: {
                return ((ynj)b).f();
            }
            case 14: {
                return ((q4h$c)b).a != null && b3;
            }
        }
    }
}
