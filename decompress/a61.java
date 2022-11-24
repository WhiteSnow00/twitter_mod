import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a61
{
    public static final nmp<a61> f;
    public final long a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        a61.f = new a61.a61$a();
    }
    
    public a61(final long a, final boolean b, final String c, final String d, final String e) {
        UserIdentifier.fromId(this.a = a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static a61 a(final qgv qgv) {
        return new a61(qgv.F0, qgv.P0 || (qgv.h() != null && qgv.h()), qgv.c(), qgv.M0, qgv.G0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a61.class == o.getClass()) {
            if (this.a != ((a61)o).a) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.d(this.a);
    }
}
