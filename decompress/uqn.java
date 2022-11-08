import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uqn implements oax
{
    public final List<ksh> a;
    public final boolean b;
    public final boolean c;
    
    public uqn(final List<? extends ksh> a, final boolean b, final boolean c) {
        this.a = (List<ksh>)a;
        this.b = b;
        this.c = c;
    }
    
    public static uqn l(final uqn uqn, List a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = uqn.a;
        }
        if ((n & 0x2) != 0x0) {
            b = uqn.b;
        }
        final boolean b2 = (n & 0x4) != 0x0 && uqn.c;
        Objects.requireNonNull(uqn);
        zzd.f((Object)a, "listItems");
        return new uqn(a, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uqn)) {
            return false;
        }
        final uqn uqn = (uqn)o;
        return zzd.a((Object)this.a, (Object)uqn.a) && this.b == uqn.b && this.c == uqn.c;
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
        final List<ksh> a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomMultiScheduledSpacesViewState(listItems=");
        sb.append(a);
        sb.append(", showMaxSpacesCreatedMessage=");
        sb.append(b);
        sb.append(", showHeader=");
        return bd.y(sb, c, ")");
    }
}
