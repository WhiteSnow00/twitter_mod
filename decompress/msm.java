import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msm
{
    public static final msm c;
    public final Intent a;
    public final Bundle b;
    
    static {
        c = new msm(new Intent());
    }
    
    public msm(final Intent a) {
        this.a = a;
        Bundle extras = a.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        this.b = extras;
    }
    
    public msm(final Fragment fragment) {
        final gob l0 = fragment.L0();
        pf8.r(l0);
        this.a = ((Activity)l0).getIntent();
        Bundle i0 = fragment.I0;
        if (i0 == null) {
            i0 = new Bundle();
        }
        this.b = i0;
    }
}
