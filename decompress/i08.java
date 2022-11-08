import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i08 extends gue implements rtb<m08.b, oyv>
{
    public final /* synthetic */ yz7 C0;
    
    public i08(final yz7 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final m08.b b = (m08.b)o;
        zzd.f((Object)b, "$this$distinct");
        final yz7 c0 = this.C0;
        final h28 e = b.e;
        Objects.requireNonNull(c0);
        final int ordinal = ((Enum)e).ordinal();
        int n;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n = 2131953241;
                }
                else {
                    n = 2131953238;
                }
            }
            else {
                n = 2131953242;
            }
        }
        else if (c0.H0) {
            n = 2131953246;
        }
        else {
            n = 2131953245;
        }
        c0.J0.setText((CharSequence)c0.Q0.getString(n));
        final yz7 c2 = this.C0;
        final boolean c3 = b.c;
        c2.E0.g((List)v2a.C0);
        final TextView j0 = c2.J0;
        zzd.e((Object)j0, "unSearchedTextView");
        int visibility;
        if (c3) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)j0).setVisibility(visibility);
        final ViewGroup k0 = c2.K0;
        zzd.e((Object)k0, "noResultsContainer");
        ((View)k0).setVisibility(8);
        return oyv.a;
    }
}
