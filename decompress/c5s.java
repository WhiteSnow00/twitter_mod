import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5s implements b5s
{
    public final gcn a;
    public final o7a<a5s> b;
    public final c5s$b c;
    public final c5s$c d;
    
    public c5s(final gcn a) {
        this.a = a;
        this.b = new c5s$a(a);
        this.c = new hxp(a) {
            @Override
            public final String c() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.d = new hxp(a) {
            @Override
            public final String c() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
    
    public final void a(final wqx wqx) {
        this.g(wqx.a, wqx.b);
    }
    
    public final List<String> b() {
        final q1o c = q1o.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
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
    
    public final a5s c(final wqx wqx) {
        zzd.f((Object)wqx, "id");
        return this.f(wqx.a, wqx.b);
    }
    
    public final void d(final a5s a5s) {
        this.a.b();
        this.a.c();
        try {
            ((o7a)this.b).f((Object)a5s);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final void e(final String s) {
        this.a.b();
        final yyr a = this.d.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.d.d(a);
        }
    }
    
    public final a5s f(String string, int b) {
        final q1o c = q1o.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        c.u2(2, (long)b);
        this.a.b();
        final gcn a = this.a;
        a5s a5s = null;
        final String s = null;
        final Cursor b2 = he7.b(a, (wyr)c, false);
        try {
            final int b3 = ea7.b(b2, "work_spec_id");
            b = ea7.b(b2, "generation");
            final int b4 = ea7.b(b2, "system_id");
            if (b2.moveToFirst()) {
                if (b2.isNull(b3)) {
                    string = s;
                }
                else {
                    string = b2.getString(b3);
                }
                a5s = new a5s(string, b2.getInt(b), b2.getInt(b4));
            }
            return a5s;
        }
        finally {
            b2.close();
            c.release();
        }
    }
    
    public final void g(final String s, final int n) {
        this.a.b();
        final yyr a = this.c.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        ((vyr)a).u2(2, (long)n);
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
}
