import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.content.DialogInterface;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lkyk;", "Le92;", "<init>", "()V", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class kyk extends e92
{
    public final void onShow(final DialogInterface dialogInterface) {
        czd.f((Object)dialogInterface, "dialogInterface");
        super.onShow(dialogInterface);
        final Dialog l1 = ((nv8)this).L1;
        if (l1 != null) {
            final FrameLayout frameLayout = (FrameLayout)l1.findViewById(2131428647);
            if (frameLayout != null) {
                BottomSheetBehavior.y((View)frameLayout).H(3);
            }
        }
    }
}
