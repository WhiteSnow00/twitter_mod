import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3i implements ccx
{
    public final t0i a;
    public final Integer b;
    public final qgv c;
    
    public f3i() {
        this(null, null, null, 7, null);
    }
    
    public f3i(final t0i a, final Integer b, final qgv c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public f3i(final t0i t0i, final Integer n, final qgv qgv, final int n2, final wg8 wg8) {
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public static f3i l(final f3i f3i, t0i a, Integer b, qgv c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = f3i.a;
        }
        if ((n & 0x2) != 0x0) {
            b = f3i.b;
        }
        if ((n & 0x4) != 0x0) {
            c = f3i.c;
        }
        Objects.requireNonNull(f3i);
        return new f3i(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f3i)) {
            return false;
        }
        final f3i f3i = (f3i)o;
        return e0e.a((Object)this.a, (Object)f3i.a) && e0e.a((Object)this.b, (Object)f3i.b) && e0e.a((Object)this.c, (Object)f3i.c);
    }
    
    @Override
    public final int hashCode() {
        final t0i a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final qgv c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final t0i a = this.a;
        final Integer b = this.b;
        final qgv c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTDetailViewState(nftAvatarMetadata=");
        sb.append(a);
        sb.append(", profileImageColor=");
        sb.append(b);
        sb.append(", twitterUser=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
