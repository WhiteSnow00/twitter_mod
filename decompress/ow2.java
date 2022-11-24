import com.twitter.profilemodules.model.business.Weekday;
import java.util.Iterator;
import java.util.List;
import com.twitter.business.model.hours.DayAndOpenHours;
import com.twitter.business.model.hours.OpenHoursInterval;
import java.util.ArrayList;
import com.twitter.business.model.hours.BusinessHoursData;
import java.util.Objects;
import java.util.TimeZone;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ow2
{
    public final tw2 a;
    public final uv2 b;
    public final TimeZone c;
    
    public ow2(final tw2 a, final uv2 b, final TimeZone c) {
        e0e.f((Object)a, "hoursTypeSelection");
        e0e.f((Object)c, "timezone");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static ow2 a(final ow2 ow2, tw2 a, TimeZone c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = ow2.a;
        }
        uv2 b;
        if ((n & 0x2) != 0x0) {
            b = ow2.b;
        }
        else {
            b = null;
        }
        if ((n & 0x4) != 0x0) {
            c = ow2.c;
        }
        Objects.requireNonNull(ow2);
        e0e.f((Object)a, "hoursTypeSelection");
        e0e.f((Object)b, "dayEntries");
        e0e.f((Object)c, "timezone");
        return new ow2(a, b, c);
    }
    
    public final BusinessHoursData b() {
        final tw2 a = this.a;
        final List a2 = this.b.a;
        final ArrayList list = new ArrayList();
        for (final vv2 vv2 : a2) {
            Object o;
            if (!vv2.b() && a == tw2.H0) {
                final Weekday a3 = vv2.a;
                final List b = vv2.b;
                final ArrayList list2 = new ArrayList<OpenHoursInterval>(nr4.d1((Iterable)b, 10));
                for (final dw2 dw2 : b) {
                    list2.add(new OpenHoursInterval(dw2.a, dw2.b));
                }
                o = new DayAndOpenHours(a3, (List)list2);
            }
            else {
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        return new BusinessHoursData(a, (List)list, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ow2)) {
            return false;
        }
        final ow2 ow2 = (ow2)o;
        return this.a == ow2.a && e0e.a((Object)this.b, (Object)ow2.b) && e0e.a((Object)this.c, (Object)ow2.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final tw2 a = this.a;
        final uv2 b = this.b;
        final TimeZone c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessHoursStateData(hoursTypeSelection=");
        sb.append(a);
        sb.append(", dayEntries=");
        sb.append(b);
        sb.append(", timezone=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
