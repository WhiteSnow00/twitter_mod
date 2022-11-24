import java.util.Set;
import java.lang.ref.ReferenceQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyy implements k26, wzt
{
    public static final eyy F0;
    public static final eyy G0;
    
    static {
        F0 = new eyy();
        G0 = new eyy();
    }
    
    public Object apply(final Object o) {
        return o;
    }
    
    public Object m(final e26 e26) {
        final tc4 tc4 = new tc4();
        tc4.b.add(new oty((Object)tc4, (ReferenceQueue)tc4.a, (Set)tc4.b));
        final Thread thread = new Thread((Runnable)new txz((Object)tc4.a, (Object)tc4.b, 3), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return tc4;
    }
}
