import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fns
{
    public static final a Companion;
    public static final nmp<fns> e;
    public final float a;
    public final float b;
    public final boolean c;
    public final boolean d;
    
    static {
        Companion = new a();
        fns.e = new b();
    }
    
    public fns(final float a, final float b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final yfe yfe) throws IOException {
        yfe.r0();
        yfe.P("celsius_high", this.a);
        yfe.P("celsius_low", this.b);
        yfe.e("is_charging_high", this.c);
        yfe.e("is_charging_low", this.d);
        yfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fns)) {
            return false;
        }
        final fns fns = (fns)o;
        return Float.compare(this.a, fns.a) == 0 && Float.compare(this.b, fns.b) == 0 && this.c == fns.c && this.d == fns.d;
    }
    
    @Override
    public final int hashCode() {
        final int g = dn.g(this.b, Float.floatToIntBits(this.a) * 31, 31);
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final int d = this.d ? 1 : 0;
        if (d == 0) {
            n = d;
        }
        return (g + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        return p4l.g(lr0.z("ThermalProfileDetails(celsiusHigh=", this.a, ", celsiusLow=", this.b, ", isChargingHigh="), this.c, ", isChargingLow=", this.d, ")");
    }
    
    public static final class a
    {
    }
    
    public static final class b extends k5j<fns>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            return new fns(rmp.y(), rmp.y(), rmp.u(), rmp.u());
        }
        
        public final void f(final smp smp, final Object o) {
            final fns fns = (fns)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)fns, "scribeDetails");
            smp.y(fns.a);
            smp.y(fns.b);
            smp.t(fns.c);
            smp.t(fns.d);
        }
    }
}
