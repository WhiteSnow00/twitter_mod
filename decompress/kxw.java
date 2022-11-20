import com.twitter.ui.user.VideoAttributionUserView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Trace;
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
public final class kxw
{
    public kxw.kxw$b a;
    public final ViewStub b;
    public final env c;
    public final Context d;
    public final j19 e;
    public final ee4 f;
    public final boolean g;
    public final LandscapeAwareAspectRatioFrameLayout h;
    public final w19 i;
    public View$OnClickListener j;
    public View k;
    public boolean l;
    
    public kxw(final Context d, final View view, final LandscapeAwareAspectRatioFrameLayout h, final env c, final j19 e, final ee4 f, final int layoutResource) {
        this.i = new w19();
        this.d = d;
        this.h = h;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = (q3j.M() || e instanceof l19);
        final ViewStub viewStub = (ViewStub)view.findViewById(2131432547);
        if (viewStub != null) {
            viewStub.setLayoutResource(layoutResource);
        }
        this.a = new kxw.kxw$b(view, e);
        this.b = (ViewStub)view.findViewById(2131432452);
        ((eaq)((rbx)this.a).d).G((lj6)new z0p((Object)this, 3), (lj6)jub.e);
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
                ec0.b(view, 400, (Interpolator)null, 0.0f, 1.0f);
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
                ec0.i(view, 400, (Interpolator)null, 4);
            }
        }
    }
    
    public final eaq<a> c() {
        try {
            Trace.beginSection("VideoChinViewDelegate#inflateStubIfNeeded");
            ((rbx)this.a).h();
            Trace.endSection();
            return (eaq<a>)((rbx)this.a).d;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public static final class a
    {
        public final View a;
        public final kxw$h b;
        public final kxw$d c;
        public final kxw$f d;
        public final baq<TextView> e;
        public final LinearLayout f;
        public final TextView g;
        public final View h;
        
        public a(final View a, final kxw$h b, final kxw$d c, final kxw$f d, final baq e, final TextView g, final LinearLayout f, final View h, final zjf zjf) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.g = g;
            this.e = (baq<TextView>)e;
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
