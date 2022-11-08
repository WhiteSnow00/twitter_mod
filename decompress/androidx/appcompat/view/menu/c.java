// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.DialogInterface$OnKeyListener;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.e$a;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

public final class c implements i, AdapterView$OnItemClickListener
{
    public Context C0;
    public LayoutInflater D0;
    public e E0;
    public ExpandedMenuView F0;
    public i$a G0;
    public c.c$a H0;
    
    public c(final Context c0) {
        this.C0 = c0;
        this.D0 = LayoutInflater.from(c0);
    }
    
    public final void a(final e e, final boolean b) {
        final i$a g0 = this.G0;
        if (g0 != null) {
            g0.a(e, b);
        }
    }
    
    public final void b(final i$a g0) {
        this.G0 = g0;
    }
    
    public final boolean c(final g g) {
        return false;
    }
    
    public final void d() {
        final c.c$a h0 = this.H0;
        if (h0 != null) {
            h0.notifyDataSetChanged();
        }
    }
    
    public final boolean e(final l l) {
        if (!((e)l).hasVisibleItems()) {
            return false;
        }
        final f onDismissListener = new f((e)l);
        final e$a e$a = new e$a(((e)l).a);
        final c e0 = new c(e$a.getContext());
        onDismissListener.E0 = e0;
        e0.G0 = (i$a)onDismissListener;
        onDismissListener.C0.b((i)e0);
        e$a.a(onDismissListener.E0.i(), (DialogInterface$OnClickListener)onDismissListener);
        final View o = ((e)l).o;
        if (o != null) {
            e$a.a.f = o;
        }
        else {
            e$a.a.d = ((e)l).n;
            e$a.setTitle(((e)l).m);
        }
        e$a.a.q = (DialogInterface$OnKeyListener)onDismissListener;
        ((Dialog)(onDismissListener.D0 = e$a.create())).setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        final WindowManager$LayoutParams attributes = ((Dialog)onDismissListener.D0).getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        ((Dialog)onDismissListener.D0).show();
        final i$a g0 = this.G0;
        if (g0 != null) {
            g0.b((e)l);
        }
        return true;
    }
    
    public final boolean f(final g g) {
        return false;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final void h(final Context c0, final e e0) {
        if (this.C0 != null) {
            this.C0 = c0;
            if (this.D0 == null) {
                this.D0 = LayoutInflater.from(c0);
            }
        }
        this.E0 = e0;
        final c.c$a h0 = this.H0;
        if (h0 != null) {
            h0.notifyDataSetChanged();
        }
    }
    
    public final ListAdapter i() {
        if (this.H0 == null) {
            this.H0 = new c.c$a(this);
        }
        return (ListAdapter)this.H0;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.E0.t((MenuItem)this.H0.d(n), (i)this, 0);
    }
}
