import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c3y
{
    public static final ExecutorService a;
    
    static {
        a = eg8.Q0.w(2, (ThreadFactory)new o3j("GAC_Executor"));
    }
}
