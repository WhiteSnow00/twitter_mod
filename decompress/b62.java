import android.content.Context;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b62 extends ste implements qsb<c62, fzv>
{
    public final z52 D0;
    
    public b62(final z52 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final c62 c62 = (c62)o;
        czd.f((Object)c62, "$this$distinct");
        final View i0 = this.D0.I0;
        int visibility;
        if (c62.a instanceof f62$d$f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        i0.setVisibility(visibility);
        final z52 d0 = this.D0;
        final f62$d a = c62.a;
        Objects.requireNonNull(d0);
        CharSequence e;
        if (a instanceof f62$d$f) {
            e = d0.a();
        }
        else if (a instanceof f62$d$g) {
            final u42 e2 = d0.G0.e(((f62$d$g)a).b);
            if (e2 == null || (e = e2.b) == null) {
                e = ((Context)d0.E0).getString(2131951942);
                czd.e((Object)e, "activity.getString(R.string.all_bookmarks)");
            }
        }
        else if (a instanceof f62$d$b) {
            e = ((Context)d0.E0).getString(2131952932);
            czd.e((Object)e, "activity.getString(R.string.create_folder)");
        }
        else if (a instanceof f62$d$d) {
            e = ((Context)d0.E0).getString(2131953713);
            czd.e((Object)e, "activity.getString(R.string.edit_folder)");
        }
        else {
            e = d0.a();
        }
        final f52 f0 = d0.F0;
        Objects.requireNonNull(f0);
        czd.f((Object)e, "title");
        f0.e = e;
        f0.c.onNext((Object)e);
        return fzv.a;
    }
}
