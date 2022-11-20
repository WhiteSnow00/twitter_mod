// 
// Decompiled by Procyon v0.6.0
// 

public final class iqm
{
    public final float a;
    public final float b;
    public final float c;
    
    public iqm(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof iqm)) {
            return false;
        }
        final float a = this.a;
        final iqm iqm = (iqm)o;
        return a == iqm.a && this.b == iqm.b && this.c == iqm.c;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c) + c0.g(this.b, Float.floatToIntBits(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("ResistanceConfig(basis=");
        j.append(this.a);
        j.append(", factorAtMin=");
        j.append(this.b);
        j.append(", factorAtMax=");
        return wnj.C(j, this.c, ')');
    }
}
