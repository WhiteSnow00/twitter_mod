// 
// Decompiled by Procyon v0.6.0
// 

public class w000
{
    public static final w000 d;
    public final boolean a;
    public final String b;
    public final Throwable c;
    
    static {
        d = new w000(true, null, null);
    }
    
    public w000(final boolean a, final String b, final Throwable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static w000 b(final String s) {
        return new w000(false, s, null);
    }
    
    public static w000 c(final String s, final Throwable t) {
        return new w000(false, s, t);
    }
    
    public String a() {
        return this.b;
    }
}
