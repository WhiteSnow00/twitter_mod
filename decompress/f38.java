// 
// Decompiled by Procyon v0.6.0
// 

public final class f38 extends ek1
{
    public final long g;
    public final ihr h;
    
    public f38(final a a) {
        super((ek1$a)a);
        this.g = a.f;
        this.h = a.g;
    }
    
    public final rg7 a() {
        return rg7.M0;
    }
    
    public final boolean b() {
        return true;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof f38)) {
                return b2;
            }
            final f38 f38 = (f38)o;
            final boolean b3 = super.equals((Object)f38) && this.g == f38.g;
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
    
    public static final class a extends ek1$a<f38, a>
    {
        public long f;
        public ihr g;
        
        public final Object i() {
            return new f38(this);
        }
        
        public final boolean k() {
            return this.f != 0L;
        }
    }
}
