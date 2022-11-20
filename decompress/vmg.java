import androidx.fragment.app.Fragment;
import android.view.View;
import com.google.android.material.datepicker.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vmg extends vf
{
    public final c d;
    
    public vmg(final c d) {
        this.d = d;
    }
    
    public final void d(final View view, final mg mg) {
        super.a.onInitializeAccessibilityNodeInfo(view, mg.a);
        String s;
        if (this.d.K1.getVisibility() == 0) {
            s = ((Fragment)this.d).W0(2131955204);
        }
        else {
            s = ((Fragment)this.d).W0(2131955202);
        }
        mg.O((CharSequence)s);
    }
}
