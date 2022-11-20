// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements e
{
    public final Object D0;
    public final a$a E0;
    
    public ReflectiveGenericLifecycleObserver(final Object d0) {
        this.D0 = d0;
        this.E0 = a.c.b((Class)d0.getClass());
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        final a$a e0 = this.E0;
        final Object d0 = this.D0;
        a$a.a((List)e0.a.get(d$b), xaf, d$b, d0);
        a$a.a((List)e0.a.get(d$b.ON_ANY), xaf, d$b, d0);
    }
}
