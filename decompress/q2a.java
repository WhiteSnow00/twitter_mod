import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q2a implements rs2
{
    public static final q2a F0;
    public static final long G0;
    public static final cwe H0;
    public static final sp8 I0;
    
    static {
        F0 = new q2a();
        Objects.requireNonNull(aeq.Companion);
        G0 = aeq.c;
        H0 = cwe.F0;
        I0 = new sp8(1.0f, 1.0f);
    }
    
    public final long c() {
        return q2a.G0;
    }
    
    public final rp8 getDensity() {
        return (rp8)q2a.I0;
    }
    
    public final cwe getLayoutDirection() {
        return q2a.H0;
    }
}
