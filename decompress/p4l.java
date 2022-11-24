import java.util.Objects;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4l
{
    public static final eg8 a;
    
    static {
        a = new eg8();
    }
    
    public static boolean a(final gqu$a gqu$a) {
        return gqu$a != null && gqu$a instanceof oh0$a && ((oh0$a)gqu$a).k();
    }
    
    public static boolean b(final gqu$a gqu$a) {
        return a(gqu$a) || d(gqu$a) || e(gqu$a) || c(gqu$a);
    }
    
    public static boolean c(final gqu$a gqu$a) {
        boolean b;
        if (gqu$a != null && gqu$a instanceof nuu$a) {
            final nuu$a nuu$a = (nuu$a)gqu$a;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public static boolean d(final gqu$a gqu$a) {
        boolean b;
        if (gqu$a != null && gqu$a instanceof gvu$a) {
            final gvu$a gvu$a = (gvu$a)gqu$a;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public static boolean e(final gqu$a gqu$a) {
        return gqu$a != null && gqu$a instanceof e1v$a && ((e1v$a)gqu$a).k();
    }
    
    public static String f(final String s, final boolean b, final String s2, final boolean b2, final String s3) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(b);
        sb.append(s2);
        sb.append(b2);
        sb.append(s3);
        return sb.toString();
    }
    
    public static String g(final StringBuilder sb, final boolean b, final String s, final boolean b2, final String s2) {
        sb.append(b);
        sb.append(s);
        sb.append(b2);
        sb.append(s2);
        return sb.toString();
    }
    
    public static void h(final int n, final HashMap hashMap, final String s, final int n2, final String s2, final int n3, final String s3, final int n4, final String s4) {
        hashMap.put(s, n);
        hashMap.put(s2, n2);
        hashMap.put(s3, n3);
        hashMap.put(s4, n4);
    }
    
    public static String i(final int n) {
        if (n == 1) {
            return "NONE";
        }
        if (n == 2) {
            return "UNKNOWN";
        }
        if (n == 3) {
            return "GPRS";
        }
        if (n == 4) {
            return "EDGE";
        }
        if (n == 5) {
            return "UMTS";
        }
        if (n == 6) {
            return "CDMA";
        }
        if (n == 7) {
            return "EVDO_0";
        }
        if (n == 8) {
            return "EVDO_A";
        }
        if (n == 9) {
            return "X1RTT";
        }
        if (n == 10) {
            return "HSDPA";
        }
        if (n == 11) {
            return "HSUPA";
        }
        if (n == 12) {
            return "HSPA";
        }
        if (n == 13) {
            return "IDEN";
        }
        if (n == 14) {
            return "EVDO_B";
        }
        if (n == 15) {
            return "LTE";
        }
        if (n == 16) {
            return "EHRPD";
        }
        if (n == 17) {
            return "HSPAP";
        }
        if (n == 18) {
            return "GSM";
        }
        if (n == 19) {
            return "NR";
        }
        if (n == 20) {
            return "WIFI";
        }
        throw null;
    }
    
    public static boolean j(final und und, final hst hst) {
        final boolean b = und instanceof pnc;
        boolean b2 = false;
        if (b) {
            Objects.requireNonNull(hst);
            b2 = b2;
            if (ita.b().b("topics_peek_home_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static int k(final pit pit) {
        final yit yit = (yit)lp7.m0((Class)yit.class);
        e0e.f((Object)pit, "toolbarConfig");
        return pit.a;
    }
    
    public static String l(final int n) {
        if (n == 1) {
            return "Unknown";
        }
        if (n == 2) {
            return "Active";
        }
        if (n == 3) {
            return "Expire";
        }
        if (n == 4) {
            return "Inactive";
        }
        return "null";
    }
    
    public static String m(final int n) {
        if (n == 1) {
            return "INITIAL";
        }
        if (n == 2) {
            return "INFLIGHT";
        }
        if (n == 3) {
            return "LOADED";
        }
        if (n == 4) {
            return "EMPTY";
        }
        if (n == 5) {
            return "ERROR";
        }
        return "null";
    }
    
    public static int n(final String s) {
        Objects.requireNonNull(s, "Name is null");
        if (s.equals("Unknown")) {
            return 1;
        }
        if (s.equals("Active")) {
            return 2;
        }
        if (s.equals("Expire")) {
            return 3;
        }
        if (s.equals("Inactive")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.twitter.subscriptions.ProductSubscriptionState.".concat(s));
    }
}
