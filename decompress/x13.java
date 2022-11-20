import com.twitter.profilemodules.model.business.HourMinute;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x13
{
    public final HourMinute a;
    public final HourMinute b;
    
    public x13(final HourMinute a, final HourMinute b) {
        czd.f((Object)a, "open");
        czd.f((Object)b, "close");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x13)) {
            return false;
        }
        final x13 x13 = (x13)o;
        return czd.a((Object)this.a, (Object)x13.a) && czd.a((Object)this.b, (Object)x13.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final HourMinute a = this.a;
        final HourMinute b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesRegularSlot(open=");
        sb.append(a);
        sb.append(", close=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
