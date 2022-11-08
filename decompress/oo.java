import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oo extends gue implements otb<String>
{
    public static final oo C0;
    
    static {
        C0 = new oo();
    }
    
    public oo() {
        super(0);
    }
    
    public final Object invoke() {
        return UUID.randomUUID().toString();
    }
}
