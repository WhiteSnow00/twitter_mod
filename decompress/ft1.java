// 
// Decompiled by Procyon v0.6.0
// 

public final class ft1
{
    public static final a Companion;
    public Integer a;
    public String b;
    
    static {
        Companion = new a();
    }
    
    public ft1() {
        this.a = null;
        this.b = null;
    }
    
    public ft1(final Integer n, final String s, final int n2, final hg8 hg8) {
        this.a = null;
        this.b = null;
    }
    
    public final void a(final tfe tfe) {
        tfe.r0();
        final Integer a = this.a;
        if (a != null) {
            tfe.T("battery_percentage_100k", a.intValue());
        }
        final String b = this.b;
        if (b != null) {
            tfe.u0("battery_status", b);
        }
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ft1)) {
            return false;
        }
        final ft1 ft1 = (ft1)o;
        return zzd.a((Object)this.a, (Object)ft1.a) && zzd.a((Object)this.b, (Object)ft1.b);
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
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Integer a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BatteryScribeDetails(batteryPercentage100k=");
        sb.append(a);
        sb.append(", batteryStatus=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
