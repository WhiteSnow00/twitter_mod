import com.twitter.util.user.UserIdentifier;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c0e implements dub, btl
{
    public static final c0e F0;
    public static final c0e G0;
    
    static {
        F0 = new c0e();
        G0 = new c0e();
    }
    
    public static arg a(final d0e d0e, final crg crg, final wqg wqg, final long n) {
        e0e.f((Object)crg, "$this$measure");
        final long z0 = d0e.z0(crg, wqg, n);
        d0e.A0();
        final khk w = wqg.W(xd.T(n, z0));
        return crg.J(w.F0, w.G0, (Map)m3a.F0, (stb)new c0e$a(w));
    }
    
    public static int b(final int n) {
        return n | 0x0 | 0x0 | 0x0 | 0x80;
    }
    
    public static oev c(final UserIdentifier userIdentifier) {
        if (xes.d && !cgw.a().a(userIdentifier)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Testing requests in a unit test requires an explicit call to RequestTestUtils.installMocks() for the user ");
            sb.append(userIdentifier);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
        return (oev)cgw.a().e(userIdentifier, (Class)oev.class);
    }
    
    public static boolean d(final int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n == 3) {
            return false;
        }
        if (n == 4) {
            return true;
        }
        if (n == 5) {
            return false;
        }
        throw null;
    }
    
    public static int e(final int n) {
        if (n == 1) {
            return 8;
        }
        if (n == 2) {
            return 16;
        }
        if (n == 3) {
            return 16;
        }
        if (n == 4) {
            return 32;
        }
        if (n == 5) {
            return 32;
        }
        throw null;
    }
    
    public static String f(final int n) {
        if (n == 1) {
            return "UTF-8";
        }
        if (n == 2) {
            return "UTF-16BE";
        }
        if (n == 3) {
            return "UTF-16LE";
        }
        if (n == 4) {
            return "UTF-32BE";
        }
        if (n == 5) {
            return "UTF-32LE";
        }
        throw null;
    }
    
    public static String h(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s2);
        sb.append(s3);
        return sb.toString();
    }
    
    public static void i(final String s) {
        r9a.d((Throwable)new IllegalStateException(s));
    }
    
    public static String j(final int n) {
        if (n == 1) {
            return "TRANSCODE";
        }
        if (n == 2) {
            return "REMUX";
        }
        if (n == 3) {
            return "COPY";
        }
        throw null;
    }
    
    public static u82 k(final fda fda, final v82 v82) {
        final wlf wlf = (wlf)lp7.m0((Class)wlf.class);
        e0e.f((Object)fda, "listPageEventObservable");
        u82 u82;
        if (v82 != null) {
            u82 = new u82(fda, v82);
        }
        else {
            u82 = null;
        }
        return u82;
    }
    
    public static void l() {
        final u8t u8t = (u8t)lp7.m0((Class)u8t.class);
    }
    
    public static void m() {
        final wlf wlf = (wlf)lp7.m0((Class)wlf.class);
    }
    
    public static clt n(final fda fda, final dlt dlt) {
        final wlf wlf = (wlf)lp7.m0((Class)wlf.class);
        e0e.f((Object)fda, "listPageEventObservable");
        clt clt;
        if (dlt != null) {
            clt = new clt(fda, dlt);
        }
        else {
            clt = null;
        }
        return clt;
    }
    
    public static void o() {
        final wlf wlf = (wlf)lp7.m0((Class)wlf.class);
    }
    
    public static void p(final nou nou, final UserIdentifier userIdentifier, final String s, final pfd pfd, final fvu fvu, final String s2, final String s3, final int n, final Object o) {
        ((oou)nou).a(userIdentifier, s, pfd, fvu, (String)null, (String)null);
    }
    
    public static String q(final int n) {
        if (n == 1) {
            return "FROM_NUMBER_WITH_PLUS_SIGN";
        }
        if (n == 2) {
            return "FROM_NUMBER_WITH_IDD";
        }
        if (n == 3) {
            return "FROM_NUMBER_WITHOUT_PLUS_SIGN";
        }
        if (n == 4) {
            return "FROM_DEFAULT_COUNTRY";
        }
        if (n == 5) {
            return "UNSPECIFIED";
        }
        return "null";
    }
    
    public static String r(final int n) {
        if (n == 1) {
            return "INITIAL";
        }
        if (n == 2) {
            return "CREATE";
        }
        if (n == 3) {
            return "EDIT";
        }
        return "null";
    }
    
    public static String s(final int n) {
        if (n == 1) {
            return "TRANSCODE";
        }
        if (n == 2) {
            return "REMUX";
        }
        if (n == 3) {
            return "COPY";
        }
        return "null";
    }
    
    public Object apply(final Object o) {
        final pwt pwt = (pwt)o;
        final int y = gsh.y;
        return pwt;
    }
    
    public zsl$a g(final Object o) {
        final Long n = (Long)o;
        e0e.f((Object)n, "it");
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).t(ttl.c("list_id"), new Object[] { n });
        return zsl$a;
    }
}
