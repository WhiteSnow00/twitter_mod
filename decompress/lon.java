import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lon
{
    public final gon a;
    public final boolean b;
    public final boolean c;
    
    public lon(final gon a, final boolean b, final boolean c) {
        zzd.f((Object)a, "roomInvite");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static lon a(final lon lon, boolean b, boolean c, final int n) {
        gon a;
        if ((n & 0x1) != 0x0) {
            a = lon.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = lon.b;
        }
        if ((n & 0x4) != 0x0) {
            c = lon.c;
        }
        Objects.requireNonNull(lon);
        zzd.f((Object)a, "roomInvite");
        return new lon(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lon)) {
            return false;
        }
        final lon lon = (lon)o;
        return zzd.a((Object)this.a, (Object)lon.a) && this.b == lon.b && this.c == lon.c;
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
        final gon a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomInviteItem2(roomInvite=");
        sb.append(a);
        sb.append(", isChecked=");
        sb.append(b);
        sb.append(", isInvitable=");
        return bd.y(sb, c, ")");
    }
}
