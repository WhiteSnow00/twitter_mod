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

public final class dw2
{
    public final iw2 a;
    public final jv2 b;
    public final TimeZone c;
    
    public dw2(final iw2 a, final jv2 b, final TimeZone c) {
        zzd.f((Object)a, "hoursTypeSelection");
        zzd.f((Object)c, "timezone");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static dw2 a(final dw2 dw2, iw2 a, TimeZone c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = dw2.a;
        }
        jv2 b;
        if ((n & 0x2) != 0x0) {
            b = dw2.b;
        }
        else {
            b = null;
        }
        if ((n & 0x4) != 0x0) {
            c = dw2.c;
        }
        Objects.requireNonNull(dw2);
        zzd.f((Object)a, "hoursTypeSelection");
        zzd.f((Object)b, "dayEntries");
        zzd.f((Object)c, "timezone");
        return new dw2(a, b, c);
    }
    
    public final BusinessHoursData b() {
        final iw2 a = this.a;
        final List a2 = this.b.a;
        final ArrayList list = new ArrayList();
        for (final kv2 kv2 : a2) {
            Object o;
            if (!kv2.b() && a == iw2.E0) {
                final Weekday a3 = kv2.a;
                final List<sv2> b = kv2.b;
                final ArrayList list2 = new ArrayList<OpenHoursInterval>(kr4.h1((Iterable)b, 10));
                for (final sv2 sv2 : b) {
                    list2.add(new OpenHoursInterval(sv2.a, sv2.b));
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
        if (!(o instanceof dw2)) {
            return false;
        }
        final dw2 dw2 = (dw2)o;
        return this.a == dw2.a && zzd.a((Object)this.b, (Object)dw2.b) && zzd.a((Object)this.c, (Object)dw2.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final iw2 a = this.a;
        final jv2 b = this.b;
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
