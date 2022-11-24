import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class usi
{
    public static final nmp<usi> d;
    public final String a;
    public final p77 b;
    public final boolean c;
    
    static {
        usi.d = new usi.usi$b();
    }
    
    public usi(final usi.usi$a usi$a) {
        final String a = usi$a.a;
        vmw.g((Object)a);
        this.a = a;
        this.b = usi$a.b;
        this.c = usi$a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && usi.class == o.getClass()) {
            final usi usi = (usi)o;
            if (!Objects.equals(this.a, usi.a) || !Objects.equals(this.b, usi.b) || this.c != usi.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
