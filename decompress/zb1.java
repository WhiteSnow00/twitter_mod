import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zb1 extends dxo
{
    public final si4 a;
    public final Map<zzk, dxo$a> b;
    
    public zb1(final si4 a, final Map<zzk, dxo$a> b) {
        Objects.requireNonNull(a, "Null clock");
        this.a = a;
        Objects.requireNonNull(b, "Null values");
        this.b = b;
    }
    
    public final si4 a() {
        return this.a;
    }
    
    public final Map<zzk, dxo$a> c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof dxo) {
            final dxo dxo = (dxo)o;
            if (!this.a.equals(dxo.a()) || !this.b.equals(dxo.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("SchedulerConfig{clock=");
        f.append(this.a);
        f.append(", values=");
        f.append(this.b);
        f.append("}");
        return f.toString();
    }
}
