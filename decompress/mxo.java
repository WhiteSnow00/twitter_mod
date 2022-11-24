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

public final class mxo implements pml
{
    public final int F0;
    public final pml G0;
    
    public mxo(final pml g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object get() {
        switch (this.F0) {
            default: {
                final String packageName = ((Context)this.G0.get()).getPackageName();
                Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
                return packageName;
            }
            case 0: {
                final si4 si4 = (si4)this.G0.get();
                final HashMap hashMap = new HashMap();
                final zzk f0 = zzk.F0;
                final dxo$a$a a = dxo$a.a();
                a.b(30000L);
                a.c();
                hashMap.put(f0, a.a());
                final zzk h0 = zzk.H0;
                final dxo$a$a a2 = dxo$a.a();
                a2.b(1000L);
                a2.c();
                hashMap.put(h0, a2.a());
                final zzk g0 = zzk.G0;
                final dxo$a$a a3 = dxo$a.a();
                a3.b(86400000L);
                a3.c();
                final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(dxo$b.F0, dxo$b.G0)));
                final ac1$b ac1$b = (ac1$b)a3;
                Objects.requireNonNull(unmodifiableSet, "Null flags");
                ac1$b.c = unmodifiableSet;
                hashMap.put(g0, ac1$b.a());
                Objects.requireNonNull(si4, "missing required property: clock");
                if (hashMap.keySet().size() >= zzk.values().length) {
                    new HashMap();
                    return new zb1(si4, hashMap);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }
    }
}
