import android.view.Window;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.app.Dialog;
import android.os.Bundle;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lbfk;", "Le92;", "<init>", "()V", "subsystem.tfa.pinnedreplies.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class bfk extends e92
{
    public final Dialog a2(final Bundle bundle) {
        final Dialog a2 = super.a2(bundle);
        czd.e((Object)a2, "super.onCreateDialog(savedInstanceState)");
        final Window window = a2.getWindow();
        if (window != null) {
            window.clearFlags(65536);
        }
        BottomSheetBehavior.y((View)a2.findViewById(2131428647)).H(3);
        return a2;
    }
}
