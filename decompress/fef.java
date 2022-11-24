// 
// Decompiled by Procyon v0.6.0
// 

public final class fef implements lub
{
    public static final fef b;
    public static final fef c;
    public final int a;
    
    static {
        b = new fef(0);
        c = new fef(1);
    }
    
    public fef(final int a) {
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        switch (this.a) {
            default: {
                final qhe qhe = (qhe)o;
                final j7u$a companion = j7u.Companion;
                e0e.f((Object)qhe, "input");
                return uih.c(qhe, (Class<i7u>)i7u$b.class, false);
            }
            case 0: {
                return Long.valueOf((String)o);
            }
        }
    }
}
