import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oo extends ste implements nsb<String>
{
    public static final oo D0;
    
    static {
        D0 = new oo();
    }
    
    public oo() {
        super(0);
    }
    
    public final Object invoke() {
        return UUID.randomUUID().toString();
    }
}
