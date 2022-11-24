// 
// Decompiled by Procyon v0.6.0
// 

public final class to7 extends ek1
{
    public final String g;
    
    public to7(final a a) {
        super((ek1$a)a);
        String f;
        if ((f = a.f) == null) {
            f = "";
        }
        this.g = f;
    }
    
    public final rg7 a() {
        return rg7.N0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof to7)) {
                return b2;
            }
            final to7 to7 = (to7)o;
            final boolean b3 = super.equals((Object)to7) && this.g.equals(to7.g);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        return o5j.g((Object)super.hashCode(), (Object)this.g);
    }
    
    public static final class a extends ek1$a<to7, a>
    {
        public String f;
        
        public final Object i() {
            return new to7(this);
        }
        
        public final boolean k() {
            return this.f != null;
        }
    }
}
