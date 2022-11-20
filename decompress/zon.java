import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zon
{
    public final uon a;
    public final boolean b;
    public final boolean c;
    
    public zon(final uon a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static zon a(final zon zon, boolean b, boolean c, final int n) {
        uon a;
        if ((n & 0x1) != 0x0) {
            a = zon.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = zon.b;
        }
        if ((n & 0x4) != 0x0) {
            c = zon.c;
        }
        Objects.requireNonNull(zon);
        czd.f((Object)a, "roomInvite");
        return new zon(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zon)) {
            return false;
        }
        final zon zon = (zon)o;
        return czd.a((Object)this.a, (Object)zon.a) && this.b == zon.b && this.c == zon.c;
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
        final uon a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomInviteItem(roomInvite=");
        sb.append(a);
        sb.append(", isChecked=");
        sb.append(b);
        sb.append(", isInvitable=");
        return wnj.D(sb, c, ")");
    }
}
