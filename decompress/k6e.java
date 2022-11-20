import android.content.res.Resources;
import com.twitter.android.av.dock.di.dock.VideoDockObjectGraph;
import android.content.Context;
import java.util.HashMap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k6e
{
    public static okh a(okh okh, final okh okh2) {
        czd.f((Object)okh2, "other");
        if (okh2 != okh.Companion) {
            okh = (okh)new tr4(okh, okh2);
        }
        return okh;
    }
    
    public static hag b() {
        return ((lag)((b5j)br0.a()).B((Class)lag.class)).d0();
    }
    
    public static String c(final int n) {
        if (n == 1) {
            return "composition";
        }
        if (n == 2) {
            return "reply_bar";
        }
        throw null;
    }
    
    public static int d(final int n) {
        if (n == 1) {
            return 2131167628;
        }
        if (n == 2) {
            return 2131167631;
        }
        throw null;
    }
    
    public static float e(final float n, final float n2, final float n3, final float n4) {
        return (n - n2) * n3 + n4;
    }
    
    public static String f(final String s, final Uri uri) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(uri);
        return sb.toString();
    }
    
    public static void g(final char c, final HashMap hashMap, final String s, final char c2, final String s2, final char c3, final String s3, final char c4, final String s4) {
        hashMap.put(c, s);
        hashMap.put(c2, s2);
        hashMap.put(c3, s3);
        hashMap.put(c4, s4);
    }
    
    public static i82 h(final xba xba, final j82 j82) {
        final zkf zkf = (zkf)chw.w0((Class)zkf.class);
        czd.f((Object)xba, "listPageEventObservable");
        i82 i82;
        if (j82 != null) {
            i82 = new i82(xba, j82);
        }
        else {
            i82 = null;
        }
        return i82;
    }
    
    public static void i() {
        final zkf zkf = (zkf)chw.w0((Class)zkf.class);
    }
    
    public static boolean j() {
        final hbl hbl = (hbl)chw.w0((Class)hbl.class);
        return zcw.d().getUser().j();
    }
    
    public static lkt k(final xba xba, final mkt mkt) {
        final zkf zkf = (zkf)chw.w0((Class)zkf.class);
        czd.f((Object)xba, "listPageEventObservable");
        lkt lkt;
        if (mkt != null) {
            lkt = new lkt(xba, mkt);
        }
        else {
            lkt = null;
        }
        return lkt;
    }
    
    public static void l() {
        final zkf zkf = (zkf)chw.w0((Class)zkf.class);
    }
    
    public static int m(final Context context) {
        final VideoDockObjectGraph.a a = (VideoDockObjectGraph.a)chw.w0((Class)VideoDockObjectGraph.a.class);
        czd.f((Object)context, "context");
        final Resources resources = context.getResources();
        return resources.getDimensionPixelSize(2131166324) + resources.getDimensionPixelSize(2131167432);
    }
    
    public static String n(final int n) {
        if (n == 1) {
            return "INVALID_COUNTRY_CODE";
        }
        if (n == 2) {
            return "NOT_A_NUMBER";
        }
        if (n == 3) {
            return "TOO_SHORT_AFTER_IDD";
        }
        if (n == 4) {
            return "TOO_SHORT_NSN";
        }
        if (n == 5) {
            return "TOO_LONG";
        }
        return "null";
    }
    
    public static String o(final int n) {
        if (n == 1) {
            return "DISMISS_ACTIVITY";
        }
        if (n == 2) {
            return "START_COMPOSER";
        }
        return "null";
    }
}
