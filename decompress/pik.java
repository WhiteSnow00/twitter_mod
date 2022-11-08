import android.os.Process;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pik
{
    public static final Map<String, Map<String, Integer>> a;
    
    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        pik.a = new HashMap();
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String.valueOf(sb.toString()).concat("PlayCoreVersion");
    }
}
