import android.view.ViewManager;
import android.widget.CompoundButton;
import android.os.Binder;
import android.view.View$OnTouchListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.content.Intent;
import java.util.ConcurrentModificationException;
import java.util.Collection;
import java.util.List;
import android.widget.FrameLayout;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0p extends Service
{
    public final a C0;
    public final rd6 D0;
    public FrameLayout E0;
    public q0p F0;
    public y0p G0;
    
    public n0p() {
        this.C0 = new a();
        this.D0 = new rd6();
    }
    
    public final List<cb8> a() {
        synchronized (this) {
            final ag8 f = cb8.f;
            final List a = rth.a(0);
            final List a2 = rth.a(0);
            try {
                a.addAll((Collection)f);
                if (((CompoundButton)this.G0.g).isChecked()) {
                    a2.addAll(((e5e)c6e.e((Iterable)a, (otk)l0p.d)).t3());
                }
                else if (((CompoundButton)this.G0.f).isChecked()) {
                    a2.addAll(((e5e)c6e.e((Iterable)a, (otk)m0p.d)).t3());
                }
                else {
                    a2.addAll(a);
                }
                return a2;
            }
            catch (final ConcurrentModificationException ex) {
                return null;
            }
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.C0;
    }
    
    public final void onCreate() {
        super.onCreate();
        int n;
        if (Build$VERSION.SDK_INT >= 26) {
            n = 2038;
        }
        else {
            n = 2003;
        }
        final WindowManager windowManager = (WindowManager)((Context)this).getSystemService("window");
        pf8.r(windowManager);
        final WindowManager windowManager2 = windowManager;
        final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(-1, (int)(windowManager2.getDefaultDisplay().getHeight() * 0.4), n, 8, -3);
        final FrameLayout e0 = new FrameLayout((Context)this);
        this.E0 = e0;
        windowManager$LayoutParams.gravity = 8388659;
        ((ViewManager)windowManager2).addView((View)e0, (ViewGroup$LayoutParams)windowManager$LayoutParams);
        this.G0 = new y0p((Context)this, (ViewGroup)LayoutInflater.from((Context)this).inflate(2131625619, (ViewGroup)this.E0));
        final q0p q0p = new q0p((Context)this);
        this.F0 = q0p;
        this.G0.c.setAdapter((RecyclerView$e)q0p);
        this.F0.C((List)this.a());
        this.D0.a(((b5j)cb8.g).observeOn(h6q.L()).subscribeOn(yvo.c()).subscribe((fk6)new i0p((Object)this, 0)));
        this.D0.a(asy.q((View)this.G0.g).subscribe((fk6)new k0p((Object)this, 0)));
        this.D0.a(asy.q((View)this.G0.f).subscribe((fk6)new j0p((Object)this, 0)));
        final y0p g0 = this.G0;
        ((View)g0.e).setOnClickListener((View$OnClickListener)new t0p((Object)this.F0, 0));
        ((View)g0.d).setOnClickListener((View$OnClickListener)new u0p((Object)g0, 0));
        ((CompoundButton)g0.g).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new v0p((Object)g0, 0));
        ((CompoundButton)g0.f).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new w0p((Object)g0, 0));
        ((View)g0.b).setOnTouchListener((View$OnTouchListener)new x0p(g0, windowManager$LayoutParams, windowManager2));
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (this.E0 != null) {
            final WindowManager windowManager = (WindowManager)((Context)this).getSystemService("window");
            pf8.r(windowManager);
            ((ViewManager)windowManager).removeView((View)this.E0);
        }
        this.D0.dispose();
    }
    
    public final class a extends Binder
    {
        public a(final n0p n0p) {
        }
    }
}
