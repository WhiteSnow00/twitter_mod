import android.widget.TextView;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public class jdj extends ftr implements p0c, q0c
{
    public final p92 F0;
    
    public jdj(final LayoutInflater layoutInflater, final id6 id6, final int n) {
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)id6, "compositeRichTextProcessor");
        final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
        czd.e((Object)inflate, "layoutInflater.inflate(layout, null)");
        super(inflate);
        ((o92)(this.F0 = new p92(this.getHeldView()))).r0((CharSequence)null);
    }
    
    public final void F(final String s, final View$OnClickListener view$OnClickListener) {
        ((art)this.F0).m0(true);
        ((art)this.F0).o0((CharSequence)s);
        ((art)this.F0).n0(view$OnClickListener);
    }
    
    public final void Y(final boolean enabled) {
        ((o92)this.F0).E0.setEnabled(enabled);
    }
    
    public final void e(final CharSequence text) {
        final p92 f0 = this.F0;
        Objects.requireNonNull(f0);
        final TextView g0 = f0.G0;
        if (g0 != null) {
            g0.setText(text);
        }
        final TextView g2 = f0.G0;
        if (g2 != null) {
            ((View)g2).setVisibility(0);
        }
    }
    
    @Override
    public final int l0() {
        return 0;
    }
}
