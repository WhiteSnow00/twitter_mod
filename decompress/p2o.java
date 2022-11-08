import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2o implements oax
{
    public final boolean a;
    public final int b;
    public final String c;
    public final Calendar d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final NarrowcastSpaceType k;
    
    public p2o(final boolean a, final int b, final String c, final Calendar d, final boolean e, final boolean f, final boolean g, final boolean h, final boolean i, final boolean j, final NarrowcastSpaceType k) {
        zzd.f((Object)k, "narrowCastSpaceType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static p2o l(final p2o p2o, String c, Calendar d, boolean e, boolean f, boolean g, boolean h, final int n) {
        final boolean b = (n & 0x1) != 0x0 && p2o.a;
        int b2;
        if ((n & 0x2) != 0x0) {
            b2 = p2o.b;
        }
        else {
            b2 = 0;
        }
        if ((n & 0x4) != 0x0) {
            c = p2o.c;
        }
        if ((n & 0x8) != 0x0) {
            d = p2o.d;
        }
        if ((n & 0x10) != 0x0) {
            e = p2o.e;
        }
        if ((n & 0x20) != 0x0) {
            f = p2o.f;
        }
        if ((n & 0x40) != 0x0) {
            g = p2o.g;
        }
        if ((n & 0x80) != 0x0) {
            h = p2o.h;
        }
        final boolean b3 = (n & 0x100) != 0x0 && p2o.i;
        final boolean b4 = (n & 0x200) != 0x0 && p2o.j;
        NarrowcastSpaceType k;
        if ((n & 0x400) != 0x0) {
            k = p2o.k;
        }
        else {
            k = null;
        }
        Objects.requireNonNull(p2o);
        zzd.f((Object)d, "roomScheduledTime");
        zzd.f((Object)k, "narrowCastSpaceType");
        return new p2o(b, b2, c, d, e, f, g, h, b3, b4, k);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p2o)) {
            return false;
        }
        final p2o p2o = (p2o)o;
        return this.a == p2o.a && this.b == p2o.b && zzd.a((Object)this.c, (Object)p2o.c) && zzd.a((Object)this.d, (Object)p2o.d) && this.e == p2o.e && this.f == p2o.f && this.g == p2o.g && this.h == p2o.h && this.i == p2o.i && this.j == p2o.j && zzd.a((Object)this.k, (Object)p2o.k);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int b = this.b;
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int hashCode2 = this.d.hashCode();
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        final int j = this.j ? 1 : 0;
        if (j == 0) {
            n = j;
        }
        return this.k.hashCode() + (((((((hashCode2 + ((n2 * 31 + b) * 31 + hashCode) * 31) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + i) * 31 + n) * 31;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final int b = this.b;
        final String c = this.c;
        final Calendar d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final NarrowcastSpaceType k = this.k;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomScheduleViewState(isEnabled=");
        sb.append(a);
        sb.append(", privacyControl=");
        sb.append(b);
        sb.append(", description=");
        sb.append(c);
        sb.append(", roomScheduledTime=");
        sb.append(d);
        sb.append(", showingDatePicker=");
        lo0.z(sb, e, ", showingTimePicker=", f, ", ticketCreationEnabled=");
        lo0.z(sb, g, ", isSpaceRecording=", h, ", isSpaceClippable=");
        lo0.z(sb, i, ", hasMaxScheduledSpaces=", j, ", narrowCastSpaceType=");
        sb.append(k);
        sb.append(")");
        return sb.toString();
    }
}
