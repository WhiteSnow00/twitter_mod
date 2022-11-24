import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uu
{
    public static final nmp<uu> b;
    public final Map<Long, List<tu>> a;
    
    static {
        uu.b = new uu.uu$a();
    }
    
    public uu(final uu.uu$b uu$b) {
        this.a = uu$b.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof uu)) {
                return b2;
            }
            final uu uu = (uu)o;
            final boolean b3 = this == uu || (uu != null && o5j.a((Object)this.a, (Object)uu.a));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
}
