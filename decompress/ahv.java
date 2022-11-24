// 
// Decompiled by Procyon v0.6.0
// 

public final class ahv
{
    public final String a;
    
    public ahv(final a a) {
        this.a = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ahv.class == o.getClass()) {
            final ahv ahv = (ahv)o;
            final String a = this.a;
            final String a2 = ahv.a;
            if (a != null) {
                if (!a.equals(a2)) {
                    return b;
                }
            }
            else if (a2 != null) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    public static final class a extends z4j<ahv>
    {
        public String a;
        
        public final Object i() {
            return new ahv(this);
        }
    }
}
