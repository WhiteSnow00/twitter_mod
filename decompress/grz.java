import java.util.Arrays;
import android.net.Uri$Builder;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grz
{
    public static final Uri e;
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    
    static {
        e = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public grz(final String a, final String b, final int c, final boolean d) {
        xd.q(a);
        this.a = a;
        xd.q(b);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof grz)) {
            return false;
        }
        final grz grz = (grz)o;
        return z4j.a((Object)this.a, (Object)grz.a) && z4j.a((Object)this.b, (Object)grz.b) && z4j.a((Object)null, (Object)null) && this.c == grz.c && this.d == grz.d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, null, this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        if (a != null) {
            return a;
        }
        xd.t((Object)null);
        throw null;
    }
}
