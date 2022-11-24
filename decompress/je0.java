import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class je0
{
    public static final je0 a;
    
    static {
        a = new je0();
    }
    
    public final String a() {
        final String processName = Application.getProcessName();
        e0e.e((Object)processName, "getProcessName()");
        return processName;
    }
}
