import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjp implements ccx
{
    public final jx9<?> a;
    public final Set<xip> b;
    public final boolean c;
    
    public wjp(final jx9<?> a, final Set<? extends xip> b, final boolean c) {
        e0e.f((Object)b, "selectedCategories");
        this.a = a;
        this.b = (Set<xip>)b;
        this.c = c;
    }
    
    public static wjp l(final wjp wjp, Set b, boolean c, final int n) {
        jx9<?> a;
        if ((n & 0x1) != 0x0) {
            a = wjp.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = wjp.b;
        }
        if ((n & 0x4) != 0x0) {
            c = wjp.c;
        }
        Objects.requireNonNull(wjp);
        e0e.f((Object)b, "selectedCategories");
        return new wjp(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wjp)) {
            return false;
        }
        final wjp wjp = (wjp)o;
        return e0e.a((Object)this.a, (Object)wjp.a) && e0e.a((Object)this.b, (Object)wjp.b) && this.c == wjp.c;
    }
    
    @Override
    public final int hashCode() {
        final jx9<?> a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int q = z9a.q((Set)this.b, hashCode * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return q + c;
    }
    
    @Override
    public final String toString() {
        final jx9<?> a = this.a;
        final Set<xip> b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("SensitiveMediaViewState(editableMedia=");
        sb.append(a);
        sb.append(", selectedCategories=");
        sb.append(b);
        sb.append(", showInterstitial=");
        return xj0.B(sb, c, ")");
    }
}
