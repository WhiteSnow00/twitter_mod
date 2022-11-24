import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rdi<OBJECT, ERROR> extends ed<OBJECT, ERROR>
{
    public static final int j;
    
    static {
        j = (int)TimeUnit.MINUTES.toMillis(1L);
    }
    
    public rdi() {
        super(500, 500, rdi.j, Integer.MAX_VALUE);
    }
    
    public final int e() {
        return super.a;
    }
}
