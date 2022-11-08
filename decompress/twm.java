import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twm implements nwm
{
    public final String b;
    
    public twm(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && twm.class == o.getClass() && this.b.equals(((twm)o).b));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.b);
    }
    
    public static final class a extends h4j<twm>
    {
        public String a;
        public gxd b;
        
        public final Object i() {
            return new twm(this);
        }
        
        public final boolean l() {
            return pjr.g((CharSequence)this.a);
        }
    }
}
