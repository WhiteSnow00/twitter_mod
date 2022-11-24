import androidx.lifecycle.j;
import android.os.Bundle;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obf
{
    public static AtomicBoolean a;
    
    static {
        obf.a = new AtomicBoolean(false);
    }
    
    public static final class a extends n2a
    {
        @Override
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
            j.c(activity);
        }
        
        @Override
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        @Override
        public void onActivityStopped(final Activity activity) {
        }
    }
}
