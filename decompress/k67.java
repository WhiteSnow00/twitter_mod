// 
// Decompiled by Procyon v0.6.0
// 

public final class k67
{
    public static final rlp<k67> f;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final edq e;
    
    static {
        k67.f = new k67.k67$b();
    }
    
    public k67(final k67.k67$a k67$a) {
        this.a = k67$a.a;
        this.b = k67$a.b;
        this.c = k67$a.c;
        this.d = k67$a.d;
        this.e = k67$a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && k67.class == o.getClass()) {
            final k67 k67 = (k67)o;
            if (this.a != k67.a || this.b != k67.b || this.c != k67.c || this.d != k67.d || !c5j.a((Object)this.e, (Object)k67.e)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.j((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e);
    }
}
