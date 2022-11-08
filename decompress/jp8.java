import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jp8 implements ip8
{
    public final gcn a;
    public final o7a<fp8> b;
    
    public jp8(final gcn a) {
        this.a = a;
        this.b = new o7a<fp8>(a) {
            public final String c() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
            
            public final void e(final yyr yyr, final Object o) {
                final fp8 fp8 = (fp8)o;
                final String a = fp8.a;
                if (a == null) {
                    ((vyr)yyr).c3(1);
                }
                else {
                    ((vyr)yyr).Y1(1, a);
                }
                final String b = fp8.b;
                if (b == null) {
                    ((vyr)yyr).c3(2);
                }
                else {
                    ((vyr)yyr).Y1(2, b);
                }
            }
        };
    }
    
    public final List<String> a(String string) {
        final q1o c = q1o.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (string == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, string);
        }
        this.a.b();
        final Cursor b = he7.b(this.a, (wyr)c, false);
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
    
    public final boolean b(final String s) {
        final boolean b = true;
        final q1o c = q1o.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (s == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, s);
        }
        this.a.b();
        final gcn a = this.a;
        boolean b2 = false;
        final Cursor b3 = he7.b(a, (wyr)c, false);
        try {
            if (b3.moveToFirst()) {
                b2 = (b3.getInt(0) != 0 && b);
            }
            return b2;
        }
        finally {
            b3.close();
            c.release();
        }
    }
    
    public final void c(final fp8 fp8) {
        this.a.b();
        this.a.c();
        try {
            this.b.f((Object)fp8);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final boolean d(String b) {
        final boolean b2 = true;
        final q1o c = q1o.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (b == null) {
            c.c3(1);
        }
        else {
            c.Y1(1, b);
        }
        this.a.b();
        final gcn a = this.a;
        boolean b3 = false;
        b = (String)he7.b(a, (wyr)c, false);
        try {
            if (((Cursor)b).moveToFirst()) {
                b3 = (((Cursor)b).getInt(0) != 0 && b2);
            }
            return b3;
        }
        finally {
            ((Cursor)b).close();
            c.release();
        }
    }
}
