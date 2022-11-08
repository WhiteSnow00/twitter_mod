import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2a implements is2
{
    public static final e2a C0;
    public static final long D0;
    public static final tve E0;
    public static final ep8 F0;
    
    static {
        C0 = new e2a();
        Objects.requireNonNull(mcq.Companion);
        D0 = mcq.c;
        E0 = tve.C0;
        F0 = new ep8(1.0f, 1.0f);
    }
    
    public final long c() {
        return e2a.D0;
    }
    
    public final dp8 getDensity() {
        return (dp8)e2a.F0;
    }
    
    public final tve getLayoutDirection() {
        return e2a.E0;
    }
}
