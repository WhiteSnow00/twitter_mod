import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ttm
{
    public static final ttm c;
    public final Intent a;
    public final Bundle b;
    
    static {
        c = new ttm(new Intent());
    }
    
    public ttm(final Intent a) {
        this.a = a;
        Bundle extras = a.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        this.b = extras;
    }
    
    public ttm(final Fragment fragment) {
        final dob l0 = fragment.L0();
        vmw.g((Object)l0);
        this.a = ((Activity)l0).getIntent();
        Bundle l2 = fragment.L0;
        if (l2 == null) {
            l2 = new Bundle();
        }
        this.b = l2;
    }
}
