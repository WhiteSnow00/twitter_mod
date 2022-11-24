import java.util.List;
import com.twitter.profilemodules.model.business.Weekday;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p23
{
    public final Weekday a;
    public final List<r23> b;
    
    public p23(final Weekday a, final List<r23> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p23)) {
            return false;
        }
        final p23 p = (p23)o;
        return this.a == p.a && e0e.a((Object)this.b, (Object)p.b);
    }
    
    @Override
    public final int hashCode() {
        final Weekday a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<r23> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Weekday a = this.a;
        final List<r23> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesRegularInput(weekday=");
        sb.append(a);
        sb.append(", slots=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
