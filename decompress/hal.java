import android.view.ViewGroup;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import com.twitter.profiles.scrollingheader.c$c;
import android.view.View;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.app.Activity;
import android.content.Context;
import com.twitter.profiles.scrollingheader.c$d;
import android.view.ViewStub$OnInflateListener;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hal extends idv<Cursor> implements ViewStub$OnInflateListener, c$d
{
    public final qgv e1;
    public final fym<kgs> f1;
    public final g5p g1;
    
    public hal(final hdv hdv, final Context context) {
        super(hdv);
        this.g1 = g5p.d((Activity)super.F0, super.a1, ((BaseBundle)((Fragment)super.G0).L0).getInt("fragment_page_number"));
        final Bundle l0 = ((Fragment)super.G0).L0;
        if (l0 != null) {
            this.e1 = (qgv)gmp.a(l0.getByteArray("user"), (nmp)qgv.P1);
            this.f1 = (fym<kgs>)gmp.a(l0.getByteArray("userUnavailableMessage"), (nmp)fym.I0);
        }
        else {
            this.e1 = null;
            this.f1 = null;
        }
        final udv a1 = super.a1;
        final View j0 = a1.R0.J0;
        if (j0 != null) {
            if (j0 instanceof ScrollView) {
                final ScrollView scrollView = (ScrollView)j0;
                ((View)scrollView).setFocusableInTouchMode(true);
                ((ViewGroup)scrollView).setDescendantFocusability(131072);
            }
            final ViewStub viewStub = (ViewStub)j0.findViewById(2131428920);
            if (viewStub != null) {
                viewStub.setLayoutResource(this.e1());
                viewStub.setOnInflateListener((ViewStub$OnInflateListener)this);
                viewStub.inflate();
            }
        }
        a1.R0.b(true);
        final int h0 = z3e.H0;
        a1.S1((sz5)new y3e(context));
    }
    
    public final void M0() {
        super.M0();
        final g5p g1 = this.g1;
        if (g1 != null) {
            g1.e();
        }
    }
    
    public final void O0(final p4e<Cursor> p4e) {
        super.O0((p4e)p4e);
        final g5p g1 = this.g1;
        if (g1 != null) {
            g1.e();
        }
    }
    
    public final c$c Q() {
        return (c$c)this.g1;
    }
    
    public int d1() {
        return 2131625222;
    }
    
    public abstract int e1();
    
    public udv$b l0(final udv$b udv$b) {
        udv$b.a = "profile_empty";
        udv$b.b.a(this.d1());
        udv$b.g = 2131624572;
        return udv$b;
    }
}
