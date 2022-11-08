import java.util.Set;
import java.util.Collections;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0u implements u0u
{
    public static volatile v48 e;
    public final mi4 a;
    public final mi4 b;
    public final pvo c;
    public final s4w d;
    
    public w0u(final mi4 a, final mi4 b, final pvo c, final s4w d, final zqx zqx) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        zqx.a.execute((Runnable)new o20((Object)zqx, 4));
    }
    
    public static w0u a() {
        final v48 e = w0u.e;
        if (e != null) {
            return (w0u)e.O0.get();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static void b(final Context context) {
        if (w0u.e == null) {
            synchronized (w0u.class) {
                if (w0u.e == null) {
                    Objects.requireNonNull(context);
                    w0u.e = new v48(context);
                }
            }
        }
    }
    
    public final r0u c(final y3a y3a) {
        Object o;
        if (y3a instanceof y3a) {
            Objects.requireNonNull((y63)y3a);
            o = Collections.unmodifiableSet((Set<?>)y63.d);
        }
        else {
            o = Collections.singleton(new j4a("proto"));
        }
        final q0u$a a = q0u.a();
        Objects.requireNonNull(y3a);
        final hc1$a hc1$a = (hc1$a)a;
        hc1$a.a = "cct";
        hc1$a.b = ((y63)y3a).b();
        return (r0u)new s0u((Set)o, hc1$a.b(), (u0u)this);
    }
}
