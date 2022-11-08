import android.content.Intent;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public interface jbf
{
    void a(final String p0, final LifecycleCallback p1);
    
     <T extends LifecycleCallback> T l(final String p0, final Class<T> p1);
    
    Activity p0();
    
    void startActivityForResult(final Intent p0, final int p1);
}
