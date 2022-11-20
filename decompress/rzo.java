import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rzo
{
    public static final a Companion;
    public final Integer a;
    public final Long b;
    public final String c;
    public final String d;
    
    static {
        Companion = new a();
    }
    
    public rzo() {
        this(null, null, null, null, 15);
    }
    
    public rzo(final Integer a, final Long b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public rzo(Integer a, Long b, String c, String d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        if ((n & 0x4) != 0x0) {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            d = null;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        final Integer a = this.a;
        final boolean b = false;
        final List s = s9i.s(a, this.b, this.c, this.d);
        boolean b2;
        if (s.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator iterator = s.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (iterator.next() == null);
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rzo)) {
            return false;
        }
        final rzo rzo = (rzo)o;
        return czd.a((Object)this.a, (Object)rzo.a) && czd.a((Object)this.b, (Object)rzo.b) && czd.a((Object)this.c, (Object)rzo.c) && czd.a((Object)this.d, (Object)rzo.d);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Long b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Integer a = this.a;
        final Long b = this.b;
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("ScribeClientShutdownDetails(minTargetVersionInt=");
        sb.append(a);
        sb.append(", durationMs=");
        sb.append(b);
        sb.append(", contentRemoverIdentifier=");
        return mb0.C(sb, c, ", deeplinkUrl=", d, ")");
    }
    
    public static final class a
    {
    }
}
