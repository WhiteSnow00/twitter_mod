// 
// Decompiled by Procyon v0.6.0
// 

public final class qn7 extends ak1
{
    public final String g;
    
    public qn7(final qn7.qn7$a qn7$a) {
        super((ak1$a)qn7$a);
        String f;
        if ((f = qn7$a.f) == null) {
            f = "";
        }
        this.g = f;
    }
    
    public final of7 a() {
        return of7.L0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof qn7)) {
                return b2;
            }
            final qn7 qn7 = (qn7)o;
            final boolean b3 = super.equals((Object)qn7) && this.g.equals(qn7.g);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        return c5j.g((Object)super.hashCode(), (Object)this.g);
    }
}
