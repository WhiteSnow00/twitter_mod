import com.twitter.ui.user.VideoAttributionUserView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.animation.Interpolator;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.LandscapeAwareAspectRatioFrameLayout;
import android.content.Context;
import android.view.ViewStub;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "CheckResult" })
public final class qww
{
    public qww.qww$b a;
    public final ViewStub b;
    public final gmv c;
    public final Context d;
    public final z19 e;
    public final cf4 f;
    public final boolean g;
    public final LandscapeAwareAspectRatioFrameLayout h;
    public final m29 i;
    public View$OnClickListener j;
    public View k;
    public boolean l;
    
    public qww(final Context d, final View view, final LandscapeAwareAspectRatioFrameLayout h, final gmv c, final z19 e, final cf4 f, final int layoutResource) {
        this.i = new m29();
        this.d = d;
        this.h = h;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = (dcs.A() || e instanceof b29);
        final ViewStub viewStub = (ViewStub)view.findViewById(2131432544);
        if (viewStub != null) {
            viewStub.setLayoutResource(layoutResource);
        }
        this.a = new qww.qww$b(view, e);
        this.b = (ViewStub)view.findViewById(2131432449);
        ((n9q)((wax)this.a).d).G((fk6)new k0p((Object)this, 3), (fk6)jvb.e);
    }
    
    public static void d(final View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }
    
    public static void e(final View... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            d(array[i]);
        }
    }
    
    public static void f(final View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }
    
    public final void a(final View view) {
        if (view != null) {
            if (this.g) {
                view.clearAnimation();
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
            else {
                ic0.b(view, 400, (Interpolator)null, 0.0f, 1.0f);
            }
        }
    }
    
    public final void b(final View view) {
        if (view != null) {
            if (this.g) {
                view.clearAnimation();
                view.setAlpha(1.0f);
                view.setVisibility(4);
            }
            else {
                ic0.i(view, 400, (Interpolator)null, 4);
            }
        }
    }
    
    public final n9q<a> c() {
        rqu.Q("VideoChinViewDelegate#inflateStubIfNeeded", (otb)new x0x((Object)this, 1));
        return (n9q<a>)((wax)this.a).d;
    }
    
    public static final class a
    {
        public final View a;
        public final qww$h b;
        public final qww$d c;
        public final qww$f d;
        public final k9q<TextView> e;
        public final LinearLayout f;
        public final TextView g;
        public final View h;
        
        public a(final View a, final qww$h b, final qww$d c, final qww$f d, final k9q e, final TextView g, final LinearLayout f, final View h, final ffa ffa) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.g = g;
            this.e = (k9q<TextView>)e;
            this.f = f;
            this.h = h;
        }
    }
    
    public static final class c
    {
        public final ViewGroup a;
        public final TextView b;
        public final TextView c;
        
        public c(final ViewGroup a, final TextView b, final TextView c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class e
    {
        public final TextView a;
        public final TextView b;
        public final View c;
        
        public e(final TextView a, final TextView b, final View c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class g
    {
        public final VideoAttributionUserView a;
        
        public g(final VideoAttributionUserView a) {
            this.a = a;
        }
    }
}
