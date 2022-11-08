import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adn extends gue implements rtb<idn, oyv>
{
    public final /* synthetic */ tcn C0;
    
    public adn(final tcn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final idn idn = (idn)o;
        zzd.f((Object)idn, "$this$distinct");
        final tcn c0 = this.C0;
        if (idn.b == ton.D0) {
            ((View)c0.W0).setVisibility(0);
            ((View)c0.V0).setVisibility(8);
            ((View)c0.Y0).setVisibility(0);
            ((View)c0.X0).setVisibility(8);
            final tcn$a companion = tcn.Companion;
            final RecyclerView k0 = c0.K0;
            final int dimensionPixelSize = c0.Z0.getDimensionPixelSize(2131167300);
            Objects.requireNonNull(companion);
            final ViewGroup$LayoutParams layoutParams = ((View)k0).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = dimensionPixelSize;
                ((View)k0).setLayoutParams(layoutParams);
            }
            c0.a((View)c0.W0);
        }
        else {
            ((View)c0.W0).setVisibility(8);
            ((View)c0.V0).setVisibility(0);
            ((View)c0.Y0).setVisibility(8);
            ((View)c0.X0).setVisibility(0);
            final tcn$a companion2 = tcn.Companion;
            final RecyclerView k2 = c0.K0;
            Objects.requireNonNull(companion2);
            final ViewGroup$LayoutParams layoutParams2 = ((View)k2).getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                ((View)k2).setLayoutParams(layoutParams2);
            }
            c0.a((View)c0.V0);
        }
        return oyv.a;
    }
}
