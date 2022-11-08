import android.app.Fragment;
import android.app.FragmentManager;
import android.app.Activity;
import android.content.Context;
import android.app.AlertDialog$Builder;
import java.util.Objects;
import android.os.Bundle;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t8a extends DialogFragment
{
    public Dialog C0;
    public DialogInterface$OnCancelListener D0;
    public AlertDialog E0;
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener d0 = this.D0;
        if (d0 != null) {
            d0.onCancel(dialogInterface);
        }
    }
    
    public final Dialog onCreateDialog(final Bundle bundle) {
        Object o;
        if ((o = this.C0) == null) {
            this.setShowsDialog(false);
            if (this.E0 == null) {
                final Activity activity = ((Fragment)this).getActivity();
                Objects.requireNonNull(activity, "null reference");
                this.E0 = new AlertDialog$Builder((Context)activity).create();
            }
            o = this.E0;
        }
        return (Dialog)o;
    }
    
    public final void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
