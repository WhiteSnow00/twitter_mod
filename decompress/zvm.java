// 
// Decompiled by Procyon v0.6.0
// 

public enum zvm
{
    public static final a Companion;
    
    D0("Subscribed"), 
    E0("Unconfirmed"), 
    F0("Unsubscribed"), 
    G0("UNKNOWN__");
    
    public final String C0;
    
    static {
        Companion = new a();
        tdy.v0((Object[])new String[] { "Subscribed", "Unconfirmed", "Unsubscribed" });
    }
    
    public zvm(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
    }
}
