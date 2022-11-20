import java.util.Objects;
import android.view.ViewStub;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ftr extends nk8 implements whc
{
    public static final a Companion;
    public final whc E0;
    
    static {
        Companion = new a();
    }
    
    public ftr(final LayoutInflater layoutInflater) {
        czd.f((Object)layoutInflater, "layoutInflater");
        final View inflate = layoutInflater.inflate(2131625095, (ViewGroup)null);
        czd.e((Object)inflate, "layoutInflater.inflate(R\u2026ainer_with_toolbar, null)");
        this(inflate);
    }
    
    public ftr(final View view) {
        final kdj e0 = new kdj(view);
        super(view);
        this.E0 = (whc)e0;
        final a companion = ftr.Companion;
        final ViewStub viewStub = (ViewStub)view.findViewById(2131428431);
        final int l0 = this.l0();
        Objects.requireNonNull(companion);
        if (viewStub != null && l0 != 0) {
            viewStub.setLayoutResource(l0);
            viewStub.inflate();
        }
    }
    
    public final void B(final cym cym, final cej cej) {
        czd.f((Object)cym, "richTextProcessor");
        this.E0.B(cym, cej);
    }
    
    public final void G() {
        this.E0.G();
    }
    
    public final void I(final CharSequence charSequence) {
        this.E0.I(charSequence);
    }
    
    public final void M() {
        this.E0.M();
    }
    
    public final void P(final CharSequence charSequence) {
        this.E0.P(charSequence);
    }
    
    public final void b(final cgv cgv) {
        this.E0.b(cgv);
    }
    
    public final View getHeldView() {
        final View d0 = super.D0;
        czd.e((Object)d0, "super.getHeldView()");
        return d0;
    }
    
    public abstract int l0();
    
    public final void q(final cym cym, final cej cej) {
        czd.f((Object)cym, "richTextProcessor");
        this.E0.q(cym, cej);
    }
    
    public static final class a
    {
    }
}
