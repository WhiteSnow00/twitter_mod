import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wxm implements uxm
{
    public final String b;
    
    public wxm(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && wxm.class == o.getClass() && this.b.equals(((wxm)o).b));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.b);
    }
    
    public static final class a extends z4j<wxm>
    {
        public String a;
        public lxd b;
        
        public final Object i() {
            return new wxm(this);
        }
        
        public final boolean k() {
            return flr.g((CharSequence)this.a);
        }
    }
}
