import java.util.Iterator;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import com.twitter.analytics.ces.service.database.AnalyticsLogSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jn3 implements m00<nn3>
{
    public static final jn3.jn3$a Companion;
    public final kn3 a;
    public final n00 b;
    
    static {
        Companion = new jn3.jn3$a();
    }
    
    public jn3(final kn3 a, final n00 b) {
        czd.f((Object)a, "databaseHelper");
        czd.f((Object)b, "config");
        this.a = a;
        this.b = b;
    }
    
    public final amq<yn3$a> a() {
        final amq c = ((ulq)((two)((np1)this.a).T()).f((Class)yn3.class)).c();
        czd.e((Object)c, "databaseHelper.schema.ge\u2026::class.java).getReader()");
        return (amq<yn3$a>)c;
    }
    
    public final void b() {
        this.k().b((String)null);
    }
    
    public final void c() {
        final m4s a = hq1.a;
        this.k().b(itl.l("timestamp", (Object)(System.currentTimeMillis() - this.b.a())));
    }
    
    public final void d() {
        this.k().b(itl.e("retry_count", (Object)5));
    }
    
    public final List<nn3> e(String e) {
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).s(this.l(e));
        final osl osl = (osl)((n4j)osl$a).e();
        final ArrayList list = new ArrayList();
        e = (String)this.a().e(osl);
        try {
            if (((y0m)e).moveToFirst()) {
                do {
                    list.add(((yn3$a)((y0m)e).a()).Q2());
                } while (((y0m)e).moveToNext());
            }
            wiy.v((Closeable)e, (Throwable)null);
            return list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                wiy.v((Closeable)e, t);
            }
        }
    }
    
    public final void f(final String s, final int n) {
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).s(this.l(null));
        ((fp1$a)osl$a).r("_id");
        ((fp1$a)osl$a).q(String.valueOf(n));
        final osl osl = (osl)((n4j)osl$a).e();
        final ArrayList list = new ArrayList();
        Object o = this.a().e(osl);
        try {
            if (((y0m)o).moveToFirst()) {
                do {
                    list.add(((x9s$b)((y0m)o).a()).f0());
                } while (((y0m)o).moveToNext());
            }
            wiy.v((Closeable)o, (Throwable)null);
            o = this.k().c();
            czd.e(o, "getSourceWriter().rowWriter");
            ((zn3$a)((f60)o).a).j(s);
            ((f60)o).e(itl.g("_id", (Iterable)list));
        }
        finally {
            try {}
            finally {
                wiy.v((Closeable)o, (Throwable)s);
            }
        }
    }
    
    public final void g(String e) {
        final f60 c = this.k().c();
        czd.e((Object)c, "getSourceWriter().rowWriter");
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).s(this.l(e));
        e = (String)this.a().e((osl)((n4j)osl$a).e());
        try {
            if (((y0m)e).moveToFirst()) {
                do {
                    ((zn3$a)c.a).l(((yn3$a)((y0m)e).a()).W2() + 1);
                    c.e(itl.b("_id", (Object)((x9s$b)((y0m)e).a()).f0()));
                } while (((y0m)e).moveToNext());
            }
            wiy.v((Closeable)e, (Throwable)null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                wiy.v((Closeable)e, t);
            }
        }
    }
    
    public final void h(final String s) {
        final f60 c = this.k().c();
        czd.e((Object)c, "getSourceWriter().rowWriter");
        ((zn3$a)c.a).j((String)null);
        c.e(this.l(s));
    }
    
    public final void i(final String s) {
        this.k().b(this.l(s));
    }
    
    public final void j(final List<nn3> list) {
        czd.f((Object)list, "logs");
        final f60 c = this.k().c();
        czd.e((Object)c, "getSourceWriter().rowWriter");
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final zn3$a k = ((zn3$a)c.a).k((nn3)iterator.next());
            final m4s a = hq1.a;
            k.i(System.currentTimeMillis());
            c.b();
        }
    }
    
    public final cmq<zn3$a> k() {
        final cmq b = ((two)((np1)this.a).T()).b((Class)zn3.class);
        czd.e((Object)b, "databaseHelper.schema.ge\u2026eTableWriter::class.java)");
        return (cmq<zn3$a>)b;
    }
    
    public final String l(String b) {
        b = itl.b("request_id", (Object)b);
        czd.e((Object)b, "equals(REQUEST_ID, requestId)");
        return b;
    }
}
