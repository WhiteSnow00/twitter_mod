import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.net.URI;
import java.util.ArrayList;
import java.net.URISyntaxException;
import com.github.luben.zstd.util.Native;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrc extends lm1<yrc>
{
    public static final pl6 A;
    public static final pl6 B;
    public static final pl6 C;
    public static boolean D;
    public static boolean E;
    public final zqc u;
    public final y88 v;
    public boolean w;
    public boolean x;
    public wrc y;
    public iw0 z;
    
    static {
        final pl6$a pl6$a = new pl6$a();
        pl6$a.o((ol6)new dbc());
        pl6$a.o((ol6)new wl8());
        final pl6 pl6 = A = (pl6)((h4j)pl6$a).e();
        final pl6$a pl6$a2 = new pl6$a();
        final ol6[] c = pl6.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            pl6$a2.o(c[i]);
        }
        pl6$a2.a.add(0, new dp2());
        B = (pl6)((h4j)pl6$a2).e();
        final pl6$a pl6$a3 = new pl6$a();
        final ol6[] c2 = yrc.A.c;
        for (int length2 = c2.length, j = 0; j < length2; ++j) {
            pl6$a3.o(c2[j]);
        }
        pl6$a3.a.add(0, new bvx());
        C = (pl6)((h4j)pl6$a3).e();
        yrc.D = false;
        yrc.E = false;
    }
    
    public yrc(final UserIdentifier userIdentifier, final zqc u, final bsc bsc, final urc urc, final y88 v, final Set<sfa> set) {
        super(userIdentifier, bsc, u, urc, set);
        this.w = true;
        this.u = u;
        this.v = v;
    }
    
    public static yrc f(final UserIdentifier userIdentifier) {
        final yrc x7 = ffa.d(userIdentifier).X7();
        Objects.requireNonNull(x7);
        x7.y = new wrc(x7.b, new nyd(false, (String)null), x7.v, x7.u);
        return x7;
    }
    
    public static void g(final String s, final boolean b) {
        final ucc h = new ucc();
        final zf4 zf4 = new zf4();
        final Locale english = Locale.ENGLISH;
        String s2;
        if (b) {
            s2 = "success";
        }
        else {
            s2 = "failure";
        }
        zf4.q(new String[] { String.format(english, "app:lib_load:%s::%s", s, s2) });
        zf4.A();
        zf4.h = h;
        final int a = w4j.a;
        xca.a().b(UserIdentifier.LOGGED_OUT, (okm)zf4);
    }
    
    public final xrc e() {
        if (cag.i()) {
            this.a((sfa)new csc());
        }
        this.a((sfa)new fsc(this.z));
        wrc y = this.y;
        if (y == null) {
            y = new wrc(this.u, this.v);
        }
        this.a((sfa)y);
        if (super.a == null) {
            final String r = dta.b().r("compressed_api_android_6074");
            pl6 a = null;
            int c0 = 0;
            Label_0228: {
                if ("gzip".equals(r)) {
                    a = yrc.A;
                    c0 = 1;
                }
                else {
                    if ("brotli".equals(r)) {
                        synchronized (fp2.class) {
                            if (fp2.D0) {
                                c0 = (fp2.C0 ? 1 : 0);
                                monitorexit(fp2.class);
                            }
                            else {
                                fp2.D0 = true;
                                try {
                                    System.loadLibrary("brotli");
                                    System.loadLibrary("brotli-jni");
                                    c0 = 1;
                                }
                                finally {
                                    c0 = 0;
                                }
                                fp2.C0 = (c0 != 0);
                                monitorexit(fp2.class);
                            }
                            int n;
                            if (c0 != 0) {
                                final pl6 b = yrc.B;
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            c0 = n;
                            if (!yrc.E) {
                                yrc.E = true;
                                nds.a((Class)yrc.class);
                                g("br", (boolean)(n != 0));
                                c0 = n;
                            }
                            break Label_0228;
                        }
                    }
                    a = null;
                    c0 = (false ? 1 : 0);
                }
            }
            pl6 a2 = a;
            int n2 = c0;
            if (a == null) {
                boolean b2 = false;
                try {
                    if (!yrc.D) {
                        Native.load();
                    }
                    Native.isLoaded();
                }
                finally {
                    b2 = false;
                }
                pl6 pl6;
                if (b2) {
                    pl6 = yrc.C;
                }
                else {
                    pl6 = yrc.A;
                }
                n2 = c0;
                if (b2) {
                    n2 = c0;
                    if ("control".equals(r)) {
                        n2 = 1;
                    }
                }
                if (!yrc.D) {
                    yrc.D = true;
                    nds.a((Class)yrc.class);
                    g("zstd", b2);
                }
                a2 = pl6;
            }
            if (n2 != 0) {
                dta.b().d("compressed_api_android_6074");
            }
            super.a = a2;
            final int a3 = w4j.a;
        }
        pf8.r(super.g);
        pf8.r(super.h);
        final URI g = super.g;
        final zqc d = super.d;
        URI a4 = g;
        xrc xrc = null;
        Label_1010: {
            if (d != null) {
                try {
                    final UserIdentifier b3 = super.b;
                    final isc q = super.q;
                    if (q != null) {
                        q.b(b3);
                    }
                    final e5w b4 = d.b(g, b3);
                    a4 = b4.a;
                    super.p = b4.b;
                    final int a5 = w4j.a;
                }
                catch (final URISyntaxException c2) {
                    final URI g2 = super.g;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    sb.append(g2);
                    sb.append("] Failed to rewrite host");
                    cag.b("TwitterNetwork", sb.toString(), (Throwable)c2);
                    xrc = this.b(super.h, super.g, super.j);
                    xrc.b();
                    final xsc n3 = xrc.n;
                    n3.a = 0;
                    n3.b = null;
                    n3.c = c2;
                    break Label_1010;
                }
            }
            xrc = this.b(super.h, a4, super.j);
            final int k = super.k;
            if (k > 0) {
                xrc.t = k;
            }
            if (super.l) {
                xrc.E("Cache-Control", "no-store");
            }
            final src i = super.i;
            if (i != null) {
                if (!super.h.D0) {
                    final xrc$b h = super.h;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("The RequestMethod ");
                    sb2.append(h);
                    sb2.append(" does not allow a request entity.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                xrc.g = i;
            }
            if (super.q != null) {
                this.a((sfa)new km1(this));
            }
            for (final sfa sfa : super.f) {
                final hnd h2 = xrc.h;
                synchronized (h2) {
                    if (h2.a.contains(sfa)) {
                        continue;
                    }
                    h2.a.add(sfa);
                    continue;
                }
                break;
            }
            xrc.j = super.o;
            final hsc j = super.j;
            if (j != null) {
                xrc.w = j.h();
            }
            xrc.x = super.m;
            xrc.f = super.n;
            final String p = super.p;
            if (pjr.e((CharSequence)p)) {
                ((HashMap<Object, Object>)xrc.m).remove("Host");
            }
            else {
                final ArrayList<String> list = new ArrayList<String>(1);
                list.add(p);
                ((HashMap<String, ArrayList<String>>)xrc.m).put("Host", list);
            }
            final pl6 a6 = super.a;
            xrc.D = a6;
            if (a6 != null) {
                xrc.E("Accept-Encoding", a6.b);
            }
            if (super.t) {
                super.e.a(xrc.c, super.b, (urc$a)new jm1((Object)xrc));
            }
            final List<fvj<String, String>> r2 = super.r;
            if (r2 != null) {
                for (final fvj fvj : r2) {
                    final Object a7 = ((g2j)fvj).a;
                    pf8.r(a7);
                    final String s = (String)a7;
                    final Object b5 = ((g2j)fvj).b;
                    pf8.r(b5);
                    xrc.E(s, (String)b5);
                }
            }
        }
        String s2;
        if (this.x) {
            s2 = "yes";
        }
        else {
            s2 = "no";
        }
        xrc.E("X-Twitter-Active-User", s2);
        bl0.a().t();
        xrc.E("Optimize-Body", "true");
        return xrc;
    }
}
