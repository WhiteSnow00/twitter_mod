import android.content.Context;
import android.app.Activity;
import android.content.Intent;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public class vp2 implements up2
{
    public final WeakReference<gob> a;
    public final fxe<z9i> b;
    public final kn c;
    
    public vp2(final gob gob, final fxe<z9i> b, final kn c) {
        this.a = new WeakReference<gob>(gob);
        this.b = b;
        this.c = c;
    }
    
    public final void a(final WebSettings webSettings) {
        final gob gob = this.a.get();
        if (gob != null) {
            rp2.I(webSettings, ((Context)gob).getResources());
        }
    }
    
    public final void b(final String title) {
        ((z9i)this.b.get()).setTitle((CharSequence)title);
    }
    
    public void c(final String s) {
        ((z9i)this.b.get()).a((CharSequence)s);
    }
    
    public final void d() {
        this.c.a();
    }
    
    public final void e() {
        ((z9i)this.b.get()).setTitle(2131954815);
    }
    
    public final void f(final Intent intent) {
        final Activity activity = this.a.get();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }
    
    public final boolean g() {
        final Activity activity = this.a.get();
        return activity != null && ((Context)activity).getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }
    
    public final void terminate() {
        final Activity activity = this.a.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
