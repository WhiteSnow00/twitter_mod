import tv.periscope.android.api.RestClient;
import okhttp3.Interceptor;
import java.util.Map;
import retrofit2.Converter$Factory;
import retrofit2.converter.gson.GsonConverterFactory;
import tv.periscope.android.api.RestClient$Builder;
import java.util.HashMap;
import tv.periscope.android.api.service.hydra.JanusService;
import java.util.concurrent.Executor;
import com.twitter.util.user.UserIdentifier;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import android.content.Context;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.Decoder;
import androidx.appcompat.app.a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tkr implements c0z
{
    public static final tkr F0;
    public static final qqf G0;
    public static final v0g H0;
    public static final n9f I0;
    public static final dvf J0;
    public static final cvf K0;
    public static final fvf L0;
    public static final evf M0;
    public static final vvf N0;
    public static final uvf O0;
    public static final xvf P0;
    public static final wvf Q0;
    public static final mvf R0;
    public static final lvf S0;
    public static final ovf T0;
    public static final nvf U0;
    public static final mqf V0;
    public static final nqf W0;
    public static final ouf X0;
    public static final puf Y0;
    public static final s0g Z0;
    public static final mg2 a1;
    public static final mg2 b1;
    public static final int[] c1;
    public static final tkr d1;
    
    static {
        F0 = new tkr();
        G0 = new qqf();
        H0 = new v0g();
        I0 = new n9f();
        J0 = new dvf(0);
        K0 = new cvf();
        L0 = new fvf();
        M0 = new evf();
        N0 = new vvf(0);
        O0 = new uvf();
        P0 = new xvf();
        Q0 = new wvf();
        R0 = new mvf();
        S0 = new lvf(0);
        T0 = new ovf();
        U0 = new nvf();
        V0 = new mqf();
        W0 = new nqf();
        X0 = new ouf();
        Y0 = new puf();
        Z0 = new s0g(0);
        a1 = new mg2(1);
        b1 = new mg2(0);
        c1 = new int[] { 2130970582, 2130970583, 2130970584, 2130970585, 2130970586, 2130970587, 2130970588, 2130970589, 2130970590, 2130970591, 2130970592, 2130970593, 2130970594, 2130970595, 2130970596, 2130970597, 2130970598, 2130970599, 2130970600, 2130970601, 2130970602 };
        d1 = new tkr();
    }
    
    public tkr() {
    }
    
    public tkr(final bns bns) {
        e0e.f((Object)bns, "themeVariant");
    }
    
    public tkr(final zai zai, final pkx pkx, final View view) {
        zai.d().M(view, new a.a(-1, -1));
        pkx.b(view);
    }
    
    public static final yee b(final Decoder decoder) {
        e0e.f((Object)decoder, "<this>");
        yee yee;
        if (decoder instanceof yee) {
            yee = (yee)decoder;
        }
        else {
            yee = null;
        }
        if (yee != null) {
            return yee;
        }
        final StringBuilder f = ehk.f("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        f.append(iam.a((Class)decoder.getClass()));
        throw new IllegalStateException(f.toString());
    }
    
    public static final mfe c(final Encoder encoder) {
        e0e.f((Object)encoder, "<this>");
        mfe mfe;
        if (encoder instanceof mfe) {
            mfe = (mfe)encoder;
        }
        else {
            mfe = null;
        }
        if (mfe != null) {
            return mfe;
        }
        final StringBuilder f = ehk.f("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        f.append(iam.a((Class)encoder.getClass()));
        throw new IllegalStateException(f.toString());
    }
    
    public static final String e(final long n, final d86 d86) {
        d86.x(-1608780820);
        final sa6$b a = sa6.a;
        final Context context = (Context)d86.m((df6)z20.b);
        d86.x(-492369756);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        final d86$a$a b = d86$a.b;
        Serializable locale = (Serializable)y;
        if (y == b) {
            locale = context.getResources().getConfiguration().locale;
            d86.p((Object)locale);
        }
        d86.O();
        final Locale locale2 = (Locale)locale;
        d86.x(-492369756);
        Object y2;
        if ((y2 = d86.y()) == b) {
            y2 = new SimpleDateFormat(rrs.k(context), locale2);
            d86.p(y2);
        }
        d86.O();
        final SimpleDateFormat simpleDateFormat = (SimpleDateFormat)y2;
        d86.x(-492369756);
        Object y3;
        if ((y3 = d86.y()) == b) {
            y3 = new SimpleDateFormat(rrs.j(context), locale2);
            d86.p(y3);
        }
        d86.O();
        final SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat)y3;
        d86.x(-492369756);
        Object y4;
        if ((y4 = d86.y()) == b) {
            y4 = new SimpleDateFormat(rrs.i(context), locale2);
            d86.p(y4);
        }
        d86.O();
        final SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat)y4;
        String s;
        if (nq1.g(n, 0)) {
            s = simpleDateFormat.format(n);
            e0e.e((Object)s, "sameDayDateFormat.format(this)");
        }
        else if (nq1.e(n)) {
            final String format = simpleDateFormat.format(n);
            e0e.e((Object)format, "sameDayDateFormat.format(this)");
            s = kqe.s0(2131959658, new Object[] { format }, d86);
        }
        else if (nq1.f(n)) {
            s = simpleDateFormat2.format(n);
            e0e.e((Object)s, "sameWeekDateFormat.format(this)");
        }
        else {
            s = simpleDateFormat3.format(n);
            e0e.e((Object)s, "otherDateFormat.format(this)");
        }
        d86.O();
        return s;
    }
    
    public static final int f(final CharSequence charSequence, int i) {
        e0e.f((Object)charSequence, "<this>");
        ++i;
        while (i < charSequence.length()) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            ++i;
        }
        return charSequence.length();
    }
    
    public static final int g(final CharSequence charSequence, int i) {
        e0e.f((Object)charSequence, "<this>");
        --i;
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            --i;
        }
        return 0;
    }
    
    public static noj h(final k5w k5w, final double n) {
        final jx9 b = k5w.a.b(2);
        int n3;
        final int n2 = n3 = 0;
        Label_0094: {
            if (b != null) {
                if (b instanceof qx9) {
                    final qx9 qx9 = (qx9)b;
                    n3 = qx9.K0 - qx9.J0;
                    if (n3 > 0) {
                        break Label_0094;
                    }
                }
                final dwg f0 = b.F0;
                n3 = n2;
                if (f0 instanceof p0x) {
                    final int j = ((p0x)f0).j;
                    n3 = n2;
                    if (j > 0) {
                        n3 = j;
                    }
                }
            }
        }
        if (n3 > 0) {
            return new noj((Object)(n3 / 1000.0 * 524288.0 / n));
        }
        final dwg a = k5w.a();
        if (a != null) {
            return new noj((Object)(a.a.length() / n));
        }
        final noj b2 = noj.b;
        final int a2 = o5j.a;
        return b2;
    }
    
    public static final qgv i(final tp7 tp7, final UserIdentifier userIdentifier) {
        e0e.f((Object)tp7, "<this>");
        e0e.f((Object)userIdentifier, "owner");
        qgv qgv;
        if (!tp7.g && tp7.h.size() == 2) {
            if (tp7.h.get(0).F0 != userIdentifier.getId()) {
                qgv = tp7.h.get(0).K0;
            }
            else {
                qgv = tp7.h.get(1).K0;
            }
        }
        else {
            qgv = null;
        }
        return qgv;
    }
    
    public static kcm j(final Context context) {
        if (context instanceof oec) {
            final int a = o5j.a;
            return ((xtm)((oec)context).t0((Class)xtm.class)).j();
        }
        return kcm.H0;
    }
    
    public static boolean k() {
        return ita.b().b("android_tweet_promote_button_enabled", false);
    }
    
    public static boolean l(final hp6 hp6, final int n, final boolean b) {
        final boolean k = k();
        final boolean b2 = true;
        if (k) {
            final a5l h = hp6.H();
            Objects.requireNonNull(a5l.Companion);
            e0e.f((Object)h, "reason");
            if ((h == a5l.H0 || h == a5l.G0) && !b && (z8t.d(n) || z8t.a(n) || n == 26) && !z8t.b(n)) {
                return b2;
            }
        }
        return false;
    }
    
    public static final vnb m(final vnb vnb, final vnb vnb2) {
        e0e.f((Object)vnb, "<this>");
        e0e.f((Object)vnb2, "prefix");
        final boolean a = e0e.a((Object)vnb, (Object)vnb2);
        final boolean b = false;
        int n = 0;
        Label_0100: {
            if (!a) {
                if (!vnb2.d()) {
                    final String b2 = vnb.b();
                    e0e.e((Object)b2, "this.asString()");
                    final String b3 = vnb2.b();
                    e0e.e((Object)b3, "packageName.asString()");
                    n = (b ? 1 : 0);
                    if (!slr.q1(b2, b3, false)) {
                        break Label_0100;
                    }
                    n = (b ? 1 : 0);
                    if (b2.charAt(b3.length()) != '.') {
                        break Label_0100;
                    }
                }
            }
            n = 1;
        }
        vnb c = vnb;
        if (n != 0) {
            if (vnb2.d()) {
                c = vnb;
            }
            else if (e0e.a((Object)vnb, (Object)vnb2)) {
                c = vnb.c;
                e0e.e((Object)c, "ROOT");
            }
            else {
                final String b4 = vnb.b();
                e0e.e((Object)b4, "asString()");
                final String substring = b4.substring(vnb2.b().length() + 1);
                e0e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                c = new vnb(substring);
            }
        }
        return c;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return (int)stz.G0.b().f();
    }
    
    public JanusService d(final Context context, final Executor executor, final String s, final String s2) {
        synchronized (this) {
            e0e.f((Object)context, "context");
            e0e.f((Object)executor, "executor");
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Authorization", s2);
            final RestClient$Builder executor2 = new RestClient$Builder().context(context).executor(executor);
            String string = s;
            if (xlr.c2((CharSequence)s) != '/') {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("/");
                string = sb.toString();
            }
            final RestClient$Builder extraHeaders = executor2.endpoint(string).converterFactory((Converter$Factory)GsonConverterFactory.create(new x9c().a())).extraHeaders((Map)hashMap);
            d7b.a();
            final RestClient build = extraHeaders.addNetworkInterceptor((Interceptor)null).timeoutSec(Integer.valueOf(32)).build();
            e0e.e((Object)build, "Builder()\n            .c\u2026SEC)\n            .build()");
            final Object service = build.getService((Class)JanusService.class);
            e0e.e(service, "restClient.getService(JanusService::class.java)");
            return (JanusService)service;
        }
    }
}
