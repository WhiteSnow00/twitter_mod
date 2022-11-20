import android.os.PowerManager$WakeLock;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class iix extends BroadcastReceiver
{
    public static final SparseArray<PowerManager$WakeLock> D0;
    public static int E0;
    
    static {
        D0 = new SparseArray();
        iix.E0 = 1;
    }
}
