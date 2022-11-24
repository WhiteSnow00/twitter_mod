import android.view.MenuInflater;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.appcompat.widget.ActionBarContextView;
import android.content.Context;
import androidx.appcompat.view.menu.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6r extends al implements a
{
    public Context H0;
    public ActionBarContextView I0;
    public al$a J0;
    public WeakReference<View> K0;
    public boolean L0;
    public e M0;
    
    public z6r(final Context h0, final ActionBarContextView i0, final al$a j0) {
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        final e m0 = new e(((View)i0).getContext());
        m0.l = 1;
        this.M0 = m0;
        m0.e = this;
    }
    
    public final boolean a(final e e, final MenuItem menuItem) {
        return this.J0.a((al)this, menuItem);
    }
    
    public final void b(final e e) {
        this.i();
        final ActionMenuPresenter i0 = ((m9)this.I0).I0;
        if (i0 != null) {
            i0.m();
        }
    }
    
    public final void c() {
        if (this.L0) {
            return;
        }
        this.L0 = true;
        this.J0.b((al)this);
    }
    
    public final View d() {
        final WeakReference<View> k0 = this.K0;
        View view;
        if (k0 != null) {
            view = k0.get();
        }
        else {
            view = null;
        }
        return view;
    }
    
    public final Menu e() {
        return (Menu)this.M0;
    }
    
    public final MenuInflater f() {
        return (MenuInflater)new f0s(((View)this.I0).getContext());
    }
    
    public final CharSequence g() {
        return this.I0.getSubtitle();
    }
    
    public final CharSequence h() {
        return this.I0.getTitle();
    }
    
    public final void i() {
        this.J0.d((al)this, (Menu)this.M0);
    }
    
    public final boolean j() {
        return this.I0.X0;
    }
    
    public final void k(final View customView) {
        this.I0.setCustomView(customView);
        WeakReference k0;
        if (customView != null) {
            k0 = new WeakReference((T)customView);
        }
        else {
            k0 = null;
        }
        this.K0 = k0;
    }
    
    public final void l(final int n) {
        this.I0.setSubtitle((CharSequence)this.H0.getString(n));
    }
    
    public final void m(final CharSequence subtitle) {
        this.I0.setSubtitle(subtitle);
    }
    
    public final void n(final int n) {
        this.o(this.H0.getString(n));
    }
    
    public final void o(final CharSequence title) {
        this.I0.setTitle(title);
    }
    
    public final void p(final boolean b) {
        super.G0 = b;
        this.I0.setTitleOptional(b);
    }
}
