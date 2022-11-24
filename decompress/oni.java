// 
// Decompiled by Procyon v0.6.0
// 

public final class oni
{
    public static final oni$a a;
    
    static {
        a = new dlh.c() {
            @Override
            public final String toString() {
                return "<Head>";
            }
        };
    }
    
    public static final int a(final dlh.b b, final dlh.b b2) {
        e0e.f((Object)b, "prev");
        e0e.f((Object)b2, "next");
        int n;
        if (e0e.a((Object)b, (Object)b2)) {
            n = 2;
        }
        else if (vmw.d((Object)b, (Object)b2)) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
}
