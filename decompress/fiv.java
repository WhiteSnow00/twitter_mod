// 
// Decompiled by Procyon v0.6.0
// 

public enum fiv
{
    G0("sms"), 
    H0("totp"), 
    I0("u2fSecurityKey");
    
    public static final fiv[] J0;
    public final String F0;
    
    public fiv(final String f0) {
        this.F0 = f0;
    }
    
    @Override
    public final String toString() {
        return this.F0;
    }
}
