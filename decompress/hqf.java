import java.util.Map;
import com.twitter.notifications.settings.persistence.MissingSmsDeviceInformationException;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import com.twitter.onboarding.ocf.settings.AbstractSettingsViewModel$a;
import java.util.List;
import android.view.View;
import tv.periscope.android.api.service.payman.response.GetGiftsCatalogResponse;
import retrofit2.Retrofit;
import tv.periscope.retrofit.RetrofitException;
import retrofit2.Response;
import tv.periscope.android.api.UnfollowResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqf implements psb
{
    public static final hqf E0;
    public static final hqf F0;
    public static final hqf G0;
    public static final hqf H0;
    public static final hqf I0;
    public static final hqf J0;
    public static final hqf K0;
    public static final hqf L0;
    public static final hqf M0;
    public static final hqf N0;
    public static final hqf O0;
    public static final hqf P0;
    public static final hqf Q0;
    public static final hqf R0;
    public static final hqf S0;
    public static final hqf T0;
    public static final hqf U0;
    public static final hqf V0;
    public static final hqf W0;
    public static final hqf X0;
    public static final hqf Y0;
    public static final hqf Z0;
    public static final hqf a1;
    public static final hqf b1;
    public static final hqf c1;
    public final int D0;
    
    static {
        E0 = new hqf(0);
        F0 = new hqf(1);
        G0 = new hqf(2);
        H0 = new hqf(3);
        I0 = new hqf(4);
        J0 = new hqf(5);
        K0 = new hqf(6);
        L0 = new hqf(7);
        M0 = new hqf(8);
        N0 = new hqf(9);
        O0 = new hqf(10);
        P0 = new hqf(11);
        Q0 = new hqf(12);
        R0 = new hqf(13);
        S0 = new hqf(14);
        T0 = new hqf(15);
        U0 = new hqf(16);
        V0 = new hqf(17);
        W0 = new hqf(18);
        X0 = new hqf(19);
        Y0 = new hqf(20);
        Z0 = new hqf(21);
        a1 = new hqf(22);
        b1 = new hqf(23);
        c1 = new hqf(24);
    }
    
    public hqf(final int d0) {
        this.D0 = d0;
    }
    
    public final Object apply(Object g) {
        final int d0 = this.D0;
        final boolean b = false;
        boolean b2 = false;
        switch (d0) {
            default: {
                final UnfollowResponse unfollowResponse = (UnfollowResponse)g;
                return h5j.empty();
            }
            case 23: {
                final Response response = (Response)g;
                h5j h5j;
                if (!response.isSuccessful()) {
                    h5j = h5j.error((Throwable)RetrofitException.c((String)null, response, (Retrofit)null));
                }
                else {
                    h5j = h5j.just((Object)response.body());
                }
                return h5j;
            }
            case 22: {
                return h5j.just((Object)((GetGiftsCatalogResponse)g).gifts);
            }
            case 21: {
                return ((ynj)g).c();
            }
            case 20: {
                final View view = (View)g;
                final eib k0 = ucb.K0;
                return tmi.a;
            }
            case 19: {
                return ((mzu)g).a.G();
            }
            case 18: {
                return ((mzu)g).o;
            }
            case 17: {
                return ((mzu)g).a;
            }
            case 16: {
                final fjj fjj = (fjj)g;
                final String h = wyo.h;
                return tmi.a;
            }
            case 15: {
                return new AbstractSettingsViewModel$a((List)g);
            }
            case 14: {
                final xrc xrc = (xrc)g;
                eaq eaq;
                if (!xrc.b) {
                    final Exception d2 = xrc.d;
                    final RuntimeException ex = new RuntimeException();
                    Exception ex2;
                    if ((ex2 = d2) == null) {
                        ex2 = ex;
                    }
                    eaq = eaq.n((Throwable)ex2);
                }
                else {
                    final vgh vgh = (vgh)xrc.g;
                    if (vgh == null) {
                        eaq = eaq.n((Throwable)new MissingSettingsDataException("MobileSettingsResponse is null"));
                    }
                    else {
                        final Boolean g2 = vgh.g;
                        if (g2 != null && !g2) {
                            eaq = eaq.n((Throwable)new MissingSmsDeviceInformationException());
                        }
                        else {
                            final oqp c = vgh.c;
                            if (c == null) {
                                eaq = eaq.n((Throwable)new MissingSettingsDataException("Response contains no sms data"));
                            }
                            else if (vgh.e == null) {
                                eaq = eaq.n((Throwable)new MissingSettingsDataException("Response missing sms settings"));
                            }
                            else {
                                eaq = eaq.v((Object)new vql(c.a, c.b, vgh.e));
                            }
                        }
                    }
                }
                return eaq;
            }
            case 13: {
                final xrc xrc2 = (xrc)g;
                eaq eaq2;
                if (!xrc2.b) {
                    eaq2 = eaq.n((Throwable)new RuntimeException());
                }
                else {
                    g = xrc2.g;
                    if (g == null) {
                        eaq2 = eaq.n((Throwable)new MissingSettingsDataException("MobileSettingsResponse is null"));
                    }
                    else {
                        eaq2 = eaq.v((Object)g);
                    }
                }
                return eaq2;
            }
            case 12: {
                return nsi.f((List)g);
            }
            case 11: {
                return ((ynj)g).c();
            }
            case 10: {
                final jvg jvg = (jvg)g;
                final edq a = myg.a;
                return jvg.a;
            }
            case 9: {
                final mvh$a mvh$a = (mvh$a)g;
                final int a2 = mvh$a.a;
                eni eni;
                if (a2 == 1) {
                    eni = new eni(fni.G0, mvh$a.b);
                }
                else if (a2 == 2) {
                    eni = new eni(fni.H0, mvh$a.b);
                }
                else {
                    eni = new eni(fni.D0, mvh$a.b);
                }
                return eni;
            }
            case 8: {
                czd.f((Object)g, "it");
                return f2a.D0;
            }
            case 7: {
                return ((Map)g).keySet();
            }
            case 6: {
                return ((ynj)g).c();
            }
            case 5: {
                return ikr.l(((njw)g).b);
            }
            case 4: {
                final zgh zgh = (zgh)g;
                if (zgh == zgh.H0 || zgh == zgh.I0) {
                    b2 = true;
                }
                return b2;
            }
            case 3: {
                return Math.round((float)g * 100.0) / 100.0f;
            }
            case 2: {
                final p6g p6g = (p6g)((ynj)g).c();
                return new v0c(p6g.a, p6g.b, (String)null);
            }
            case 1: {
                return ((hxf$a)g).a;
            }
            case 0: {
                final jqf jqf = (jqf)g;
                final List v = rif.v((Object)jqf.h);
                final deq$a deq$a = new deq$a("");
                deq$a.p(v);
                int n = b ? 1 : 0;
                if (ikr.g((CharSequence)jqf.t)) {
                    n = (b ? 1 : 0);
                    if (ikr.g((CharSequence)jqf.u)) {
                        n = (b ? 1 : 0);
                        if (ikr.g((CharSequence)jqf.v)) {
                            n = (b ? 1 : 0);
                            if (ikr.g((CharSequence)jqf.w)) {
                                n = 1;
                            }
                        }
                    }
                }
                Object o;
                if (n != 0) {
                    g = new oeb$a();
                    ((oeb$a)g).a = ikr.n(jqf.t, -1);
                    ((oeb$a)g).b = ikr.n(jqf.u, -1);
                    ((oeb$a)g).c = ikr.n(jqf.v, -1);
                    ((oeb$a)g).d = ikr.n(jqf.w, -1);
                    o = rif.v((Object)((n4j)g).e());
                }
                else {
                    o = gdd.E0;
                    final int a3 = c5j.a;
                }
                deq$a.o((List)o);
                deq$a.b = jqf.j;
                return ((n4j)deq$a).e();
            }
        }
    }
}
