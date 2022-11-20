import android.net.Uri;
import android.database.Cursor;
import android.content.ContentValues;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.annotation.SuppressLint;
import com.twitter.search.database.schema.SearchSchema;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "MissingPermission, Range" })
public final class g6p extends np1<SearchSchema>
{
    public static final String U0;
    
    static {
        U0 = g6p.class.getSimpleName();
    }
    
    public g6p(final Context context, final UserIdentifier userIdentifier, final dfv$b dfv$b, final bbb bbb, final qbu qbu, final xk0 xk0) {
        final StringBuilder sb = new StringBuilder();
        sb.append(userIdentifier.getId());
        sb.append("-");
        sb.append("search");
        super(context, (Class)SearchSchema.class, sb.toString(), 1, dfv$b, userIdentifier, bbb, qbu, xk0);
    }
    
    public static double l0(final double n, final long n2) {
        final m4s a = hq1.a;
        return Math.exp(Math.log(0.5) * ((System.currentTimeMillis() - n2) / 1000L) / 172800.0) * n;
    }
    
    public static g6p o0(final UserIdentifier userIdentifier) {
        final int a = jap.a;
        Objects.requireNonNull(kap.Companion);
        czd.f((Object)userIdentifier, "userIdentifier");
        return ((kap)nfw.Companion.a().e(userIdentifier, (Class)kap.class)).y1();
    }
    
    public static void t0(final ContentValues contentValues, final hfv hfv) {
        final tqt n = hfv.n;
        if (n != null) {
            contentValues.put("topic_search_suggestion", klp.e((Object)n, (rlp)tqt.c));
        }
        else {
            contentValues.putNull("topic_search_suggestion");
        }
    }
    
    public final boolean N() {
        return true;
    }
    
    public final void h0(final lzr lzr, final exo exo, final int n, final int n2) {
        ((rk1)new h6p(exo, lzr)).e(n, n2, (lhj)((ypa)a98.a()).a((Object)"search"));
    }
    
    public final long p0(final int n) {
        final amq c = ((ulq)((two)this.T()).f((Class)i9p.class)).c();
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).t("type=?", new Object[] { n });
        final y0m e = c.e((osl)((n4j)osl$a).e());
        try {
            long k0;
            if (e.moveToFirst()) {
                k0 = ((i9p.a)e.a()).K0();
            }
            else {
                k0 = -1L;
            }
            e.close();
            return k0;
        }
        finally {
            if (e != null) {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
    
    public final long q0(final hfv hfv, final int n) {
        final String u0 = g6p.U0;
        final StringBuilder j = fu8.j("insertSearchQuery: ");
        j.append(hfv.a);
        j.append(", of type: ");
        j.append(n);
        s9g.a(u0, j.toString());
        final lzr g2 = ((ok1)this).G2();
        g2.G0();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(n));
            contentValues.put("query", hfv.b);
            contentValues.put("name", hfv.a);
            final m4s a = hq1.a;
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("latitude", hfv.c);
            contentValues.put("longitude", hfv.d);
            contentValues.put("radius", hfv.e);
            contentValues.put("location", hfv.f);
            contentValues.put("query_id", Long.valueOf(hfv.g));
            int n2 = 0;
            Label_0220: {
                if (n != 0) {
                    n2 = 2;
                    if (n != 2) {
                        if (n == 11) {
                            break Label_0220;
                        }
                        if (n != 12) {
                            n2 = 4;
                            break Label_0220;
                        }
                    }
                }
                n2 = 3;
            }
            contentValues.put("priority", Integer.valueOf(n2));
            final viw m = hfv.m;
            if (m != null) {
                contentValues.put("user_search_suggestion", klp.e((Object)m, (rlp)viw.j));
            }
            else {
                contentValues.putNull("user_search_suggestion");
            }
            t0(contentValues, hfv);
            final long y = gmw.y(g2, "search_queries", contentValues);
            g2.z();
            return y;
        }
        finally {
            g2.A();
        }
    }
    
    public final long r0(final int type, final long n) {
        final f60 c = ((two)this.T()).b((Class)j9p.class).c();
        ((j9p$a)c.a).setType(type).a(n);
        return c.d();
    }
    
