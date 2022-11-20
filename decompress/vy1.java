// 
// Decompiled by Procyon v0.6.0
// 

public final class vy1
{
    public static final rlp<vy1> c;
    public static final rlp<Object> d;
    public final Object a;
    public final String b;
    
    static {
        vy1.c = new vy1.vy1$a();
        vy1.d = new vy1$a$a();
    }
    
    public vy1(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof vy1)) {
            return false;
        }
        final vy1 vy1 = (vy1)o;
        if (!c5j.a((Object)this.b, (Object)vy1.b) || !c5j.a(this.a, vy1.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g(this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final Object a = this.a;
        if (a != null) {
            return a.toString();
        }
        return super.toString();
    }
}
