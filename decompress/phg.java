import java.util.Objects;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phg implements fa3
{
    public final vhg a;
    public final boolean b;
    public final boolean c;
    public final Intent d;
    
    public phg(final vhg a, final boolean b, final boolean c, final Intent d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final Object o) {
        final vhg a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final Intent d = this.d;
        final kni kni = (kni)o;
        Objects.requireNonNull(a);
        if (!b && c) {
            a.d5(fgg.a);
        }
        else {
            a.e5(d);
        }
    }
}
