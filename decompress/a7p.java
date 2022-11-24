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
public final class a7p extends sp1<SearchSchema>
{
    public static final String W0;
    
    static {
        W0 = a7p.class.getSimpleName();
    }
    
    public a7p(final Context context, final UserIdentifier userIdentifier, final rfv$b rfv$b, final ccb ccb, final gcu gcu, final xk0 xk0) {
        final StringBuilder sb = new StringBuilder();
        sb.append(userIdentifier.getId());
        sb.append("-");
        sb.append("search");
        super(context, (Class)SearchSchema.class, sb.toString(), 1, rfv$b, userIdentifier, ccb, gcu, xk0);
    }
    
    public static double m0(final double n, final long n2) {
        final g5s a = nq1.a;
        return Math.exp(Math.log(0.5) * ((System.currentTimeMillis() - n2) / 1000L) / 172800.0) * n;
    }
    
    public static a7p p0(final UserIdentifier userIdentifier) {
        final int a = cbp.a;
        Objects.requireNonNull(dbp.Companion);
        e0e.f((Object)userIdentifier, "userIdentifier");
        return ((dbp)dgw.Companion.a().e(userIdentifier, (Class)dbp.class)).y1();
    }
    
    public static void u0(final ContentValues contentValues, final vfv vfv) {
        final krt n = vfv.n;
        if (n != null) {
            contentValues.put("topic_search_suggestion", gmp.e((Object)n, (nmp)krt.c));
        }
        else {
            contentValues.putNull("topic_search_suggestion");
        }
    }
    
