import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ydq implements oax
{
    public final mdq a;
    public final dtg b;
    public final boolean c;
    public final vo6 d;
    public final boolean e;
    
    public ydq() {
        this(null, null, false, null, false, 31, null);
    }
    
    public ydq(final mdq a, final dtg b, final boolean c, final vo6 d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ydq(final mdq mdq, final dtg dtg, final boolean b, final vo6 vo6, final boolean b2, final int n, final hg8 hg8) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = null;
        this.e = false;
    }
    
    public static ydq l(final ydq ydq, mdq a, dtg b, boolean c, vo6 d, boolean e, final int n) {
        if ((n & 0x1) != 0x0) {
            a = ydq.a;
        }
        if ((n & 0x2) != 0x0) {
            b = ydq.b;
        }
        if ((n & 0x4) != 0x0) {
            c = ydq.c;
        }
        if ((n & 0x8) != 0x0) {
            d = ydq.d;
        }
        if ((n & 0x10) != 0x0) {
            e = ydq.e;
        }
        Objects.requireNonNull(ydq);
        return new ydq(a, b, c, d, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ydq)) {
            return false;
        }
        final ydq ydq = (ydq)o;
        return zzd.a((Object)this.a, (Object)ydq.a) && zzd.a((Object)this.b, (Object)ydq.b) && this.c == ydq.c && zzd.a((Object)this.d, (Object)ydq.d) && this.e == ydq.e;
    }
    
    @Override
    public final int hashCode() {
        final mdq a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final dtg b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final vo6 d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + n2) * 31 + hashCode) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final mdq a = this.a;
        final dtg b = this.b;
        final boolean c = this.c;
        final vo6 d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("SlateHeroViewState(slate=");
        sb.append(a);
        sb.append(", mediaEntity=");
        sb.append(b);
        sb.append(", collapsed=");
        sb.append(c);
        sb.append(", tweet=");
        sb.append(d);
        sb.append(", attached=");
        return bd.y(sb, e, ")");
    }
}
