import java.util.List;
import com.twitter.profilemodules.model.business.Weekday;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w13
{
    public final Weekday a;
    public final List<y13> b;
    
    public w13(final Weekday a, final List<y13> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w13)) {
            return false;
        }
        final w13 w13 = (w13)o;
        return this.a == w13.a && czd.a((Object)this.b, (Object)w13.b);
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
        final List<y13> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Weekday a = this.a;
        final List<y13> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesRegularInput(weekday=");
        sb.append(a);
        sb.append(", slots=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
