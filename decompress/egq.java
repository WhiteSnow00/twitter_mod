import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egq
{
    public static final a Companion;
    public final double a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    
    static {
        Companion = new a();
    }
    
    public egq(final double a, final int b, final int c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        final double a = this.a;
        if (a != 0.0) {
            afe.N("decayed_target_score", a);
        }
        final int b = this.b;
        if (b != 0) {
            afe.T("max_notification_slots", b);
        }
        final int c = this.c;
        if (c != 0) {
            afe.T("number_of_outstanding_pushes", c);
        }
        final String d = this.d;
        if (d != null) {
            afe.t0("replaced_push_impression_id", d);
        }
        final String e = this.e;
        if (e != null) {
            afe.t0("override_with", e);
        }
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof egq)) {
            return false;
        }
        final egq egq = (egq)o;
        return Double.compare(this.a, egq.a) == 0 && this.b == egq.b && this.c == egq.c && czd.a((Object)this.d, (Object)egq.d) && czd.a((Object)this.e, (Object)egq.e);
    }
    
    @Override
    public final int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.a);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final int b = this.b;
        final int c = this.c;
        final String d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((n * 31 + b) * 31 + c) * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final double a = this.a;
        final int b = this.b;
        final int c = this.c;
        final String d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("SmartPushDetails(decayedScore=");
        sb.append(a);
        sb.append(", maxSlots=");
        sb.append(b);
        sb.append(", outstandingPushes=");
        sb.append(c);
        sb.append(", replacedNotifId=");
        sb.append(d);
        return ta0.z(sb, ", overrideMethod=", e, ")");
    }
    
    public static final class a
    {
    }
}
