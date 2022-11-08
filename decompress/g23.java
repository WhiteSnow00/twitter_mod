import com.twitter.profilemodules.model.business.HourMinute;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g23
{
    public final HourMinute a;
    public final HourMinute b;
    
    public g23(final HourMinute a, final HourMinute b) {
        zzd.f((Object)a, "open");
        zzd.f((Object)b, "close");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g23)) {
            return false;
        }
        final g23 g23 = (g23)o;
        return zzd.a((Object)this.a, (Object)g23.a) && zzd.a((Object)this.b, (Object)g23.b);
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
