import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class br4 implements bis
{
    public final long a;
    
    public br4(final long a) {
        this.a = a;
        Objects.requireNonNull(nq4.Companion);
        if (a != nq4.g) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
    }
    
    public final float a() {
        return nq4.d(this.a);
    }
    
    public final bis b(final nsb nsb) {
        return i48.f((bis)this, nsb);
    }
    
    public final long c() {
        return this.a;
    }
    
    public final bis d(final bis bis) {
        return i48.e((bis)this, bis);
    }
    
    public final fq2 e() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof br4 && nq4.c(this.a, ((br4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return nq4.i(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("ColorStyle(value=");
        j.append((Object)nq4.j(this.a));
        j.append(')');
        return j.toString();
    }
}
