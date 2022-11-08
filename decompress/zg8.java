import android.view.View$OnClickListener;
import java.util.List;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zg8 implements z2a
{
    public final zng a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final Button f;
    public final HorizonComposeButton g;
    
    public zg8(View viewById, final zng a) {
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
    
    public final void a(final List<mav> list) {
        if (this.g != null) {
            bl0.a().t();
        }
    }
    
    public final void b() {
        final View b = this.b;
        if (b != null) {
            b.setVisibility(8);
        }
    }
    
    public final void c(final yds yds) {
        final Button e = this.e;
        if (e != null) {
            ((View)e).setVisibility(0);
        }
        final Button f = this.f;
        if (f != null) {
            ((View)f).setVisibility(8);
        }
        this.a.e((TextView)this.e, yds);
    }
    
    public final void d(final yds yds) {
        final Button f = this.f;
        if (f != null) {
            ((View)f).setVisibility(0);
        }
        final Button e = this.e;
        if (e != null) {
            ((View)e).setVisibility(8);
        }
        this.a.e((TextView)this.f, yds);
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
    
    public final void f(final yds yds) {
        this.a.e(this.c, yds);
    }
    
    public final void g(final yds yds) {
        this.a.e(this.d, yds);
    }
    
    public final void show() {
        final View b = this.b;
        if (b != null) {
            b.setVisibility(0);
        }
    }
}
