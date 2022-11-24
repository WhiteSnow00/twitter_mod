// 
// Decompiled by Procyon v0.6.0
// 

public final class k51
{
    public final String a;
    
    public k51(final a a) {
        this.a = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && k51.class == o.getClass()) {
            final k51 k51 = (k51)o;
            String a;
            if ((a = this.a) == null) {
                a = "";
            }
            return a.equals(k51.a);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        return a.hashCode();
    }
    
    public static final class a extends z4j<k51>
    {
        public String a;
        
        public final Object i() {
            return new k51(this);
        }
    }
}
