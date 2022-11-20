// 
// Decompiled by Procyon v0.6.0
// 

public final class ut8
{
    public static final a Companion;
    public static final ut8 d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        Companion = new a();
        d = new ut8(null, null, null, 7, null);
    }
    
    public ut8() {
        this(null, null, null, 7, null);
    }
    
    public ut8(String s, final String s2, final String s3) {
        String a = s;
        if (s == null) {
            a = "";
        }
        this.a = a;
        if ((s = s2) == null) {
            s = "";
        }
        this.b = s;
        if ((s = s3) == null) {
            s = "";
        }
        this.c = s;
    }
    
    public ut8(final String s, final String s2, final String s3, final int n, final rf8 rf8) {
        this("", "", "");
    }
    
    public static final class a
    {
    }
}
