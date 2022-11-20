import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rwo implements dml
{
    public final int D0;
    public final dml E0;
    
    public rwo(final dml e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object get() {
        switch (this.D0) {
            default: {
                final String packageName = ((Context)this.E0.get()).getPackageName();
                Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
                return packageName;
            }
            case 0: {
                final nh4 nh4 = (nh4)this.E0.get();
                final HashMap hashMap = new HashMap();
                final izk d0 = izk.D0;
                final iwo.a.a a = iwo.a.a();
                a.b(30000L);
                a.c();
                hashMap.put(d0, a.a());
                final izk f0 = izk.F0;
                final iwo.a.a a2 = iwo.a.a();
                a2.b(1000L);
                a2.c();
                hashMap.put(f0, a2.a());
                final izk e0 = izk.E0;
                final iwo.a.a a3 = iwo.a.a();
                a3.b(86400000L);
                a3.c();
                final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(iwo.b.D0, iwo.b.E0)));
                final wb1$b wb1$b = (wb1$b)a3;
                Objects.requireNonNull(unmodifiableSet, "Null flags");
                wb1$b.c = unmodifiableSet;
                hashMap.put(e0, wb1$b.a());
                Objects.requireNonNull(nh4, "missing required property: clock");
                if (hashMap.keySet().size() >= izk.values().length) {
                    new HashMap();
                    return new vb1(nh4, hashMap);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }
    }
}
