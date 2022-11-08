import android.database.Cursor;
import java.util.Iterator;
import android.net.Uri;
import android.content.ContentValues;
import java.util.LinkedHashMap;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mso extends i1v<List<mev>>
{
    public final Context i1;
    public final long j1;
    public final n5p k1;
    
    public mso(final Context i1, final UserIdentifier userIdentifier, final long j1) {
        final n5p p3 = n5p.p0(userIdentifier);
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = p3;
    }
    
    @Override
    public final tsc<List<mev>, pav> b() {
        final long q0 = this.k1.q0(3);
        final t3s a = mq1.a;
        if (System.currentTimeMillis() <= q0 + this.j1) {
            return (tsc<List<mev>, pav>)new tsc();
        }
        return super.b();
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.E0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/saved_searches/list.json", "/");
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<List<mev>, pav> g0() {
        return (wsc<List<mev>, pav>)new f9g.c((Class<Object>)mev.class, (Class<Object>)pav.class);
    }
    
    @Override
    public final void n0(final tsc<List<mev>, pav> tsc) {
        Object x = tsc.g;
        final hn6 z = this.Z(this.i1);
        final n5p p = n5p.p0(super.P0);
        Objects.requireNonNull(p);
        final String s = "search_queries";
        final String t0 = n5p.T0;
        final StringBuilder g = w48.g("Merging search queries: ");
        g.append(((List)x).size());
        g.append(" of type: ");
        g.append(11);
        cag.a(t0, g.toString());
        final boolean empty = ((List)x).isEmpty();
        int n = 0;
        Label_0262: {
            if (empty) {
                break Label_0262;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final mev mev : x) {
                linkedHashMap.put(mev.b.hashCode() * 31 + (mev.a.hashCode() + 17), mev);
            }
            final tyr h2 = ((tk1)p).H2();
            h2.H0();
            try {
                final xyr xyr = new xyr("search_queries");
                xyr.c = k6p.a;
                xyr.d = "type=?";
                xyr.e = new String[] { String.valueOf(11) };
                x = h2.X(xyr.d());
                Label_1028: {
                    if (x == null) {
                        h2.A();
                        h2.B();
                        break Label_1028;
                    }
                    int n2 = 0;
                    try {
                        String string;
                        String string2;
                        int hashCode;
                        int hashCode2;
                        long long1;
                        mev mev2;
                        ContentValues contentValues;
                        hil j;
                        byte[] e;
                        ciw m;
                        Label_0632_Outer:Label_0604_Outer:
                        while (((Cursor)x).moveToNext()) {
                            string = ((Cursor)x).getString(1);
                            string2 = ((Cursor)x).getString(2);
                            hashCode = string.hashCode();
                            hashCode2 = string2.hashCode();
                            long1 = ((Cursor)x).getLong(0);
                            mev2 = (mev)linkedHashMap.remove(hashCode2 * 31 + (hashCode + 17));
                            while (true) {
                                if (mev2 != null) {
                                    contentValues = new ContentValues();
                                    try {
                                        contentValues.put("name", mev2.a);
                                        contentValues.put("query", mev2.b);
                                        contentValues.put("time", Long.valueOf(mev2.h));
                                        contentValues.put("latitude", mev2.c);
                                        contentValues.put("longitude", mev2.d);
                                        contentValues.put("radius", mev2.e);
                                        contentValues.put("location", mev2.f);
                                        contentValues.put("query_id", Long.valueOf(mev2.g));
                                        j = mev2.j;
                                        if (j != null) {
                                            e = tkp.e((Object)j, (alp)hil.n);
                                            da8.b(e, (String)null);
                                            contentValues.put("pc", e);
                                        }
                                        else {
                                            contentValues.putNull("pc");
                                        }
                                        m = mev2.m;
                                        if (m != null) {
                                            contentValues.put("user_search_suggestion", tkp.e((Object)m, (alp)ciw.j));
                                        }
                                        else {
                                            contentValues.putNull("user_search_suggestion");
                                        }
                                        n5p.u0(contentValues, mev2);
                                        h2.z2("search_queries", 0, contentValues, tsl.c("_id"), (Object[])new String[] { String.valueOf(long1) });
                                        ++n2;
                                        while (true) {
                                            continue Label_0632_Outer;
                                            h2.V(s, tsl.c("_id"), (Object[])new String[] { String.valueOf(long1) });
                                            continue Label_0604_Outer;
                                        }
                                    }
                                    finally {}
                                    break;
                                }
                                continue;
                            }
                        }
                        final StringBuilder sb = (StringBuilder)s;
                        ((Cursor)x).close();
                        final String t2 = n5p.T0;
                        x = new StringBuilder();
                        ((StringBuilder)x).append("Inserting new search queries: ");
                        ((StringBuilder)x).append(linkedHashMap.size());
                        cag.a(t2, ((StringBuilder)x).toString());
                        if (!linkedHashMap.isEmpty()) {
                            final ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("type", Integer.valueOf(11));
                            final Iterator iterator2 = linkedHashMap.values().iterator();
                            x = sb;
                            while (iterator2.hasNext()) {
                                final mev mev3 = (mev)iterator2.next();
                                contentValues2.put("name", mev3.a);
                                contentValues2.put("time", Long.valueOf(mev3.h));
                                contentValues2.put("query", mev3.b);
                                contentValues2.put("latitude", mev3.c);
                                contentValues2.put("longitude", mev3.d);
                                contentValues2.put("radius", mev3.e);
                                contentValues2.put("location", mev3.f);
                                contentValues2.put("query_id", Long.valueOf(mev3.g));
                                contentValues2.put("priority", Integer.valueOf(2));
                                final hil i = mev3.j;
                                if (i != null) {
                                    final byte[] e2 = tkp.e((Object)i, (alp)hil.n);
                                    da8.b(e2, (String)null);
                                    contentValues2.put("pc", e2);
                                }
                                else {
                                    contentValues2.putNull("pc");
                                }
                                final ciw k = mev3.m;
                                if (k != null) {
                                    contentValues2.put("user_search_suggestion", tkp.e((Object)k, (alp)ciw.j));
                                }
                                else {
                                    contentValues2.putNull("user_search_suggestion");
                                }
                                n5p.u0(contentValues2, mev3);
                                rqu.v(h2, (String)x, contentValues2);
                            }
                            z.a(new Uri[] { o9p$a.a });
                        }
                        h2.A();
                        h2.B();
                        n = linkedHashMap.size() + n2;
                        if (n > 0) {
                            final t3s a = mq1.a;
                            p.s0(3, System.currentTimeMillis());
                        }
                        z.b();
                        return;
                    }
                    finally {}
                }
                ((Cursor)x).close();
            }
            finally {
                h2.B();
            }
        }
    }
}
