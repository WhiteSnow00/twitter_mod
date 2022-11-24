import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qh8 implements zzr<l4h>
{
    public static final long a;
    
    static {
        a = TimeUnit.MINUTES.toMillis(5L);
    }
    
    @Override
    public final Object get() {
        final int n = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int n2;
        if (n < 16777216) {
            n2 = 1048576;
        }
        else if (n < 33554432) {
            n2 = 2097152;
        }
        else {
            n2 = 4194304;
        }
        return new l4h(n2, Integer.MAX_VALUE, n2, n2 / 8, qh8.a);
    }
}
