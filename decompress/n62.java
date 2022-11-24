import android.content.Context;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n62 extends pue implements stb<o62, vzv>
{
    public final l62 F0;
    
    public n62(final l62 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final o62 o2 = (o62)o;
        e0e.f((Object)o2, "$this$distinct");
        final View k0 = this.F0.K0;
        int visibility;
        if (o2.a instanceof r62$d.f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        k0.setVisibility(visibility);
        final l62 f0 = this.F0;
        final r62$d a = o2.a;
        Objects.requireNonNull(f0);
        CharSequence e;
        if (a instanceof r62$d.f) {
            e = f0.a();
        }
        else if (a instanceof r62$d.g) {
            final f52 e2 = f0.I0.e(((r62$d.g)a).b);
            if (e2 == null || (e = e2.b) == null) {
                e = ((Context)f0.G0).getString(2131951942);
                e0e.e((Object)e, "activity.getString(R.string.all_bookmarks)");
            }
        }
        else if (a instanceof r62$d.b) {
            e = ((Context)f0.G0).getString(2131952932);
            e0e.e((Object)e, "activity.getString(R.string.create_folder)");
        }
        else if (a instanceof r62$d.d) {
            e = ((Context)f0.G0).getString(2131953713);
            e0e.e((Object)e, "activity.getString(R.string.edit_folder)");
        }
        else {
            e = f0.a();
        }
        final q52 h0 = f0.H0;
        Objects.requireNonNull(h0);
        e0e.f((Object)e, "title");
        h0.e = e;
        h0.c.onNext((Object)e);
        return vzv.a;
    }
}
