import com.twitter.profilemodules.model.business.HourMinute;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r23
{
    public final HourMinute a;
    public final HourMinute b;
    
    public r23(final HourMinute a, final HourMinute b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r23)) {
            return false;
        }
        final r23 r23 = (r23)o;
        return e0e.a((Object)this.a, (Object)r23.a) && e0e.a((Object)this.b, (Object)r23.b);
    }
    
    @Override
    public final int hashCode() {
        final HourMinute a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final HourMinute b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final HourMinute a = this.a;
        final HourMinute b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesRegularSlotInput(open=");
        sb.append(a);
        sb.append(", close=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
