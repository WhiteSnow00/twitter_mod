import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkc implements rtb, jil$a, ouk, iw1
{
    public static final dkc G0;
    public static final dkc H0;
    public static final dkc I0;
    public static final dkc J0;
    public static final dkc K0;
    public static final dkc L0;
    public static final dkc M0;
    public static final dkc N0;
    public static final dkc O0;
    public static final dkc P0;
    public static final dkc Q0;
    public static final dkc R0;
    public static final dkc S0;
    public static final dkc T0;
    public static final dkc U0;
    public static final dkc V0;
    public static final dkc W0;
    public static final dkc X0;
    public static final dkc Y0;
    public static final dkc Z0;
    public static final dkc a1;
    public static final dkc b1;
    public static final dkc c1;
    public final int F0;
    
    static {
        G0 = new dkc(0);
        H0 = new dkc(1);
        I0 = new dkc(2);
        J0 = new dkc(3);
        K0 = new dkc(4);
        L0 = new dkc(5);
        M0 = new dkc(6);
        N0 = new dkc(7);
        O0 = new dkc(8);
        P0 = new dkc(9);
        Q0 = new dkc(10);
        R0 = new dkc(11);
        S0 = new dkc(12);
        T0 = new dkc(13);
        U0 = new dkc(14);
        V0 = new dkc(15);
        W0 = new dkc(0);
        X0 = new dkc(1);
        Y0 = new dkc(2);
        Z0 = new dkc(3);
        a1 = new dkc(4);
        b1 = new dkc(5);
        c1 = new dkc(6);
    }
    
    public dkc(final int f0) {
        this.F0 = f0;
    }
    
    public Object apply(Object o) {
        final int f0 = this.F0;
        boolean b = true;
        final boolean b2 = true;
        int i = 0;
        switch (f0) {
            default: {
                return ((lbw)o).a;
            }
            case 14: {
                final View view = (View)o;
                final uxg m0 = vdb.M0;
                return kni.a;
            }
            case 13: {
                return ((wow)o).a == 5 && b2;
            }
            case 12: {
                final xsc xsc = (xsc)o;
                bbq bbq;
                if (!xsc.b) {
                    final Exception d = xsc.d;
                    if (d != null) {
                        bbq = bbq.n((Throwable)d);
                    }
                    else {
                        bbq = bbq.n((Throwable)new Exception("NotificationsSettingsCheckInRequest failure", new Throwable(xsc.toString())));
                    }
                }
                else {
                    final lhh lhh = (lhh)xsc.g;
                    if (lhh == null) {
                        bbq = bbq.n((Throwable)new MissingSettingsDataException("MobileSettingsResponse is null"));
                    }
                    else {
                        bbq = bbq.v((Object)lhh);
                    }
                }
                return bbq;
            }
            case 11: {
                return ((b3u$c)o).b;
            }
            case 10: {
                return noj.b(((mw0$a)o).a);
            }
            case 9: {
                return t5j.fromIterable((Iterable)((Map)o).entrySet()).map((rtb)vrf.N0).toList();
            }
            case 8: {
                e0e.f((Object)o, "it");
                return Boolean.FALSE;
            }
            case 7: {
                final View view2 = (View)o;
                return kni.a;
            }
            case 6: {
                return ((phc)o).a;
            }
            case 5: {
                return ((ie4$a)o).b;
            }
            case 4: {
                final List e = kr4.e((Iterable)((ogv)o).c, (nuk)tsf.f);
                final ArrayList list = new ArrayList<Object>(e.size());
                while (i < e.size()) {
                    final ngv ngv = e.get(i);
                    o = new phc.a();
                    final vfv e2 = ngv.e;
                    vmw.g((Object)e2);
                    final String r = e2.r;
                    vmw.g((Object)r);
                    ((phc.a)o).a = r;
                    ((phc.a)o).b = i;
                    ((phc.a)o).e = "remote";
                    list.add(((z4j)o).e());
                    ++i;
                }
                return list;
            }
            case 3: {
                if ((float)o == -1.0f) {
                    b = false;
                }
                return b;
            }
            case 2: {
                final dwg dwg = (dwg)o;
                final String[] e3 = e9d.e;
                return dwg.a;
            }
            case 1: {
                return ((fjj)o).G0;
            }
            case 0: {
                return ((xzf)((noj)o).c()).getId();
            }
        }
    }
    
    public boolean l(final Object o, final Object o2) {
        final sfs sfs = (sfs)o;
        final sfs sfs2 = (sfs)o2;
        return sfs.equals((Object)sfs2) && sfs.a.F0.N0.equals(sfs2.a.F0.N0);
    }
    
    public void r(final b6 b6) {
        switch (this.F0) {
            default: {
                e0e.f((Object)b6, "it");
                return;
            }
            case 0: {
                e0e.f((Object)b6, "it");
            }
        }
    }
    
    public boolean test(final Object o) {
        final int f0 = this.F0;
        final boolean b = true;
        switch (f0) {
            default: {
                final zq0 zq0 = (zq0)o;
                boolean b2 = b;
                if (zq0 != zq0.F0) {
                    b2 = (zq0 == zq0.G0 && b);
                }
                return b2;
            }
            case 3: {
                final rz1 rz1 = (rz1)o;
                return ita.b().b("birdwatch_pivot_enabled", false);
            }
            case 2: {
                return ((List)o).isEmpty() ^ true;
            }
        }
    }
}
