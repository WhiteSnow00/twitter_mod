import android.view.ActionMode$Callback;
import android.os.Build$VERSION;
import java.util.Objects;
import android.view.ActionMode;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b70 implements vjs
{
    public final View a;
    public ActionMode b;
    public final les c;
    public int d;
    
    public b70(final View a) {
        czd.f((Object)a, "view");
        this.a = a;
        this.c = new les((nsb)new b70$a(this));
        this.d = 2;
    }
    
    public final void a() {
        this.d = 2;
        final ActionMode b = this.b;
        if (b != null) {
            b.finish();
        }
        this.b = null;
    }
    
    public final void b(final c6m f, final nsb<fzv> b, final nsb<fzv> c, final nsb<fzv> d, final nsb<fzv> e) {
        final les c2 = this.c;
        Objects.requireNonNull(c2);
        c2.f = f;
        final les c3 = this.c;
        c3.b = b;
        c3.d = d;
        c3.c = c;
        c3.e = e;
        final ActionMode b2 = this.b;
        if (b2 == null) {
            this.d = 1;
            ActionMode b3;
            if (Build$VERSION.SDK_INT >= 23) {
                b3 = wjs.a.b(this.a, (ActionMode$Callback)new b7b(this.c), 1);
            }
            else {
                b3 = this.a.startActionMode((ActionMode$Callback)new yyk(c3));
            }
            this.b = b3;
        }
        else {
            b2.invalidate();
        }
    }
    
    public final int c() {
        return this.d;
    }
}
