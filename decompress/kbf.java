import com.twitter.onboarding.ocf.d$g;
import java.util.concurrent.TimeoutException;
import androidx.work.c$a$c;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbf implements hw1, rtb
{
    public static final kbf G0;
    public static final kbf H0;
    public static final kbf I0;
    public static final kbf J0;
    public static final kbf K0;
    public static final kbf L0;
    public static final kbf M0;
    public static final kbf N0;
    public static final kbf O0;
    public static final kbf P0;
    public static final kbf Q0;
    public static final kbf R0;
    public static final kbf S0;
    public static final kbf T0;
    public static final kbf U0;
    public static final kbf V0;
    public final int F0;
    
    static {
        G0 = new kbf(0);
        H0 = new kbf(1);
        I0 = new kbf(0);
        J0 = new kbf(1);
        K0 = new kbf(2);
        L0 = new kbf(3);
        M0 = new kbf(4);
        N0 = new kbf(5);
        O0 = new kbf(6);
        P0 = new kbf(7);
        Q0 = new kbf(8);
        R0 = new kbf(9);
        S0 = new kbf(10);
        T0 = new kbf(11);
        U0 = new kbf(12);
        V0 = new kbf(13);
    }
    
    public kbf(final int f0) {
        this.F0 = f0;
    }
    
    public Object apply(Object o) {
        switch (this.F0) {
            default: {
                e0e.f(o, "it");
                return kni.a;
            }
            case 12: {
                final noj noj = (noj)o;
                final rmv b = rmv.b;
                o = noj.h((Object)null);
                final int a = o5j.a;
                return new lta(o);
            }
            case 11: {
                final View view = (View)o;
                final uxg m0 = vdb.M0;
                return kni.a;
            }
            case 10: {
                final hp6 hp6 = (hp6)o;
                final long id = UserIdentifier.getCurrent().getId();
                final wtg k = hp6.k();
                final rmv b2 = ita.b();
                int n2;
                final int n = n2 = 0;
                if (b2.b("video_monetization_controls_android_phase1_enabled", false)) {
                    n2 = n;
                    if (k != null) {
                        n2 = n;
                        if (hp6.w() == id) {
                            n2 = n;
                            if (qvg.l(hp6, k) == id) {
                                n2 = 1;
                            }
                        }
                    }
                }
                if (n2 != 0) {
                    o = new noj((Object)k.P0);
                }
                else {
                    o = noj.b;
                    final int a2 = o5j.a;
                }
                return o;
            }
            case 9: {
                return ((iuu)o).k;
            }
            case 8: {
                e0e.f((Object)o, "it");
                return new c$a$c();
            }
            case 7: {
                final Throwable t = (Throwable)o;
                if (t instanceof TimeoutException) {
                    sbw.a().c((tlm)new fg4(zba.d));
                }
                else {
                    r9a.d(t);
                }
                return btm.a((Object)new d$g());
            }
            case 6: {
                return ((CharSequence)o).toString();
            }
            case 5: {
                return new b3g$a((Object)o);
            }
            case 4: {
                return ((ee3)o).e;
            }
            case 3: {
                final dwg dwg = (dwg)o;
                final String[] e = e9d.e;
                return dwg.a;
            }
            case 2: {
                o = ((z2j)o).a;
                vmw.g(o);
                return o;
            }
            case 1: {
                return ((fhj)o).G0;
            }
            case 0: {
                return ((cyf$a)o).a;
            }
        }
    }
    
    public Object b(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final noj noj = (noj)o;
                final kni kni = (kni)o2;
                return noj;
            }
            case 0: {
                return new zvj(o, (Object)o2);
            }
        }
    }
}
