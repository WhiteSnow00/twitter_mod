import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ie0
{
    public static final ie0 a;
    
    static {
        a = new ie0();
    }
    
    public final String a() {
        final String processName = Application.getProcessName();
        czd.e((Object)processName, "getProcessName()");
        return processName;
    }
}
