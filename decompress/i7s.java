import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i7s
{
    public final w6s a;
    public final boolean b;
    public final boolean c;
    
    public i7s(final w6s a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static i7s a(final i7s i7s, boolean b, final int n) {
        w6s a;
        if ((n & 0x1) != 0x0) {
            a = i7s.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = i7s.b;
        }
        final boolean b2 = (n & 0x4) != 0x0 && i7s.c;
        Objects.requireNonNull(i7s);
        zzd.f((Object)a, "item");
        return new i7s(a, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i7s)) {
            return false;
        }
        final i7s i7s = (i7s)o;
        return zzd.a((Object)this.a, (Object)i7s.a) && this.b == i7s.b && this.c == i7s.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final w6s a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TabCustomizationSelectableItem(item=");
        sb.append(a);
        sb.append(", selected=");
        sb.append(b);
        sb.append(", selectable=");
        return bd.y(sb, c, ")");
    }
}
