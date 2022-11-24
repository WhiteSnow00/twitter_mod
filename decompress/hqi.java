import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqi implements ati
{
    public static final nmp<hqi> d;
    public final usi a;
    public final usi b;
    public final usi c;
    
    static {
        hqi.d = new hqi.hqi$b();
    }
    
    public hqi(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hqi.class == o.getClass()) {
            final hqi hqi = (hqi)o;
            if (!Objects.equals(this.a, hqi.a) || !Objects.equals(this.b, hqi.b) || !Objects.equals(this.c, hqi.c)) {
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
    
    public static final class a extends z4j<hqi>
    {
        public usi a;
        public usi b;
        public usi c;
        
        public final Object i() {
            return new hqi(this);
        }
    }
}
