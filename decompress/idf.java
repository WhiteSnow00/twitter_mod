// 
// Decompiled by Procyon v0.6.0
// 

public final class idf implements jtb
{
    public static final idf b;
    public static final idf c;
    public final int a;
    
    static {
        b = new idf(0);
        c = new idf(1);
    }
    
    public idf(final int a) {
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        switch (this.a) {
            default: {
                final tge tge = (tge)o;
                final q6u$a companion = q6u.Companion;
                czd.f((Object)tge, "input");
                return gih.c(tge, (Class)p6u$b.class, false);
            }
            case 0: {
                return Long.valueOf((String)o);
            }
        }
    }
}
