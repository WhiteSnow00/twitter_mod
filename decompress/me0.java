import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class me0
{
    public static final me0 a;
    
    static {
        a = new me0();
    }
    
    public final String a() {
        final String processName = Application.getProcessName();
        zzd.e((Object)processName, "getProcessName()");
        return processName;
    }
}
