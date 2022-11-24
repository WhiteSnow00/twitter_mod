import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import androidx.fragment.app.p;
import android.content.Context;
import android.app.AlertDialog$Builder;
import java.util.Objects;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class d0s extends tw8
{
    public Dialog S1;
    public DialogInterface$OnCancelListener T1;
    public AlertDialog U1;
    
    public final Dialog a2(final Bundle bundle) {
        Object o;
        if ((o = this.S1) == null) {
            super.J1 = false;
            if (this.U1 == null) {
                final Context n0 = ((Fragment)this).N0();
                Objects.requireNonNull(n0, "null reference");
                this.U1 = new AlertDialog$Builder(n0).create();
            }
            o = this.U1;
        }
        return (Dialog)o;
    }
    
    public final void e2(final p p2, final String s) {
        super.e2(p2, s);
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener t1 = this.T1;
        if (t1 != null) {
            t1.onCancel(dialogInterface);
        }
    }
}
