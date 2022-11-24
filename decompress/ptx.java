import java.util.Iterator;
import java.util.Set;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ptx implements otx
{
    public final ldn a;
    public final c8a<ntx> b;
    public final ptx$b c;
    
    public ptx(final ldn a) {
        this.a = a;
        this.b = new c8a<ntx>(a) {
            @Override
            public final String c() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
            
            @Override
            public final void e(final m0s m0s, final Object o) {
                final ntx ntx = (ntx)o;
                final String a = ntx.a;
                if (a == null) {
                    ((j0s)m0s).c3(1);
                }
                else {
                    ((j0s)m0s).Y1(1, a);
                }
                final String b = ntx.b;
                if (b == null) {
                    ((j0s)m0s).c3(2);
                }
                else {
                    ((j0s)m0s).Y1(2, b);
                }
            }
        };
        this.c = new vyp(a) {
            @Override
            public final String c() {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
        };
    }
    
    public final List<String> a(String string) {
        final w2o c = w2o.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        this.a.b();
        final Cursor b = re7.b(this.a, (k0s)c, false);
        try {
            final ArrayList list = new ArrayList<String>(b.getCount());
            while (b.moveToNext()) {
                if (b.isNull(0)) {
                    string = null;
                }
                else {
                    string = b.getString(0);
                }
                list.add(string);
            }
            return (List<String>)list;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    public final void b(final String s) {
        this.a.b();
        final m0s a = this.c.a();
        ((j0s)a).Y1(1, s);
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.c.d(a);
        }
    }
    
    public final void c(final String s, final Set<String> set) {
        e0e.f((Object)set, "tags");
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.d(new ntx((String)iterator.next(), s));
        }
    }
    
    public final void d(final ntx ntx) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(ntx);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
}
