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

public final class bwo implements qll
{
    public final /* synthetic */ int C0;
    public final qll D0;
    
    public final Object get() {
        switch (this.C0) {
            default: {
                final String packageName = ((Context)this.D0.get()).getPackageName();
                Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
                return packageName;
            }
            case 0: {
                final mi4 mi4 = (mi4)this.D0.get();
                final HashMap hashMap = new HashMap();
                final azk c0 = azk.C0;
                final svo$a$a a = svo$a.a();
                a.b(30000L);
                a.c();
                hashMap.put(c0, a.a());
                final azk e0 = azk.E0;
                final svo$a$a a2 = svo$a.a();
                a2.b(1000L);
                a2.c();
                hashMap.put(e0, a2.a());
                final azk d0 = azk.D0;
                final svo$a$a a3 = svo$a.a();
                a3.b(86400000L);
                a3.c();
                final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(svo$b.C0, svo$b.D0)));
                final ac1$b ac1$b = (ac1$b)a3;
                Objects.requireNonNull(unmodifiableSet, "Null flags");
                ac1$b.c = unmodifiableSet;
                hashMap.put(d0, ac1$b.a());
                Objects.requireNonNull(mi4, "missing required property: clock");
                if (hashMap.keySet().size() >= azk.values().length) {
                    new HashMap();
                    return new zb1(mi4, hashMap);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }
    }
}
