import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umn implements oax
{
    public final String a;
    public final mlc b;
    public final List<mlc$b> c;
    public final mlc d;
    
    public umn(final String a, final mlc b, final List<mlc$b> c, final mlc d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static umn l(final umn umn, List c, mlc d, final int n) {
        mlc b = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = umn.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = umn.b;
        }
        if ((n & 0x4) != 0x0) {
            c = umn.c;
        }
        if ((n & 0x8) != 0x0) {
            d = umn.d;
        }
        Objects.requireNonNull(umn);
        zzd.f((Object)c, "listItems");
        return new umn(a, b, c, d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof umn)) {
            return false;
        }
        final umn umn = (umn)o;
        return zzd.a((Object)this.a, (Object)umn.a) && zzd.a((Object)this.b, (Object)umn.b) && zzd.a((Object)this.c, (Object)umn.c) && zzd.a((Object)this.d, (Object)umn.d);
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
        final mlc b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int m = hy8.m((List)this.c, (hashCode * 31 + hashCode2) * 31, 31);
        final mlc d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = d.hashCode();
        }
        return m + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final mlc b = this.b;
        final List<mlc$b> c = this.c;
        final mlc d = this.d;
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
