// 
// Decompiled by Procyon v0.6.0
// 

public enum omx
{
    public static final a Companion;
    
    G0("auth"), 
    H0("auth_ephemeral"), 
    I0("full_screen");
    
    public static final omx[] J0;
    public final String F0;
    
    static {
        Companion = new a();
        final rx6$h a = rx6.a;
    }
    
    public omx(final String f0) {
        this.F0 = f0;
    }
    
    public static final class a
    {
    }
}
