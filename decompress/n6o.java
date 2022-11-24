import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6o implements ccx
{
    public final int a;
    public final n6o.n6o$a b;
    public final boolean c;
    
    public n6o() {
        this(0, null, false, 7, null);
    }
    
    public n6o(final int a, final n6o.n6o$a b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public n6o(final int n, n6o.n6o$a b, final boolean b2, final int n2, final wg8 wg8) {
        b = new n6o.n6o$a((List)h3a.F0, 0);
        this.a = 0;
        this.b = b;
        this.c = false;
    }
    
    public static n6o l(final n6o n6o, int a, n6o.n6o$a b, boolean c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = n6o.a;
        }
        if ((n & 0x2) != 0x0) {
            b = n6o.b;
        }
        if ((n & 0x4) != 0x0) {
            c = n6o.c;
        }
        Objects.requireNonNull(n6o);
        e0e.f((Object)b, "prices");
        return new n6o(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n6o)) {
            return false;
        }
        final n6o n6o = (n6o)o;
        return this.a == n6o.a && e0e.a((Object)this.b, (Object)n6o.b) && this.c == n6o.c;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode + a * 31) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final n6o.n6o$a b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomScheduledSpacesTicketViewState(ticketAmount=");
        sb.append(a);
        sb.append(", prices=");
        sb.append(b);
        sb.append(", showInfo=");
        return xj0.B(sb, c, ")");
    }
}
