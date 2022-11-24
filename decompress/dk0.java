import android.os.Bundle;
import android.view.Window$Callback;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import androidx.appcompat.app.g;
import android.content.Context;
import androidx.appcompat.app.AppCompatDelegateImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public class dk0 extends g26 implements tj0
{
    public AppCompatDelegateImpl H0;
    public final ck0 I0;
    
    public dk0(final Context context, int h) {
        super(context, h(context, h));
        this.I0 = new ck0(this);
        final g g = this.g();
        h = h(context, h);
        ((AppCompatDelegateImpl)g).t1 = h;
        g.m();
    }
    
    public static int h(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969200, typedValue, true);
            resourceId = typedValue.resourceId;
        }
        return resourceId;
    }
    
    @Override
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g().c(view, viewGroup$LayoutParams);
    }
    
    @Override
    public final void d() {
    }
    
    public final void dismiss() {
        super.dismiss();
        this.g().n();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return iqe.b((iqe$a)this.I0, this.getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    @Override
    public final void f() {
    }
    
    public final <T extends View> T findViewById(final int n) {
        return this.g().f(n);
    }
    
    public final g g() {
        if (this.H0 == null) {
            final int f0 = g.F0;
            this.H0 = new AppCompatDelegateImpl(this.getContext(), this.getWindow(), (tj0)this, (Object)this);
        }
        return (g)this.H0;
    }
    
    public final boolean i(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final void invalidateOptionsMenu() {
        this.g().k();
    }
    
    public final boolean j() {
        return this.g().s(1);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.g().j();
        super.onCreate(bundle);
        this.g().m();
    }
    
    @Override
    public final void onStop() {
        super.onStop();
        this.g().q();
    }
    
    @Override
    public final void q() {
    }
    
    @Override
    public void setContentView(final int n) {
        this.g().t(n);
    }
    
    @Override
    public void setContentView(final View view) {
        this.g().u(view);
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g().v(view, viewGroup$LayoutParams);
    }
    
    public final void setTitle(final int title) {
        super.setTitle(title);
        this.g().y(this.getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.g().y(title);
    }
}
