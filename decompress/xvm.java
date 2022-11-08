// 
// Decompiled by Procyon v0.6.0
// 

public enum xvm
{
    public static final a Companion;
    
    D0("UNKNOWN__");
    
    public final String C0;
    
    static {
        Companion = new a();
        tdy.v0((Object[])new String[] { "Android", "DesktopMobile", "DesktopWeb", "Ios", "MobileWeb" });
    }
    
    public xvm(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
    }
}
