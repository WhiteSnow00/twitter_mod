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

public final class pn3 implements p0u
{
    public final qee a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final mi4 e;
    public final mi4 f;
    public final int g;
    
    public pn3(final Context c, final mi4 f, final mi4 e) {
        final ree ree = new ree();
        z61.a.a((i4a)ree);
        ree.d = true;
        this.a = new qee(ree);
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = c(y63.c);
        this.e = e;
        this.f = f;
        this.g = 40000;
    }
    
    public static URL c(final String s) {
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            throw new IllegalArgumentException(l7k.c("Invalid url: ", s), ex);
        }
    }
    
    public final cca a(cca j) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        j = (cca)j.j();
        ((cca$a)j).a("sdk-version", Build$VERSION.SDK_INT);
        ((cca$a)j).b("model", Build.MODEL);
        ((cca$a)j).b("hardware", Build.HARDWARE);
        ((cca$a)j).b("device", Build.DEVICE);
        ((cca$a)j).b("product", Build.PRODUCT);
        ((cca$a)j).b("os-uild", Build.ID);
        ((cca$a)j).b("manufacturer", Build.MANUFACTURER);
        ((cca$a)j).b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        ((cca$a)j).d().put("tz-offset", String.valueOf((long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        final int n = -1;
        int type;
        if (activeNetworkInfo == null) {
            final lci$b c0 = lci$b.C0;
            type = -1;
        }
        else {
            type = activeNetworkInfo.getType();
        }
        ((cca$a)j).a("net-type", type);
        int subtype = 0;
        Label_0218: {
            if (activeNetworkInfo == null) {
                final lci$a d0 = lci$a.D0;
            }
            else {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    final lci$a e0 = lci$a.E0;
                    subtype = 100;
                    break Label_0218;
                }
                if (lci$a.F0.get(subtype) != null) {
                    break Label_0218;
                }
            }
            subtype = 0;
        }
        ((cca$a)j).a("mobile-subtype", subtype);
        ((cca$a)j).b("country", Locale.getDefault().getCountry());
        ((cca$a)j).b("locale", Locale.getDefault().getLanguage());
        ((cca$a)j).b("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
        final Context c2 = this.c;
        int versionCode;
        try {
            versionCode = c2.getPackageManager().getPackageInfo(c2.getPackageName(), 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            jag.c("CctTransportBackend", "Unable to find version code for package", (Throwable)ex);
            versionCode = n;
        }
        ((cca$a)j).b("application_build", Integer.toString(versionCode));
        return ((cca$a)j).c();
    }
    
    public final xf1 b(final wf1 wf1) {
        final HashMap hashMap = new HashMap();
        final i91 i91 = (i91)wf1;
        for (final cca cca : i91.a) {
            final String h = cca.h();
            if (!hashMap.containsKey(h)) {
                final ArrayList<cca> list = new ArrayList<cca>();
                list.add(cca);
                hashMap.put(h, list);
            }
            else {
                ((List<cca>)hashMap.get(h)).add(cca);
            }
        }
        final ArrayList<r8g> list2 = new ArrayList<r8g>();
        for (final Map.Entry<K, List> entry : hashMap.entrySet()) {
            final cca cca2 = entry.getValue().get(0);
            final vrl c0 = vrl.C0;
            final Long value = this.f.B();
            final Long value2 = this.e.B();
            final w91 w91 = new w91(ig4$a.C0, (i20)new h91(Integer.valueOf(cca2.g("sdk-version")), cca2.b("model"), cca2.b("hardware"), cca2.b("device"), cca2.b("product"), cca2.b("os-uild"), cca2.b("manufacturer"), cca2.b("fingerprint"), cca2.b("locale"), cca2.b("country"), cca2.b("mcc_mnc"), cca2.b("application_build")));
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
            for (final cca cca3 : entry.getValue()) {
                final d4a e = cca3.e();
                final j4a a = e.a;
                mb1.a a2;
                if (a.equals(new j4a("proto"))) {
                    final byte[] b = e.b;
                    a2 = new mb1.a();
                    a2.d = b;
                }
                else if (a.equals(new j4a("json"))) {
                    final String e2 = new String(e.b, Charset.forName("UTF-8"));
                    a2 = new mb1.a();
                    a2.e = e2;
                }
                else {
                    final String d = jag.d("CctTransportBackend");
                    if (Log.isLoggable(d, 5)) {
                        Log.w(d, String.format("Received event of unsupported encoding %s. Skipping...", a));
                        continue;
                    }
                    continue;
                }
                a2.a = cca3.f();
                a2.c = cca3.i();
                final String s2 = cca3.c().get("tz-offset");
                long longValue;
                if (s2 == null) {
                    longValue = 0L;
                }
                else {
                    longValue = Long.valueOf(s2);
                }
                a2.f = longValue;
                a2.g = new pb1((lci$b)lci$b.D0.get(cca3.g("net-type")), (lci$a)lci$a.F0.get(cca3.g("mobile-subtype")));
                if (cca3.d() != null) {
                    a2.b = cca3.d();
                }
                String s3;
                if (a2.a == null) {
                    s3 = " eventTimeMs";
                }
                else {
                    s3 = "";
                }
                String c2 = s3;
                if (a2.c == null) {
                    c2 = l7k.c(s3, " eventUptimeMs");
                }
                String c3 = c2;
                if (a2.f == null) {
                    c3 = l7k.c(c2, " timezoneOffsetSeconds");
                }
                if (!c3.isEmpty()) {
                    throw new IllegalStateException(l7k.c("Missing required properties:", c3));
                }
                list3.add(new mb1(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f, a2.g));
            }
            String s4;
            if (value == null) {
                s4 = " requestTimeMs";
            }
            else {
                s4 = "";
            }
            String c4 = s4;
            if (value2 == null) {
                c4 = l7k.c(s4, " requestUptimeMs");
            }
            if (!c4.isEmpty()) {
                throw new IllegalStateException(l7k.c("Missing required properties:", c4));
            }
            list2.add((r8g)new nb1((long)value, (long)value2, (ig4)w91, value3, s, (List)list3, c0, (nb1$a)null));
        }
        int n = 5;
        final l91 l91 = new l91(list2);
        URL url = this.d;
        Label_1077: {
            if (i91.b != null) {
                try {
                    final y63 a3 = y63.a(((i91)wf1).b);
                    String b2 = a3.b;
                    if (b2 == null) {
                        b2 = null;
                    }
                    final String a4 = a3.a;
                    String s5 = b2;
                    if (a4 != null) {
                        url = c(a4);
                        s5 = b2;
                    }
                    break Label_1077;
                }
                catch (final IllegalArgumentException ex2) {
                    return xf1.a();
                }
            }
            String s5 = null;
            try {
                a a5 = new a(url, l91, s5);
                final on3 on3 = new on3((Object)this, 0);
                Object d2;
                do {
                    d2 = on3.d((Object)a5);
                    final b b3 = (b)d2;
                    final URL b4 = b3.b;
                    if (b4 != null) {
                        jag.a("CctTransportBackend", "Following redirect to: %s", b4);
                        a5 = new a(b3.b, a5.b, a5.c);
                    }
                    else {
                        a5 = null;
                    }
                } while (a5 != null && --n >= 1);
                final b b5 = (b)d2;
                final int a6 = b5.a;
                if (a6 == 200) {
                    return new j91(1, b5.c);
                }
                if (a6 >= 500 || a6 == 404) {
                    return new j91(2, -1L);
                }
                if (a6 == 400) {
                    return new j91(4, -1L);
                }
                return xf1.a();
            }
            catch (final IOException ex3) {
                jag.c("CctTransportBackend", "Could not make request to the backend", ex3);
                return new j91(2, -1L);
            }
        }
    }
    
    public static final class a
    {
        public final URL a;
        public final ts1 b;
        public final String c;
        
        public a(final URL a, final ts1 b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final URL b;
        public final long c;
        
        public b(final int a, final URL b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
