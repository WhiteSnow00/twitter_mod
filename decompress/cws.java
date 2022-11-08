import android.app.Activity;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.imagepipeline.request.a$c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.net.Uri;
import android.content.Context;
import com.facebook.imagepipeline.request.a;
import android.widget.ImageView$ScaleType;
import android.view.animation.OvershootInterpolator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cws extends ip
{
    public final gob a;
    public final ViewGroup b;
    public final ji4 c;
    public final jp d;
    public final OvershootInterpolator e;
    public final rd6 f;
    public final ImageView$ScaleType g;
    public final abm h;
    public ip$a i;
    public h88<wi4<ui4>> j;
    public wi4<ui4> k;
    public float l;
    public float m;
    public float n;
    public float o;
    public final t8d$a p;
    public final a q;
    public boolean r;
    public boolean s;
    
    public cws(final gob a, final jp d, final String s, final ncq l, final ncq ncq, final abm h, final ImageView$ScaleType imageView$ScaleType, final ViewGroup b) {
        this.e = new OvershootInterpolator(0.8f);
        this.f = new rd6();
        this.i = (ip$a)gp.b;
        this.a = a;
        this.d = d;
        this.h = h;
        this.g = imageView$ScaleType;
        this.b = b;
        final ji4 c = new ji4((Context)a);
        this.c = c;
        ij1.c(ImageView$ScaleType.FIT_CENTER == imageView$ScaleType || ImageView$ScaleType.CENTER_CROP == imageView$ScaleType, "Unsupported ScaleType");
        ((ImageView)c).setScaleType(imageView$ScaleType);
        final t8d$a d2 = u8d.d(s, ncq, (z5w)null);
        d2.l = l;
        ((vqm$a)d2).e = false;
        final int a2 = w4j.a;
        d2.o = v6d$a.C0;
        this.p = d2;
        final ImageRequestBuilder c2 = ImageRequestBuilder.c(Uri.parse(s));
        c2.d = trb.a;
        this.q = c2.a();
        this.j = this.a();
    }
    
    public final h88<wi4<ui4>> a() {
        return urb.a().c().a(this.q, new crb(new t8d(this.p)), a$c.F0, null, null);
    }
    
    public final void b() {
        wi4.e((wi4)this.k);
        this.k = null;
        this.f.e();
        this.j.close();
    }
    
    public final void c(final boolean b) {
        if (this.j.isClosed()) {
            this.j = this.a();
        }
        if (this.k == null) {
            this.k = this.j.d();
        }
        final wi4<ui4> k = this.k;
        final int n = 1;
        int n2 = 0;
        Label_0341: {
            if (k != null) {
                final ui4 ui4 = (ui4)k.h();
                if (ui4 instanceof ti4) {
                    final Bitmap e = ((ti4)ui4).e();
                    if (b && !this.s) {
                        this.f.a(asy.s0((View)this.b, (otb)o1x.E0).take(1L).subscribe((fk6)new nlp((Object)this, (Object)e, 3)));
                        n2 = n;
                        break Label_0341;
                    }
                    n2 = n;
                    if (b) {
                        break Label_0341;
                    }
                    n2 = n;
                    if (!this.r) {
                        this.r = true;
                        ((AppCompatImageView)this.c).setImageBitmap(e);
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
                        ofFloat.setDuration(300L);
                        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new bb0((Object)this, 1));
                        ofFloat.start();
                        final bax c = p5x.c((View)this.c);
                        c.n();
                        c.e(300L);
                        c.c(this.l);
                        c.d(this.m);
                        c.k(this.n);
                        c.l(this.o);
                        c.f((Interpolator)this.e);
                        c.m((Runnable)new h16((Object)this, 15));
                        final ji4 c2 = this.c;
                        c2.I0 = true;
                        c2.M0 = true;
                        c2.J0 = false;
                        ObjectAnimator.ofFloat((Object)c2, "revealPercentage", new float[] { 1.0f, 0.0f }).setDuration((long)300).start();
                        n2 = n;
                    }
                    break Label_0341;
                }
                else {
                    this.b();
                }
            }
            n2 = 0;
        }
        if (n2 == 0 && b) {
            ((mwb)this).t.setAlpha(255);
            this.i.a();
        }
        else if (n2 == 0) {
            ((Activity)this.a).finish();
            this.b();
        }
    }
}
