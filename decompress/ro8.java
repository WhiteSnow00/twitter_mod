import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ro8 implements qo8
{
    public final tcn a;
    public final x6a<no8> b;
    
    public ro8(final tcn a) {
        this.a = a;
        this.b = new ro8$a(a);
    }
    
    public final List<String> a(String string) {
        final d2o c = d2o.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (string == null) {
            c.b3(1);
        }
        else {
            c.X1(1, string);
        }
        this.a.b();
        final Cursor b = od7.b(this.a, (ozr)c, false);
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
    
    public final boolean b(String b) {
        final boolean b2 = true;
        final d2o c = d2o.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (b == null) {
            c.b3(1);
        }
        else {
            c.X1(1, b);
        }
        this.a.b();
        final tcn a = this.a;
        boolean b3 = false;
        b = (String)od7.b(a, (ozr)c, false);
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
    
    public final void c(final no8 no8) {
        this.a.b();
        this.a.c();
        try {
            ((x6a)this.b).f((Object)no8);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final boolean d(final String s) {
        final boolean b = true;
        final d2o c = d2o.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (s == null) {
            c.b3(1);
        }
        else {
            c.X1(1, s);
        }
        this.a.b();
        final tcn a = this.a;
        boolean b2 = false;
        final Cursor b3 = od7.b(a, (ozr)c, false);
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
}
