import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lun
{
    public static final long a;
    public static final long b;
    public static final long c;
    
    static {
        final TimeUnit seconds = TimeUnit.SECONDS;
        a = seconds.toSeconds(3L);
        b = seconds.toMillis(5L);
        c = TimeUnit.MINUTES.toMillis(5L);
    }
}
