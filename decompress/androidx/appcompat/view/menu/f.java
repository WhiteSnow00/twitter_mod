// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

public final class f implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, i$a
{
    public e C0;
    public androidx.appcompat.app.e D0;
    public c E0;
    
    public f(final e c0) {
        this.C0 = c0;
    }
    
    public final void a(final e e, final boolean b) {
        if (b || e == this.C0) {
            final androidx.appcompat.app.e d0 = this.D0;
            if (d0 != null) {
                d0.dismiss();
            }
        }
    }
    
    public final boolean b(final e e) {
        return false;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.C0.s((MenuItem)((c$a)this.E0.i()).d(n), 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final c e0 = this.E0;
        final e c0 = this.C0;
        final i$a g0 = e0.G0;
        if (g0 != null) {
            g0.a(c0, true);
        }
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        if (n == 82 || n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = ((Dialog)this.D0).getWindow();
                if (window != null) {
                    final View decorView = window.getDecorView();
                    if (decorView != null) {
                        final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                final Window window2 = ((Dialog)this.D0).getWindow();
                if (window2 != null) {
                    final View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.C0.d(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.C0.performShortcut(n, keyEvent, 0);
    }
}