    public final void A0(final vfv vfv, final long n) {
        final String w0 = a7p.W0;
        final StringBuilder f = ehk.f("updateSearchQuery: ");
        f.append(vfv.a);
        f.append(", rowId: ");
        f.append(n);
        nag.a(w0, f.toString());
        final h0s h2 = ((sk1)this).H2();
        h2.H0();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("query", vfv.b);
            contentValues.put("name", vfv.a);
            final g5s a = nq1.a;
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("latitude", vfv.c);
            contentValues.put("longitude", vfv.d);
            contentValues.put("radius", vfv.e);
            contentValues.put("location", vfv.f);
            final kjw m = vfv.m;
            if (m != null) {
                contentValues.put("user_search_suggestion", gmp.e((Object)m, (nmp)kjw.j));
            }
            else {
                contentValues.putNull("user_search_suggestion");
            }
            u0(contentValues, vfv);
            h2.z2("search_queries", 0, contentValues, ttl.c("_id"), (Object[])new String[] { String.valueOf(n) });
            h2.A();
        }
        finally {
            h2.B();
        }
    }
    
    public final boolean N() {
        return true;
    }
    
    public final void i0(final h0s h0s, final zxo zxo, final int n, final int n2) {
        ((vk1)new b7p(zxo, h0s)).e(n, n2, (zhj)((gra)ea8.a()).a((Object)"search"));
    }
    
    public final long q0(final int n) {
        final xmq c = ((rmq)((oxo)this.T()).f((Class)aap.class)).c();
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).t("type=?", new Object[] { n });
        final j1m e = c.e((zsl)((z4j)zsl$a).e());
        try {
            long k0;
            if (e.moveToFirst()) {
                k0 = ((aap.a)e.a()).K0();
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
    
    public final long r0(final vfv vfv, final int n) {
        final String w0 = a7p.W0;
        final StringBuilder f = ehk.f("insertSearchQuery: ");
        f.append(vfv.a);
        f.append(", of type: ");
        f.append(n);
        nag.a(w0, f.toString());
        final h0s h2 = ((sk1)this).H2();
        h2.H0();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(n));
            contentValues.put("query", vfv.b);
            contentValues.put("name", vfv.a);
            final g5s a = nq1.a;
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("latitude", vfv.c);
            contentValues.put("longitude", vfv.d);
            contentValues.put("radius", vfv.e);
            contentValues.put("location", vfv.f);
            contentValues.put("query_id", Long.valueOf(vfv.g));
            int n2 = 0;
            Label_0213: {
                if (n != 0) {
                    n2 = 2;
                    if (n != 2) {
                        if (n == 11) {
                            break Label_0213;
                        }
                        if (n != 12) {
                            n2 = 4;
                            break Label_0213;
                        }
                    }
                }
                n2 = 3;
            }
            contentValues.put("priority", Integer.valueOf(n2));
            final kjw m = vfv.m;
            if (m != null) {
                contentValues.put("user_search_suggestion", gmp.e((Object)m, (nmp)kjw.j));
            }
            else {
                contentValues.putNull("user_search_suggestion");
            }
            u0(contentValues, vfv);
            final long v = vmw.v(h2, "search_queries", contentValues);
            h2.A();
            return v;
        }
        finally {
            h2.B();
        }
    }
    
    public final long s0(final int type, final long n) {
        final e60 c = ((oxo)this.T()).b((Class)bap.class).c();
        ((bap$a)c.a).setType(type).a(n);
        return c.d();
    }
    
    public final void w0(int n, final int n2) {
        final String w0 = a7p.W0;
        final StringBuilder sb = new StringBuilder();
        sb.append("removeOldSearchQueries of type: ");
        sb.append(n);
        nag.a(w0, sb.toString());
        final h0s h2 = ((sk1)this).H2();
        h2.H0();
        try {
            final l0s l0s = new l0s("search_queries");
            l0s.c = nmo.a;
            l0s.d = "type=?";
            l0s.e = new String[] { String.valueOf(n) };
            l0s.h = "time ASC";
            final Cursor x = h2.X(l0s.d());
            if (x == null) {
                h2.A();
                return;
            }
            try {
                n = x.getCount() - n2;
                if (n <= 0) {
                    h2.A();
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing old search queries: ");
                sb2.append(n);
                nag.a(w0, sb2.toString());
                while (x.moveToNext() && n >= 0) {
                    h2.V("search_queries", ttl.c("_id"), (Object[])new String[] { String.valueOf((long)x.getInt(0)) });
                    --n;
                }
                h2.A();
            }
            finally {
                x.close();
            }
        }
        finally {
            h2.B();
        }
    }
    
    public final long x0(vfv h2, final int n, final tn6 tn6) {
        long r0 = 0L;
        Label_0278: {
            if (h2 != null) {
                final String w0 = a7p.W0;
                final StringBuilder f = ehk.f("findSearchQuery: ");
                f.append(h2.a);
                f.append(", of type: ");
                f.append(n);
                nag.a(w0, f.toString());
                String[] e;
                String d;
                if (h2.c != null && h2.d != null) {
                    e = new String[] { h2.b, h2.a, String.valueOf(n), h2.c.toString(), h2.d.toString() };
                    d = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude=? AND longitude=?";
                }
                else {
                    e = new String[] { h2.b, h2.a, String.valueOf(n) };
                    d = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude IS NULL AND longitude IS NULL";
                }
                final String[] a = nmo.a;
                final h0s q = ((sk1)this).q();
                final l0s l0s = new l0s("search_queries");
                l0s.c = a;
                l0s.d = d;
                l0s.e = e;
                final Cursor x = q.X(l0s.d());
                if (x != null) {
                    try {
                        if (x.moveToFirst()) {
                            r0 = x.getInt(0);
                        }
                        else {
                            r0 = 0L;
                        }
                        break Label_0278;
                    }
                    finally {
                        x.close();
                    }
                }
            }
            r0 = 0L;
        }
        Object o = ((sk1)this).H2();
        ((h0s)o).H0();
        Label_0322: {
            if (r0 <= 0L) {
                break Label_0322;
            }
            Label_0319: {
                if (n == 1 || n == 11) {
                    break Label_0319;
                }
                try {
                    this.A0(h2, r0);
                    while (true) {
                        ((h0s)o).A();
                        ((h0s)o).B();
                        h2 = (vfv)((sk1)this).H2();
                        ((h0s)h2).H0();
                        final l0s l0s2 = new l0s("search_queries");
                        l0s2.c = w7p.a;
                        l0s2.d = "type=? OR type=?";
                        l0s2.e = new String[] { String.valueOf(2), String.valueOf(12) };
                        o = ((h0s)h2).X(l0s2.d());
                        try {
                            while (((Cursor)o).moveToNext()) {
                                final long long1 = ((Cursor)o).getLong(((Cursor)o).getColumnIndex("_id"));
                                final long long2 = ((Cursor)o).getLong(((Cursor)o).getColumnIndex("time"));
                                final double double1 = ((Cursor)o).getDouble(((Cursor)o).getColumnIndex("score"));
                                final ContentValues contentValues = new ContentValues();
                                double m0;
                                if (long1 == r0) {
                                    m0 = m0(double1, long2) + 1.0;
                                }
                                else {
                                    m0 = m0(double1, long2);
                                }
                                contentValues.put("score", Double.valueOf(m0));
                                ((h0s)h2).z2("search_queries", 0, contentValues, ttl.c("_id"), (Object[])new String[] { String.valueOf(long1) });
                            }
                            ((h0s)h2).A();
                            ((h0s)h2).B();
                            ((Cursor)o).close();
                            return r0;
                        }
                        finally {
                            ((h0s)h2).B();
                        }
                        continue;
                        final long n2 = r0 = this.r0(h2, n);
                        iftrue(Label_0356:)(tn6 == null);
                        tn6.a(new Uri[] { zap$a.a });
                        r0 = n2;
                        continue;
                    }
                }
                finally {
                    ((h0s)o).B();
                }
            }
        }
    }
}
