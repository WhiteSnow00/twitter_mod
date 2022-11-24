import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.j;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import com.twitter.permissions.PermissionContentViewResult;
import java.util.List;
import retrofit2.Retrofit;
import tv.periscope.retrofit.RetrofitException;
import retrofit2.Response;
import com.google.android.exoplayer2.drm.c$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ho9 implements rtb, qk6, n2$b
{
    public static final ho9 G0;
    public static final ho9 H0;
    public static final ho9 I0;
    public static final ho9 J0;
    public static final ho9 K0;
    public static final ho9 L0;
    public static final ho9 M0;
    public static final ho9 N0;
    public static final ho9 O0;
    public static final ho9 P0;
    public static final ho9 Q0;
    public static final ho9 R0;
    public static final ho9 S0;
    public static final ho9 T0;
    public static final ho9 U0;
    public static final ho9 V0;
    public static final ho9 W0;
    public static final ho9 X0;
    public static final ho9 Y0;
    public static final ho9 Z0;
    public static final ho9 a1;
    public static final ho9 b1;
    public static final ho9 c1;
    public static final ho9 d1;
    public static final ho9 e1;
    public static final ho9 f1;
    public final int F0;
    
    static {
        G0 = new ho9(0);
        H0 = new ho9(1);
        I0 = new ho9(2);
        J0 = new ho9(3);
        K0 = new ho9(4);
        L0 = new ho9(5);
        M0 = new ho9(6);
        N0 = new ho9(7);
        O0 = new ho9(8);
        P0 = new ho9(9);
        Q0 = new ho9(10);
        R0 = new ho9(11);
        S0 = new ho9(12);
        T0 = new ho9(13);
        U0 = new ho9(14);
        V0 = new ho9(15);
        W0 = new ho9(16);
        X0 = new ho9(17);
        Y0 = new ho9(18);
        Z0 = new ho9(19);
        a1 = new ho9(20);
        b1 = new ho9(21);
        c1 = new ho9(22);
        d1 = new ho9(23);
        e1 = new ho9(24);
        f1 = new ho9(25);
    }
    
    public ho9(final int f0) {
        this.F0 = f0;
    }
    
    public void accept(final Object o) {
        ((c$a)o).d(this.F0);
    }
    
    public Object apply(Object b) {
        final int f0 = this.F0;
        final boolean b2 = false;
        switch (f0) {
            default: {
                final Response response = (Response)b;
                t5j t5j;
                if (!response.isSuccessful()) {
                    t5j = t5j.error((Throwable)RetrofitException.c((String)null, response, (Retrofit)null));
                }
                else {
                    t5j = t5j.just((Object)response.body());
                }
                return t5j;
            }
            case 24: {
                e0e.f(b, "it");
                return b;
            }
            case 23: {
                return ((xzu)b).a;
            }
            case 22: {
                return ((xzu)b).a.G();
            }
            case 21: {
                final Object[] array = (Object[])b;
                final ojf h = ojf.H();
                for (final Object o : array) {
                    final int a = o5j.a;
                    h.p((Object)o);
                }
                final gm$b gm$b = new gm$b();
                ((ojf)gm$b.h).q((Iterable)((z4j)h).e());
                b = new ul$b(0);
                ((pmp$a)b).z((Object)((z4j)gm$b).e());
                return ((cl1$a)b).w();
            }
            case 20: {
                return k6e.i((Iterable)b);
            }
            case 19: {
                final gtm gtm = (gtm)b;
                boolean b3 = b2;
                if (gtm instanceof gtm$b) {
                    b3 = b2;
                    if (p4j.i((PermissionContentViewResult)((gtm$b)gtm).a)) {
                        b3 = true;
                    }
                }
                return b3;
            }
            case 18: {
                return new q7q$b(false, (btm)b);
            }
            case 17: {
                return ((CharSequence)b).toString();
            }
            case 16: {
                final Boolean c1 = ((qgv)b).C1;
                final Boolean false = Boolean.FALSE;
                Boolean b4 = c1;
                if (c1 == null) {
                    b4 = false;
                }
                return b4;
            }
            case 15: {
                final xsc xsc = (xsc)b;
                bbq bbq;
                if (!xsc.b) {
                    final Exception d = xsc.d;
                    final RuntimeException ex = new RuntimeException();
                    Exception ex2;
                    if ((ex2 = d) == null) {
                        ex2 = ex;
                    }
                    bbq = bbq.n((Throwable)ex2);
                }
                else {
                    final lhh lhh = (lhh)xsc.g;
                    if (lhh == null) {
                        bbq = bbq.n((Throwable)new MissingSettingsDataException("MobileSettingsResponse is null"));
                    }
                    else {
                        final jrp b5 = lhh.b;
                        if (b5 == null) {
                            bbq = bbq.n((Throwable)new MissingSettingsDataException("Response contains no push data"));
                        }
                        else if (lhh.d == null) {
                            bbq = bbq.n((Throwable)new MissingSettingsDataException("Response missing push settings"));
                        }
                        else {
                            bbq = bbq.v((Object)new hrl(b5.a, b5.b, lhh.d));
                        }
                    }
                }
                return bbq;
            }
            case 14: {
                return kr4.j((List)b);
            }
            case 13: {
                return bbq.v((Object)((lhh)b).f);
            }
            case 12: {
                return new q1b((List<zzr<v88<Object>>>)b);
            }
            case 11: {
                return ((z2x)b).getImageResponse();
            }
            case 10: {
                b = ((z2j)b).b;
                vmw.g(b);
                return b;
            }
            case 9: {
                final Throwable t = (Throwable)b;
                e0e.f((Object)t, "it");
                return new cda$a(t);
            }
            case 8: {
                return ((noj)b).c();
            }
            case 7: {
                return ((b3u$c)b).b;
            }
            case 6: {
                return ((b3u$c)b).a;
            }
            case 5: {
                return ((jbe)((wt6)b).h).i;
            }
            case 4: {
                return ((m96)b).c;
            }
            case 3: {
                final dci.a a2 = (dci.a)b;
                return Boolean.FALSE;
            }
            case 2: {
                return ((noj)b).c();
            }
            case 1: {
                return ((fjj)b).G0;
            }
            case 0: {
                return ((noj)b).f();
            }
        }
    }
    
    public void d(final j j) {
        final int f0 = this.F0;
        e0e.f((Object)j, "it");
        ((w)j).y(f0);
    }
}
