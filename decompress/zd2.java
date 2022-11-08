import java.util.Iterator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zd2 implements yd2
{
    public final od6 a;
    public final nd6 b;
    public sv1 c;
    
    public zd2(final od6 a, final nd6 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.c = null;
    }
    
    public final void b(final sv1 c) {
        zzd.f((Object)c, "event");
        final od6 a = this.a;
        Objects.requireNonNull(a);
        final Iterator iterator = a.a.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (((wd2)iterator.next()).a(c)) {
                    final boolean b = true;
                    if (b) {
                        this.c = c;
                    }
                    return;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public final sv1 c(sv1 c) {
        if (c != null) {
            final nd6 b = this.b;
            Objects.requireNonNull(b);
            final Iterator iterator = b.a.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    if (((ud2)iterator.next()).a(c)) {
                        final boolean b2 = true;
                        if (b2) {
                            c = this.c;
                            return c;
                        }
                        return null;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
        c = null;
        return c;
    }
}
