import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yuk implements xuk
{
    public final gcn a;
    public final o7a<vuk> b;
    
    public yuk(final gcn a) {
        this.a = a;
        this.b = new o7a<vuk>(a) {
            public final String c() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
            
            public final void e(final yyr yyr, final Object o) {
                final vuk vuk = (vuk)o;
                final String a = vuk.a;
                if (a == null) {
                    ((vyr)yyr).c3(1);
                }
                else {
                    ((vyr)yyr).Y1(1, a);
                }
                final Long b = vuk.b;
                if (b == null) {
                    ((vyr)yyr).c3(2);
                }
                else {
                    ((vyr)yyr).u2(2, (long)b);
                }
            }
        };
    }
    
    @Override
    public final Long a(final String s) {
        final q1o c = q1o.c("SELECT long_value FROM Preference where `key`=?", 1);
        c.Y1(1, s);
        this.a.b();
        final gcn a = this.a;
        final Long n = null;
        final Cursor b = he7.b(a, (wyr)c, false);
        Long value = n;
        try {
            if (b.moveToFirst()) {
                if (b.isNull(0)) {
                    value = n;
                }
                else {
                    value = b.getLong(0);
                }
            }
            return value;
        }
        finally {
            b.close();
            c.release();
        }
    }
    
    @Override
    public final void b(final vuk vuk) {
        this.a.b();
        this.a.c();
        try {
            this.b.f((Object)vuk);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
}
