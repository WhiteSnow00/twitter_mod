import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.content.res.Resources;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.topicselector.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glt implements s3e<flt>
{
    public final hlt D0;
    public final b E0;
    public final dej F0;
    public final w19 G0;
    public final OcfEventReporter H0;
    public final View$OnClickListener I0;
    
    public glt(final hlt d0, final b e0, final dej f0, final View$OnClickListener i0, final OcfEventReporter h0) {
        this.G0 = new w19();
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.I0 = i0;
        this.H0 = h0;
    }
    
    public final View getItemView() {
        return this.D0.Y0;
    }
    
    public final void q(final Object o) {
        final flt flt = (flt)o;
        final dlt a = flt.a;
        final String a2 = a.a;
        final hlt d0 = this.D0;
        this.F0.a((TextView)d0.X0, (oxm)a.b);
        final int b = flt.b;
        final Resources resources = d0.Y0.getResources();
        if (b == 1) {
            ((TypefacesTextView)d0.X0).setTextSize(2, resources.getDimension(2131165840) / resources.getDisplayMetrics().density);
        }
        else if (b >= 2) {
            ((TypefacesTextView)d0.X0).setTextSize(2, resources.getDimension(2131165839) / resources.getDisplayMetrics().density);
        }
        d0.X0.setChecked(flt.c);
        this.D0.X0.setOnClickListener((View$OnClickListener)new avg((Object)this, (Object)a2, (Object)flt, 3));
        this.G0.c(((h5j)this.E0.h).subscribe((lj6)new ae3((Object)this, (Object)flt, 7)));
    }
    
    public final void unbind() {
        this.G0.a();
    }
}
