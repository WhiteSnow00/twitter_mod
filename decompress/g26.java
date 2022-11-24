import androidx.lifecycle.d$b;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.d;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.f;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class g26 extends Dialog implements tbf, lhj
{
    public f F0;
    public final OnBackPressedDispatcher G0;
    
    public g26(final Context context, final int n) {
        e0e.f((Object)context, "context");
        super(context, n);
        this.G0 = new OnBackPressedDispatcher((Runnable)new f26((Object)this, 0));
    }
    
    public static void a(final g26 g26) {
        e0e.f((Object)g26, "this$0");
        g26.onBackPressed();
    }
    
    public final OnBackPressedDispatcher U() {
        return this.G0;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        e0e.f((Object)view, "view");
        this.e();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    public final d b() {
        return (d)this.c();
    }
    
    public final f c() {
        f f0;
        if ((f0 = this.F0) == null) {
            f0 = new f((tbf)this);
            this.F0 = f0;
        }
        return f0;
    }
    
    public final void e() {
        final Window window = this.getWindow();
        e0e.c((Object)window);
        iuk.I0(window.getDecorView(), (tbf)this);
        final Window window2 = this.getWindow();
        e0e.c((Object)window2);
        final View decorView = window2.getDecorView();
        e0e.e((Object)decorView, "window!!.decorView");
        decorView.setTag(2131432603, (Object)this);
    }
    
    public void onBackPressed() {
        this.G0.b();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.c().f(d$b.ON_CREATE);
    }
    
    public void onStart() {
        super.onStart();
        this.c().f(d$b.ON_RESUME);
    }
    
    public void onStop() {
        this.c().f(d$b.ON_DESTROY);
        this.F0 = null;
        super.onStop();
    }
    
    public void setContentView(final int contentView) {
        this.e();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        e0e.f((Object)contentView, "view");
        this.e();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        e0e.f((Object)view, "view");
        this.e();
        super.setContentView(view, viewGroup$LayoutParams);
    }
}
