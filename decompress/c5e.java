import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5e implements nuk
{
    public final int c;
    public final Object d;
    
    public c5e(final Object d, final int c) {
        this.c = c;
        this.d = d;
    }
    
    public final boolean apply(final Object o) {
        switch (this.c) {
            default: {
                final m5e m5e = new m5e((Object[])this.d);
                final k07 k07 = new k07(o, 4);
                final int a = sna.a;
                return k6e.b((Iterable)m5e, (nuk)k07);
            }
            case 2: {
                return ((Set)this.d).contains(o);
            }
            case 1: {
                final Collection collection = (Collection)this.d;
                final mgr mgr = (mgr)o;
                final int e = rgr.e;
                return collection.contains(mgr.f);
            }
            case 0: {
                return ((Class)this.d).isInstance(o);
            }
        }
    }
}
