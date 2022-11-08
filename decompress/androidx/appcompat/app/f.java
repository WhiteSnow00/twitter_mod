// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.os.Bundle;
import android.view.Menu;
import android.content.ComponentName;
import android.view.MenuItem;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.MenuInflater;
import android.view.KeyEvent;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.content.Context;

public class f extends gob implements xj0
{
    public AppCompatDelegateImpl U0;
    
    public f() {
        super.G0.b.b("androidx:appcompat", (wso$c)new tj0(this));
        this.G((dhj)new uj0(this));
    }
    
    private void I() {
        rp2.J0(((Activity)this).getWindow().getDecorView(), (lbf)this);
        oyz.Z(((Activity)this).getWindow().getDecorView(), (b9x)this);
        kbx.b(((Activity)this).getWindow().getDecorView(), (yso)this);
    }
    
    public final g T() {
        if (this.U0 == null) {
            final int c0 = g.C0;
            this.U0 = new AppCompatDelegateImpl((Context)this, null, this, this);
        }
        return this.U0;
    }
    
    public final androidx.appcompat.app.a U() {
        return this.T().i();
    }
    
    public final Intent a0() {
        return bai.a((Activity)this);
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.I();
        this.T().c(view, viewGroup$LayoutParams);
    }
    
    public void attachBaseContext(final Context context) {
        super.attachBaseContext(this.T().e(context));
    }
    
    public final void b0(final Toolbar toolbar) {
        this.T().w(toolbar);
    }
    
    public final void closeOptionsMenu() {
        final androidx.appcompat.app.a u = this.U();
        if (((Activity)this).getWindow().hasFeature(0) && (u == null || !u.a())) {
            super.closeOptionsMenu();
        }
    }
    
    @Override
    public final void d() {
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final androidx.appcompat.app.a u = this.U();
        return (keyCode == 82 && u != null && u.j(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    public final void f() {
    }
    
    public final <T extends View> T findViewById(final int n) {
        return (T)this.T().f(n);
    }
    
    public final MenuInflater getMenuInflater() {
        return this.T().h();
    }
    
    public final Resources getResources() {
        final int a = vow.a;
        return super.getResources();
    }
    
    public final void invalidateOptionsMenu() {
        this.T().k();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T().l(configuration);
    }
    
    public final void onContentChanged() {
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.T().n();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            final Window window = ((Activity)this).getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
                final boolean b = true;
                return b || super.onKeyDown(n, keyEvent);
            }
        }
        final boolean b = false;
        return b || super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public final boolean onMenuItemSelected(int c, final MenuItem menuItem) {
        final boolean onMenuItemSelected = super.onMenuItemSelected(c, menuItem);
        boolean b = true;
        if (onMenuItemSelected) {
            return true;
        }
        final androidx.appcompat.app.a u = this.U();
        if (menuItem.getItemId() == 16908332 && u != null && (u.d() & 0x4) != 0x0) {
            final Intent a = bai.a((Activity)this);
            if (a != null) {
                if (bai$a.c((Activity)this, a)) {
                    final wbs wbs = new wbs((Context)this);
                    Intent intent;
                    if ((intent = this.a0()) == null) {
                        intent = bai.a((Activity)this);
                    }
                    if (intent != null) {
                        ComponentName componentName;
                        if ((componentName = intent.getComponent()) == null) {
                            componentName = intent.resolveActivity(wbs.D0.getPackageManager());
                        }
                        wbs.i(componentName);
                        wbs.e(intent);
                    }
                    wbs.n();
                    try {
                        c = hn.c;
                        hn$b.a((Activity)this);
                    }
                    catch (final IllegalStateException ex) {
                        ((Activity)this).finish();
                    }
                }
                else {
                    bai$a.b((Activity)this, a);
                }
            }
            else {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    public final void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    public final void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        ((AppCompatDelegateImpl)this.T()).J();
    }
    
    @Override
    public final void onPostResume() {
        super.onPostResume();
        this.T().o();
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.T().p();
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.T().q();
    }
    
    public void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.T().y(charSequence);
    }
    
    public final void openOptionsMenu() {
        final androidx.appcompat.app.a u = this.U();
        if (((Activity)this).getWindow().hasFeature(0) && (u == null || !u.k())) {
            super.openOptionsMenu();
        }
    }
    
    @Override
    public final void s() {
    }
    
    public final void setContentView(final int n) {
        this.I();
        this.T().t(n);
    }
    
    public void setContentView(final View view) {
        this.I();
        this.T().u(view);
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.I();
        this.T().v(view, viewGroup$LayoutParams);
    }
    
    public final void setTheme(final int theme) {
        super.setTheme(theme);
        this.T().x(theme);
    }
}
