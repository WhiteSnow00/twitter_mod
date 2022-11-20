import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hta implements oj
{
    public final List D0;
    public final String E0;
    public final Object F0;
    public final UserIdentifier G0;
    
    public hta(final List d0, final String e0, final Object f0, final UserIdentifier g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void run() {
        final List d0 = this.D0;
        final String e0 = this.E0;
        final Object f0 = this.F0;
        final UserIdentifier g0 = this.G0;
        for (final ysa ysa : d0) {
            if (!e0.equalsIgnoreCase(ysa.a) || (f0 != null && ysa.c.equalsIgnoreCase(f0.toString()))) {
                final String a = ysa.a;
                final int b = ysa.b;
                final String c = ysa.c;
                if (c.equals("unassigned")) {
                    continue;
                }
                fca.a().b(g0, (elm)new iha(a, b, c));
            }
        }
    }
}
