// 
// Decompiled by Procyon v0.6.0
// 

public final class j02
{
    public static final int a;
    public static int b;
    public static volatile i02 c;
    
    static {
        final int n = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int a2;
        if (n > 16777216L) {
            a2 = n / 4 * 3;
        }
        else {
            a2 = n / 2;
        }
        a = a2;
        j02.b = 384;
    }
}
