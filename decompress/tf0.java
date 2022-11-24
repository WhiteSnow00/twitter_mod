import java.util.Arrays;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tf0<O extends a.d>
{
    public final int a;
    public final a<O> b;
    public final O c;
    public final String d;
    
    public tf0(final a<O> b, final O c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = Arrays.hashCode(new Object[] { b, c, d });
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof tf0)) {
            return false;
        }
        final tf0 tf0 = (tf0)o;
        return r5j.a(this.b, tf0.b) && r5j.a(this.c, tf0.c) && r5j.a(this.d, tf0.d);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
