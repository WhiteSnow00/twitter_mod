import java.util.Set;
import java.util.Collections;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2u implements d2u
{
    public static volatile k58 e;
    public final si4 a;
    public final si4 b;
    public final axo c;
    public final t5w d;
    
    public e2u(final si4 a, final si4 b, final axo c, final t5w d, final jsx jsx) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        jsx.a.execute((Runnable)new n20((Object)jsx, 4));
    }
    
    public static e2u a() {
        final k58 e = e2u.e;
        if (e != null) {
            return (e2u)e.R0.get();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static void b(final Context context) {
        if (e2u.e == null) {
            synchronized (e2u.class) {
                if (e2u.e == null) {
                    Objects.requireNonNull(context);
                    e2u.e = new k58(context);
                }
            }
        }
    }
    
    public final a2u c(final k4a k4a) {
        Object o;
        if (k4a instanceof k4a) {
            Objects.requireNonNull((h73)k4a);
            o = Collections.unmodifiableSet((Set<? extends v4a>)h73.d);
        }
        else {
            o = Collections.singleton(new v4a("proto"));
        }
        final z1u$a a = z1u.a();
        Objects.requireNonNull(k4a);
        final hc1.a a2 = (hc1.a)a;
        a2.a = "cct";
        a2.b = ((h73)k4a).b();
        return (a2u)new b2u((Set<v4a>)o, a2.b(), (d2u)this);
    }
}
