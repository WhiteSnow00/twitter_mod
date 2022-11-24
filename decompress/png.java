import androidx.fragment.app.Fragment;
import android.view.View;
import com.google.android.material.datepicker.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class png extends wf
{
    public final c d;
    
    public png(final c d) {
        this.d = d;
    }
    
    @Override
    public final void d(final View view, final ng ng) {
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        String s;
        if (this.d.M1.getVisibility() == 0) {
            s = ((Fragment)this.d).W0(2131955204);
        }
        else {
            s = ((Fragment)this.d).W0(2131955202);
        }
        ng.O((CharSequence)s);
    }
}
