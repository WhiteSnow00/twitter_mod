import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p$k;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpb extends p$k
{
    public final Fragment a;
    public final FrameLayout b;
    public final FragmentStateAdapter c;
    
    public kpb(final FragmentStateAdapter c, final Fragment a, final FrameLayout b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void i(final p p4, final Fragment fragment, final View view, final Bundle bundle) {
        if (fragment == this.a) {
            p4.n0((p$k)this);
            this.c.C(view, this.b);
        }
    }
}
