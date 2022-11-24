// 
// Decompiled by Procyon v0.6.0
// 

public class ziz
{
    public static int a(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long b(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
}
