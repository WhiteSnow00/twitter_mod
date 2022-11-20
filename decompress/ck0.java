import android.app.Dialog;
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

public class ck0 extends a16 implements tj0
{
    public AppCompatDelegateImpl F0;
    public final bk0 G0;
    
    public ck0(final Context context, int h) {
        super(context, h(context, h));
        this.G0 = new bk0(this);
        final g g = this.g();
        h = h(context, h);
        ((AppCompatDelegateImpl)g).r1 = h;
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
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g().c(view, viewGroup$LayoutParams);
    }
    
    public final void d() {
    }
    
    public final void dismiss() {
        super.dismiss();
        this.g().n();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return lpe.b((lpe$a)this.G0, ((Dialog)this).getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public final void f() {
    }
    
    public final <T extends View> T findViewById(final int n) {
        return (T)this.g().f(n);
    }
    
    public final g g() {
        if (this.F0 == null) {
            final int d0 = g.D0;
            this.F0 = new AppCompatDelegateImpl(((Dialog)this).getContext(), ((Dialog)this).getWindow(), (tj0)this, (Object)this);
        }
        return (g)this.F0;
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
    
    public void onCreate(final Bundle bundle) {
        this.g().j();
        super.onCreate(bundle);
        this.g().m();
    }
    
    public final void onStop() {
        super.onStop();
        this.g().q();
    }
    
    public final void r() {
    }
    
    public void setContentView(final int n) {
        this.g().t(n);
    }
    
    public void setContentView(final View view) {
        this.g().u(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g().v(view, viewGroup$LayoutParams);
    }
    
    public final void setTitle(final int title) {
        super.setTitle(title);
        this.g().y((CharSequence)((Dialog)this).getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.g().y(title);
    }
}
