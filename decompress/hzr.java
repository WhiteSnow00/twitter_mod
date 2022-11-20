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

public class hzr extends nv8
{
    public Dialog Q1;
    public DialogInterface$OnCancelListener R1;
    public AlertDialog S1;
    
    public final Dialog a2(final Bundle bundle) {
        Object o;
        if ((o = this.Q1) == null) {
            super.H1 = false;
            if (this.S1 == null) {
                final Context n0 = ((Fragment)this).N0();
                Objects.requireNonNull(n0, "null reference");
                this.S1 = new AlertDialog$Builder(n0).create();
            }
            o = this.S1;
        }
        return (Dialog)o;
    }
    
    public final void e2(final p p2, final String s) {
        super.e2(p2, s);
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener r1 = this.R1;
        if (r1 != null) {
            r1.onCancel(dialogInterface);
        }
    }
}
