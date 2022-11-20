import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnn implements jbx
{
    public final String a;
    public final mkc b;
    public final List<mkc$b> c;
    public final mkc d;
    
    public hnn(final String a, final mkc b, final List<mkc$b> c, final mkc d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static hnn l(final hnn hnn, List c, mkc d, final int n) {
        mkc b = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = hnn.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = hnn.b;
        }
        if ((n & 0x4) != 0x0) {
            c = hnn.c;
        }
        if ((n & 0x8) != 0x0) {
            d = hnn.d;
        }
        Objects.requireNonNull(hnn);
        czd.f((Object)c, "listItems");
        return new hnn(a, b, c, d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hnn)) {
            return false;
        }
        final hnn hnn = (hnn)o;
        return czd.a((Object)this.a, (Object)hnn.a) && czd.a((Object)this.b, (Object)hnn.b) && czd.a((Object)this.c, (Object)hnn.c) && czd.a((Object)this.d, (Object)hnn.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final mkc b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int d = sde.d((List)this.c, (hashCode * 31 + hashCode2) * 31, 31);
        final mkc d2 = this.d;
        int hashCode3;
        if (d2 == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = d2.hashCode();
        }
        return d + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final mkc b = this.b;
        final List<mkc$b> c = this.c;
        final mkc d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomHistoryManagementViewState(userName=");
        sb.append(a);
        sb.append(", listHeader=");
        sb.append(b);
        sb.append(", listItems=");
        sb.append(c);
        sb.append(", listFooter=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
