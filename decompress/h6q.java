import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h6q extends b4e<f6q, i6q>
{
    public final g6q d;
    public final OcfEventReporter e;
    public final int f;
    public final String g;
    
    public h6q(final g6q d, final OcfEventReporter e, final int f, final String g) {
        super((Class)f6q.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @SuppressLint({ "CheckResult" })
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final i6q i6q = (i6q)n8x;
        final f6q f6q = (f6q)o;
        final String c = f6q.a.c;
        vmw.g((Object)c);
        i6q.G0.setText((CharSequence)c);
        int paintFlags;
        if (f6q.b) {
            paintFlags = (i6q.G0.getPaintFlags() | 0x8);
        }
        else {
            paintFlags = (i6q.G0.getPaintFlags() & 0xFFFFFFF7);
        }
        i6q.G0.setPaintFlags(paintFlags);
        too.e(((sl8)i6q).F0).subscribe((rk6)new vtk((Object)this, (Object)f6q, 4));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new i6q(LayoutInflater.from(((View)viewGroup).getContext()).inflate(this.f, viewGroup, false));
    }
}
