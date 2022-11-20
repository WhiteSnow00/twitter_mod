import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypj
{
    public static final a Companion;
    public static final rlp<ypj> e;
    public final long a;
    public final float b;
    public final float c;
    public final boolean d;
    
    static {
        Companion = new a();
        ypj.e = new ypj.ypj$b();
    }
    
    public ypj(final long a, final float b, final float c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        afe.V("duration_millis", this.a);
        afe.O("start_celsius", this.b);
        afe.O("event_celsius", this.c);
        afe.e("is_charging", this.d);
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ypj)) {
            return false;
        }
        final ypj ypj = (ypj)o;
        return this.a == ypj.a && Float.compare(this.b, ypj.b) == 0 && Float.compare(this.c, ypj.c) == 0 && this.d == ypj.d;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int g = c0.g(this.c, c0.g(this.b, (int)(a ^ a >>> 32) * 31, 31), 31);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return g + d;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final float b = this.b;
        final float c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("OverheatEventDetails(durationMillis=");
        sb.append(a);
        sb.append(", startCelsius=");
        sb.append(b);
        sb.append(", eventCelsius=");
        sb.append(c);
        sb.append(", isCharging=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
