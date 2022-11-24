import java.util.Iterator;
import java.io.IOException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import android.net.NetworkInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Calendar;
import android.os.Build;
import android.os.Build$VERSION;
import java.net.MalformedURLException;
import java.net.URL;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn3 implements y1u
{
    public final vee a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final si4 e;
    public final si4 f;
    public final int g;
    
    public wn3(final Context c, final si4 f, final si4 e) {
        final wee wee = new wee();
        a71.a.a((u4a)wee);
        wee.d = true;
        this.a = new vee(wee);
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = c(h73.c);
        this.e = e;
        this.f = f;
        this.g = 40000;
    }
    
    public static URL c(final String s) {
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            throw new IllegalArgumentException(mqb.l("Invalid url: ", s), ex);
        }
    }
    
    public final sca a(sca j) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        j = (sca)j.j();
        ((sca.a)j).a("sdk-version", Build$VERSION.SDK_INT);
        ((sca.a)j).b("model", Build.MODEL);
        ((sca.a)j).b("hardware", Build.HARDWARE);
        ((sca.a)j).b("device", Build.DEVICE);
        ((sca.a)j).b("product", Build.PRODUCT);
        ((sca.a)j).b("os-uild", Build.ID);
        ((sca.a)j).b("manufacturer", Build.MANUFACTURER);
        ((sca.a)j).b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        ((sca.a)j).d().put("tz-offset", String.valueOf((long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        final int n = -1;
        int type;
        if (activeNetworkInfo == null) {
            final edi$b f0 = edi$b.F0;
            type = -1;
        }
        else {
            type = activeNetworkInfo.getType();
        }
        ((sca.a)j).a("net-type", type);
        int subtype = 0;
        Label_0218: {
            if (activeNetworkInfo == null) {
                final edi$a g0 = edi$a.G0;
            }
            else {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    final edi$a h0 = edi$a.H0;
                    subtype = 100;
                    break Label_0218;
                }
                if (edi$a.I0.get(subtype) != null) {
                    break Label_0218;
                }
            }
            subtype = 0;
        }
        ((sca.a)j).a("mobile-subtype", subtype);
        ((sca.a)j).b("country", Locale.getDefault().getCountry());
        ((sca.a)j).b("locale", Locale.getDefault().getLanguage());
        ((sca.a)j).b("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
        final Context c = this.c;
        int versionCode;
        try {
            versionCode = c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            uag.c("CctTransportBackend", "Unable to find version code for package", (Throwable)ex);
            versionCode = n;
        }
        ((sca.a)j).b("application_build", Integer.toString(versionCode));
        return ((sca.a)j).c();
    }
    
    public final wf1 b(final vf1 vf1) {
        final HashMap hashMap = new HashMap();
        final i91 i91 = (i91)vf1;
        for (final sca sca : i91.a) {
            final String h = sca.h();
            if (!hashMap.containsKey(h)) {
                final ArrayList<sca> list = new ArrayList<sca>();
                list.add(sca);
                hashMap.put(h, list);
            }
            else {
                ((List<sca>)hashMap.get(h)).add(sca);
            }
        }
        final ArrayList<b9g> list2 = new ArrayList<b9g>();
        for (final Map.Entry<K, List> entry : hashMap.entrySet()) {
            final sca sca2 = entry.getValue().get(0);
            final vsl f0 = vsl.F0;
            final Long value = this.f.B();
            final Long value2 = this.e.B();
            final w91 w91 = new w91(og4.a.F0, (h20)new h91(sca2.g("sdk-version"), sca2.b("model"), sca2.b("hardware"), sca2.b("device"), sca2.b("product"), sca2.b("os-uild"), sca2.b("manufacturer"), sca2.b("fingerprint"), sca2.b("locale"), sca2.b("country"), sca2.b("mcc_mnc"), sca2.b("application_build")));
            String s;
            Integer value3;
            try {
                final int int1 = Integer.parseInt((String)entry.getKey());
                s = null;
                value3 = int1;
            }
            catch (final NumberFormatException ex) {
                s = (String)entry.getKey();
                value3 = null;
            }
            final ArrayList<mb1> list3 = new ArrayList<mb1>();
            for (final sca sca3 : entry.getValue()) {
                final p4a e = sca3.e();
                final v4a a = e.a;
                mb1$a mb1$a;
                if (a.equals(new v4a("proto"))) {
                    final byte[] b = e.b;
                    mb1$a = new mb1$a();
                    mb1$a.d = b;
                }
                else if (a.equals(new v4a("json"))) {
                    final String e2 = new String(e.b, Charset.forName("UTF-8"));
                    mb1$a = new mb1$a();
                    mb1$a.e = e2;
                }
                else {
                    final String d = uag.d("CctTransportBackend");
                    if (Log.isLoggable(d, 5)) {
                        Log.w(d, String.format("Received event of unsupported encoding %s. Skipping...", a));
                        continue;
                    }
                    continue;
                }
                mb1$a.a = sca3.f();
                mb1$a.c = sca3.i();
                final String s2 = sca3.c().get("tz-offset");
                long longValue;
                if (s2 == null) {
                    longValue = 0L;
                }
                else {
                    longValue = Long.valueOf(s2);
                }
                mb1$a.f = longValue;
                mb1$a.g = (edi)new pb1((edi$b)edi$b.G0.get(sca3.g("net-type")), (edi$a)edi$a.I0.get(sca3.g("mobile-subtype")));
                if (sca3.d() != null) {
                    mb1$a.b = sca3.d();
                }
                String s3;
                if (mb1$a.a == null) {
                    s3 = " eventTimeMs";
                }
                else {
                    s3 = "";
                }
                String l = s3;
                if (mb1$a.c == null) {
                    l = mqb.l(s3, " eventUptimeMs");
                }
                String j = l;
                if (mb1$a.f == null) {
                    j = mqb.l(l, " timezoneOffsetSeconds");
                }
                if (!j.isEmpty()) {
                    throw new IllegalStateException(mqb.l("Missing required properties:", j));
                }
                list3.add(new mb1((long)mb1$a.a, mb1$a.b, (long)mb1$a.c, mb1$a.d, mb1$a.e, (long)mb1$a.f, mb1$a.g));
            }
            String s4;
            if (value == null) {
                s4 = " requestTimeMs";
            }
            else {
                s4 = "";
            }
            String k = s4;
            if (value2 == null) {
                k = mqb.l(s4, " requestUptimeMs");
            }
            if (!k.isEmpty()) {
                throw new IllegalStateException(mqb.l("Missing required properties:", k));
            }
            list2.add(new nb1(value, value2, (og4)w91, value3, s, list3, f0, null));
        }
        int n = 5;
        final l91 l2 = new l91(list2);
        URL url = this.d;
        Label_1085: {
            if (i91.b != null) {
                try {
                    final h73 a2 = h73.a(((i91)vf1).b);
                    String b2 = a2.b;
                    if (b2 == null) {
                        b2 = null;
                    }
                    final String a3 = a2.a;
                    String s5 = b2;
                    if (a3 != null) {
                        url = c(a3);
                        s5 = b2;
                    }
                    break Label_1085;
                }
                catch (final IllegalArgumentException ex2) {
                    return wf1.a();
                }
            }
            String s5 = null;
            try {
                wn3.wn3$a wn3$a = new wn3.wn3$a(url, (ws1)l2, s5);
                final pn1 pn1 = new pn1((Object)this, 0);
                Object m;
                do {
                    m = pn1.l((Object)wn3$a);
                    final wn3.wn3$b wn3$b = (wn3.wn3$b)m;
                    final URL b3 = wn3$b.b;
                    if (b3 != null) {
                        uag.a("CctTransportBackend", "Following redirect to: %s", (Object)b3);
                        wn3$a = new wn3.wn3$a(wn3$b.b, wn3$a.b, wn3$a.c);
                    }
                    else {
                        wn3$a = null;
                    }
                } while (wn3$a != null && --n >= 1);
                final wn3.wn3$b wn3$b2 = (wn3.wn3$b)m;
                final int a4 = wn3$b2.a;
                if (a4 == 200) {
                    return (wf1)new j91(1, wn3$b2.c);
                }
                if (a4 >= 500 || a4 == 404) {
                    return (wf1)new j91(2, -1L);
                }
                if (a4 == 400) {
                    return (wf1)new j91(4, -1L);
                }
                return wf1.a();
            }
            catch (final IOException ex3) {
                uag.c("CctTransportBackend", "Could not make request to the backend", (Throwable)ex3);
                return (wf1)new j91(2, -1L);
            }
        }
    }
}
