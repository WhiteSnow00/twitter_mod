// 
// Decompiled by Procyon v0.6.0
// 

public abstract class o67
{
    public static final b Companion;
    
    static {
        Companion = new b();
    }
    
    public o67(final rf8 rf8) {
    }
    
    public abstract int a(final int p0, final fve p1, final wgk p2, final int p3);
    
    public Integer b(final wgk wgk) {
        return null;
    }
    
    public static final class b
    {
        public final o67 a(final ex.b b) {
            czd.f((Object)b, "horizontal");
            return (o67)new o67$c(b);
        }
        
        public final o67 b(final ex.c c) {
            czd.f((Object)c, "vertical");
            return (o67)new o67$d(c);
        }
    }
}
