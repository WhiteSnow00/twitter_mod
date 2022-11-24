import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yq2 implements tis
{
    public final trp a;
    public final float b;
    
    public yq2(final trp a, final float b) {
        e0e.f((Object)a, "value");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final float a() {
        return this.b;
    }
    
    @Override
    public final tis b(final ptb ptb) {
        return i2f.d((tis)this, ptb);
    }
    
    @Override
    public final long c() {
        Objects.requireNonNull(sr4.Companion);
        return sr4.g;
    }
    
    @Override
    public final tis d(final tis tis) {
        return i2f.c((tis)this, tis);
    }
    
    @Override
    public final wq2 e() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yq2)) {
            return false;
        }
        final yq2 yq2 = (yq2)o;
        return e0e.a((Object)this.a, (Object)yq2.a) && e0e.a((Object)this.b, (Object)yq2.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("BrushStyle(value=");
        f.append(this.a);
        f.append(", alpha=");
        return dn.C(f, this.b, ')');
    }
}
