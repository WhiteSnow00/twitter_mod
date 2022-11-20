// 
// Decompiled by Procyon v0.6.0
// 

public final class kuo
{
    public final float a;
    public final long b;
    public final uza<Float> c;
    
    public kuo(final float a, final long b, final uza c, final rf8 rf8) {
        this.a = a;
        this.b = b;
        this.c = (uza<Float>)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kuo)) {
            return false;
        }
        final kuo kuo = (kuo)o;
        return czd.a((Object)this.a, (Object)kuo.a) && vyt.a(this.b, kuo.b) && czd.a((Object)this.c, (Object)kuo.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (vyt.d(this.b) + Float.floatToIntBits(this.a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Scale(scale=");
        j.append(this.a);
        j.append(", transformOrigin=");
        j.append((Object)vyt.e(this.b));
        j.append(", animationSpec=");
        j.append(this.c);
        j.append(')');
        return j.toString();
    }
}