    public final void v0(int n, final int n2) {
        final String u0 = g6p.U0;
        final StringBuilder sb = new StringBuilder();
        sb.append("removeOldSearchQueries of type: ");
        sb.append(n);
        s9g.a(u0, sb.toString());
        final lzr g2 = ((ok1)this).G2();
        g2.G0();
        try {
            final pzr pzr = new pzr("search_queries");
            pzr.c = tlo.a;
            pzr.d = "type=?";
            pzr.e = new String[] { String.valueOf(n) };
            pzr.h = "time ASC";
            final Cursor w = g2.W(pzr.d());
            if (w == null) {
                g2.z();
                return;
            }
            try {
                n = w.getCount() - n2;
                if (n <= 0) {
                    g2.z();
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing old search queries: ");
                sb2.append(n);
                s9g.a(u0, sb2.toString());
                while (w.moveToNext() && n >= 0) {
                    g2.U("search_queries", itl.c("_id"), (Object[])new String[] { String.valueOf((long)w.getInt(0)) });
                    --n;
                }
                g2.z();
            }
            finally {
                w.close();
            }
        }
        finally {
            g2.A();
        }
    }
    
    public final long w0(hfv g2, final int n, final nm6 nm6) {
        long q0 = 0L;
        Label_0279: {
            if (g2 != null) {
                final String u0 = g6p.U0;
                final StringBuilder j = fu8.j("findSearchQuery: ");
                j.append(g2.a);
                j.append(", of type: ");
                j.append(n);
                s9g.a(u0, j.toString());
                String[] e;
                String d;
                if (g2.c != null && g2.d != null) {
                    e = new String[] { g2.b, g2.a, String.valueOf(n), g2.c.toString(), g2.d.toString() };
                    d = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude=? AND longitude=?";
                }
                else {
                    e = new String[] { g2.b, g2.a, String.valueOf(n) };
                    d = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude IS NULL AND longitude IS NULL";
                }
                final String[] a = tlo.a;
                final lzr p3 = ((ok1)this).p();
                final pzr pzr = new pzr("search_queries");
                pzr.c = a;
                pzr.d = d;
                pzr.e = e;
                final Cursor w = p3.W(pzr.d());
                if (w != null) {
                    try {
                        if (w.moveToFirst()) {
                            q0 = w.getInt(0);
                        }
                        else {
                            q0 = 0L;
                        }
                        break Label_0279;
                    }
                    finally {
                        w.close();
                    }
                }
            }
            q0 = 0L;
        }
        Object g3 = ((ok1)this).G2();
        ((lzr)g3).G0();
        Label_0323: {
            if (q0 <= 0L) {
                break Label_0323;
            }
            Label_0320: {
                if (n == 1 || n == 11) {
                    break Label_0320;
                }
                try {
                    this.z0(g2, q0);
                    while (true) {
                        ((lzr)g3).z();
                        ((lzr)g3).A();
                        g2 = (hfv)((ok1)this).G2();
                        ((lzr)g2).G0();
                        final pzr pzr2 = new pzr("search_queries");
                        pzr2.c = c7p.a;
                        pzr2.d = "type=? OR type=?";
                        pzr2.e = new String[] { String.valueOf(2), String.valueOf(12) };
                        final Cursor w2 = ((lzr)g2).W(pzr2.d());
                        try {
                            while (w2.moveToNext()) {
                                final long long1 = w2.getLong(w2.getColumnIndex("_id"));
                                final long long2 = w2.getLong(w2.getColumnIndex("time"));
                                final double double1 = w2.getDouble(w2.getColumnIndex("score"));
                                g3 = new ContentValues();
                                double l0;
                                if (long1 == q0) {
                                    l0 = l0(double1, long2) + 1.0;
                                }
                                else {
                                    l0 = l0(double1, long2);
                                }
                                ((ContentValues)g3).put("score", Double.valueOf(l0));
                                ((lzr)g2).y2("search_queries", 0, (ContentValues)g3, itl.c("_id"), (Object[])new String[] { String.valueOf(long1) });
                            }
                            ((lzr)g2).z();
                            ((lzr)g2).A();
                            w2.close();
                            return q0;
                        }
                        finally {
                            ((lzr)g2).A();
                        }
                        continue;
                        final long n2 = q0 = this.q0(g2, n);
                        iftrue(Label_0357:)(nm6 == null);
                        nm6.a(new Uri[] { gap$a.a });
                        q0 = n2;
                        continue;
                    }
                }
                finally {
                    ((lzr)g3).A();
                }
            }
        }
    }
    
    public final void z0(final hfv hfv, final long n) {
        final String u0 = g6p.U0;
        final StringBuilder j = fu8.j("updateSearchQuery: ");
        j.append(hfv.a);
        j.append(", rowId: ");
        j.append(n);
        s9g.a(u0, j.toString());
        final lzr g2 = ((ok1)this).G2();
        g2.G0();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("query", hfv.b);
            contentValues.put("name", hfv.a);
            final m4s a = hq1.a;
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("latitude", hfv.c);
            contentValues.put("longitude", hfv.d);
            contentValues.put("radius", hfv.e);
            contentValues.put("location", hfv.f);
            final viw m = hfv.m;
            if (m != null) {
                contentValues.put("user_search_suggestion", klp.e((Object)m, (rlp)viw.j));
            }
            else {
                contentValues.putNull("user_search_suggestion");
            }
            t0(contentValues, hfv);
            g2.y2("search_queries", 0, contentValues, itl.c("_id"), (Object[])new String[] { String.valueOf(n) });
            g2.z();
        }
        finally {
            g2.A();
        }
    }
}
