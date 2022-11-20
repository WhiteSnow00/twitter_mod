// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.account;

import androidx.appcompat.app.e$a;
import android.view.View;
import androidx.appcompat.app.e;
import java.util.concurrent.Callable;
import android.widget.Button;
import androidx.appcompat.app.AlertController;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import java.util.Objects;
import com.twitter.app.account.di.RemoveAccountDialogViewGraph;
import android.app.Dialog;

public class RemoveAccountDialogActivity extends vmd
{
    public final Dialog onCreateDialog(final int n) {
        final cem f1 = ((RemoveAccountDialogViewGraph)w1e.h((x1e)this)).f1();
        Objects.requireNonNull(f1);
        final aem aem = new aem((Object)f1, 0);
        Object o;
        if (n != 1) {
            if (n != 2) {
                o = null;
                if (n != 3) {
                    if (n == 4) {
                        final or2 or2 = new or2((Object)f1, 1);
                        final pmg pmg = new pmg((Context)((u9)f1).E0, 0);
                        pmg.s(2131953584);
                        pmg.m(2131954309);
                        o = pmg.p(2131952819, (DialogInterface$OnClickListener)or2).n(17039360, (DialogInterface$OnClickListener)null).create();
                        ((Dialog)o).setOnDismissListener((DialogInterface$OnDismissListener)aem);
                        ((Dialog)o).show();
                        final AlertController h0 = ((e)o).H0;
                        Objects.requireNonNull(h0);
                        final Button k = h0.k;
                        ((View)k).setEnabled(false);
                        f.a(rw0.k(5000L, (oj)new wp1((Object)k, 7)), (z9a)f1.W0);
                    }
                }
                else {
                    final pmg pmg2 = new pmg((Context)((u9)f1).E0, 0);
                    pmg2.s(2131954308);
                    ((e$a)pmg2).a.g = "";
                    o = pmg2.p(2131954308, (DialogInterface$OnClickListener)new nr2((Object)f1, 1)).n(17039360, (DialogInterface$OnClickListener)null).create();
                    ((Dialog)o).setOnDismissListener((DialogInterface$OnDismissListener)aem);
                    ((Dialog)o).show();
                }
            }
            else {
                o = new ProgressDialog((Context)((u9)f1).E0);
                ((ProgressDialog)o).setProgressStyle(0);
                ((ProgressDialog)o).setMessage(((u9)f1).J4(2131954316));
                ((ProgressDialog)o).setIndeterminate(true);
                ((Dialog)o).setCancelable(false);
            }
        }
        else {
            o = new ProgressDialog((Context)((u9)f1).E0);
            ((ProgressDialog)o).setProgressStyle(0);
            ((ProgressDialog)o).setMessage(((u9)f1).J4(2131954307));
            ((ProgressDialog)o).setIndeterminate(true);
            ((Dialog)o).setCancelable(false);
        }
        return (Dialog)o;
    }
    
    public final void onPrepareDialog(int r0, final Dialog dialog) {
        final cem f1 = ((RemoveAccountDialogViewGraph)((x9)this.b1()).n()).f1();
        Objects.requireNonNull(f1);
        if (r0 == 3) {
            final boolean c = dbg.c(f1.U0);
            final long id = f1.U0.getId();
            r0 = i9k.R0;
            f.a(eaq.t((Callable)new bem(((i6f)((b5j)br0.a()).B((Class)i6f.class)).j0(), id)).I(owo.c()).y(gmw.H()).G((lj6)new zdm(f1, c, dialog), (lj6)jub.e), (z9a)f1.W0);
        }
    }
}
