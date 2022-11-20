import androidx.fragment.app.s;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpp implements ym6
{
    public final LayoutInflater D0;
    public final p E0;
    public final obi<?> F0;
    
    public cpp(final LayoutInflater d0, final p e0, final obi<?> f0) {
        czd.f((Object)d0, "inflater");
        czd.f((Object)f0, "navigator");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final pm6 c() {
        final View inflate = this.D0.inflate(2131625656, (ViewGroup)null);
        final a a = new a(this.E0);
        ((s)a).g(2131431156, (Fragment)new bpp(), (String)null);
        a.c();
        ((View)inflate.findViewById(2131431385)).setOnClickListener((View$OnClickListener)new ji2((Object)this, 16));
        return pm6.Companion.a(inflate);
    }
}
