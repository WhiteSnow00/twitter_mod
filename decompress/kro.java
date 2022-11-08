import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kro
{
    public static final s4j<kro> c;
    public static final Long d;
    public final jwh a;
    public final Long b;
    
    static {
        kro.c = new kro.kro$a();
        d = -2L;
    }
    
    public kro(final jwh a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && kro.class == o.getClass()) {
            final kro kro = (kro)o;
            if (!w4j.a((Object)this.a, (Object)kro.a) || !w4j.a((Object)this.b, (Object)kro.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        Long b = this.b;
        final Long d = kro.d;
        if (b == null) {
            Objects.requireNonNull(d, "defaultObj");
            b = d;
        }
        return b.hashCode() + hashCode * 31;
    }
}
