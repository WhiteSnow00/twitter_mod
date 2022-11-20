import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5s implements u5s
{
    public final tcn a;
    public final x6a<t5s> b;
    public final v5s$b c;
    public final v5s$c d;
    
    public v5s(final tcn a) {
        this.a = a;
        this.b = new x6a<t5s>(a) {
            public final String c() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
            
            public final void e(final qzr qzr, final Object o) {
                final t5s t5s = (t5s)o;
                final String a = t5s.a;
                if (a == null) {
                    ((nzr)qzr).b3(1);
                }
                else {
                    ((nzr)qzr).X1(1, a);
                }
                ((nzr)qzr).t2(2, t5s.b);
                ((nzr)qzr).t2(3, t5s.c);
            }
        };
        this.c = new yxp(a) {
            public final String c() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.d = new yxp(a) {
            public final String c() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
    
    public final void a(final prx prx) {
        this.g(prx.a, prx.b);
    }
    
    public final List<String> b() {
        final d2o c = d2o.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        final Cursor b = od7.b(this.a, (ozr)c, false);
        try {
            final ArrayList list = new ArrayList<String>(b.getCount());
            while (b.moveToNext()) {
                String string;
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
    
    public final t5s c(final prx prx) {
        czd.f((Object)prx, "id");
        return this.f(prx.a, prx.b);
    }
    
    public final void d(final t5s t5s) {
        this.a.b();
        this.a.c();
        try {
            this.b.f((Object)t5s);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final void e(final String s) {
        this.a.b();
        final qzr a = this.d.a();
        if (s == null) {
            ((nzr)a).b3(1);
        }
        else {
            ((nzr)a).X1(1, s);
        }
        this.a.c();
        try {
            a.i0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.d.d(a);
        }
    }
    
    public final t5s f(String string, int b) {
        final d2o c = d2o.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (string == null) {
            c.b3(1);
        }
        else {
            c.X1(1, string);
        }
        c.t2(2, (long)b);
        this.a.b();
        final tcn a = this.a;
        t5s t5s = null;
        final String s = null;
        final Cursor b2 = od7.b(a, (ozr)c, false);
        try {
            b = i97.b(b2, "work_spec_id");
            final int b3 = i97.b(b2, "generation");
            final int b4 = i97.b(b2, "system_id");
            if (b2.moveToFirst()) {
                if (b2.isNull(b)) {
                    string = s;
                }
                else {
                    string = b2.getString(b);
                }
                t5s = new t5s(string, b2.getInt(b3), b2.getInt(b4));
            }
            return t5s;
        }
        finally {
            b2.close();
            c.release();
        }
    }
    
    public final void g(final String s, final int n) {
        this.a.b();
        final qzr a = this.c.a();
        if (s == null) {
            ((nzr)a).b3(1);
        }
        else {
            ((nzr)a).X1(1, s);
        }
        ((nzr)a).t2(2, n);
        this.a.c();
        try {
            a.i0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.c.d(a);
        }
    }
}
