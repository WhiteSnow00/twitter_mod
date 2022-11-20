import android.view.View$OnClickListener;
import java.util.List;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jg8 implements j2a
{
    public final epe a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final Button f;
    public final HorizonComposeButton g;
    
    public jg8(View viewById, final epe a) {
        if (viewById != null) {
            viewById = viewById.findViewById(2131429772);
        }
        else {
            viewById = null;
        }
        this.b = viewById;
        this.a = a;
        if (viewById != null) {
            this.c = (TextView)viewById.findViewById(2131428938);
            this.d = (TextView)viewById.findViewById(2131428921);
            final Button button = (Button)viewById.findViewById(2131428918);
            final Button button2 = (Button)viewById.findViewById(2131428915);
            Button e;
            if ((e = button) == null) {
                e = button2;
            }
            this.e = e;
            this.f = (Button)viewById.findViewById(2131428917);
            this.g = (HorizonComposeButton)viewById.findViewById(2131428916);
        }
        else {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }
    
    public final void a() {
        final View b = this.b;
        if (b != null) {
            b.setVisibility(8);
        }
    }
    
    public final void b(final List<hbv> list) {
        if (this.g != null) {
            wk0.b().t();
        }
    }
    
    public final void c(final tes tes) {
        final Button e = this.e;
        if (e != null) {
            ((View)e).setVisibility(0);
        }
        final Button f = this.f;
        if (f != null) {
            ((View)f).setVisibility(8);
        }
        this.a.b0((TextView)this.e, tes);
    }
    
    public final void d(final tes tes) {
        final Button f = this.f;
        if (f != null) {
            ((View)f).setVisibility(0);
        }
        final Button e = this.e;
        if (e != null) {
            ((View)e).setVisibility(8);
        }
        this.a.b0((TextView)this.f, tes);
    }
    
    public final void e(final View$OnClickListener view$OnClickListener) {
        final Button e = this.e;
        if (e != null) {
            ((View)e).setOnClickListener(view$OnClickListener);
        }
        final Button f = this.f;
        if (f != null) {
            ((View)f).setOnClickListener(view$OnClickListener);
        }
    }
    
    public final void f(final tes tes) {
        this.a.b0(this.c, tes);
    }
    
    public final void g(final tes tes) {
        this.a.b0(this.d, tes);
    }
    
    public final void show() {
        final View b = this.b;
        if (b != null) {
            b.setVisibility(0);
        }
    }
}
