import android.annotation.SuppressLint;
import android.widget.TextView;
import java.util.Objects;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a42 implements hcl, View$OnClickListener
{
    public final l42 C0;
    public final UserIdentifier D0;
    public final xfl E0;
    public final d42 F0;
    
    @SuppressLint({ "CheckResult" })
    public a42(final gob gob, final UserIdentifier d0, final jcl jcl, final View view, final xfl e0, final d42 f0) {
        this.D0 = d0;
        this.E0 = e0;
        final l42 c0 = new l42(view);
        this.C0 = c0;
        final xwm b = jcl.b;
        final xwm c2 = jcl.c;
        final de6 h0 = c0.H0;
        final TextView e2 = c0.E0;
        Objects.requireNonNull(h0);
        kxm$a.a(e2, b, (kxm)h0);
        final de6 h2 = c0.H0;
        final TextView f2 = c0.F0;
        Objects.requireNonNull(h2);
        kxm$a.a(f2, c2, (kxm)h2);
        ((View)c0.G0).setOnClickListener((View$OnClickListener)this);
        this.F0 = f0;
        final String i = bgl.i(e0.a);
        f0.c(this.e()).subscribe((fk6)new ky0((Object)this, (Object)new hqa(gob, d0, view, f0, i, this.e(), jcl.e), (Object)jcl, 3));
        f0.b(this.e(), jcl.d, e0.b, i);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final boolean b() {
        return this.F0.a(this.e()) != null;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        this.f("", "show");
    }
    
    public final String e() {
        return String.valueOf(this.E0.d());
    }
    
    public final void f(final String s, final String s2) {
        final zf4 zf4 = new zf4(this.D0, new String[] { bgl.i(this.E0.a), "bonus_follow_module", null, s, s2 });
        zf4.C = String.valueOf(this.E0.d());
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    @Override
    public final void j() {
        if (!this.F0.a(this.e()).isEmpty()) {
            final l42 c0 = this.C0;
            c0.D0.setVisibility(0);
            c0.I0.setVisibility(0);
        }
        else {
            final l42 c2 = this.C0;
            c2.D0.setVisibility(8);
            c2.I0.setVisibility(8);
        }
    }
    
    public final void onClick(final View view) {
        if (view.getId() == 2131428697) {
            this.f("dismiss", "click");
            final l42 c0 = this.C0;
            c0.D0.setVisibility(8);
            c0.I0.setVisibility(8);
        }
    }
}
