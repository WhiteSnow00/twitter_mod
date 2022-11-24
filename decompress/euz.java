import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum euz implements m7z
{
    F0;
    
    public static final AtomicReference<obz> G0;
    public static final euz[] H0;
    
    static {
        G0 = new AtomicReference<obz>(null);
    }
    
    public final obz b() {
        return euz.G0.get();
    }
}
