import android.widget.TextView;
import java.util.Locale;
import android.widget.Button;
import android.view.View;
import com.twitter.ui.components.button.legacy.TwitterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b6m implements a6m
{
    public final TwitterButton a;
    public final int b;
    public final int c;
    public final int d;
    public final e9b<Float> e;
    public final w19 f;
    
    public b6m(final TwitterButton a, final krm krm, final gwo gwo) {
        this.a = a;
        this.b = krm.g(2131099703);
        this.c = krm.g(2131100880);
        this.d = krm.g(2131099845);
        this.f = new w19();
        this.e = new iab(ec0.j(0.0f, 0.5f, gwo).concatWith((taj)ec0.j(0.5f, 0.0f, gwo)).toFlowable(eg1.D0));
    }
    
    @Override
    public final void a() {
        ec0.f((View)this.a);
    }
    
    @Override
    public final void b() {
        final TwitterButton a = this.a;
        final int b = this.b;
        rrz.L((Button)a, b, b);
        this.a.setTextColor(this.c);
        this.f.a();
    }
    
    @Override
    public final void c() {
        final TwitterButton a = this.a;
        final int d = this.d;
        rrz.L((Button)a, d, d);
        this.a.setTextColor(this.c);
        this.f.c(((e9b)this.e).g((lj6)new hoa(this, 20)));
    }
    
    @Override
    public final void d(final long n) {
        ((TextView)this.a).setText((CharSequence)String.format(Locale.US, "%d:%02d", n / 60L, n % 60L));
    }
    
    @Override
    public final void e() {
        final TwitterButton a = this.a;
        final int c = this.c;
        rrz.L((Button)a, c, c);
        this.a.setTextColor(this.d);
        rrz.M((Button)this.a);
    }
    
    @Override
    public final void show() {
        ec0.c((View)this.a);
    }
}
