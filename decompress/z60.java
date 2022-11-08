import android.view.ActionMode$Callback;
import android.os.Build$VERSION;
import java.util.Objects;
import android.view.ActionMode;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z60 implements ajs
{
    public final View a;
    public ActionMode b;
    public final qds c;
    public int d;
    
    public z60(final View a) {
        zzd.f((Object)a, "view");
        this.a = a;
        this.c = new qds((otb)new otb<oyv>() {
            public final /* synthetic */ z60 C0;
            
            public final Object invoke() {
                this.C0.b = null;
                return oyv.a;
            }
        });
        this.d = 2;
    }
    
    public final void a(final n5m b, final otb<oyv> c, final otb<oyv> d, final otb<oyv> e, final otb<oyv> f) {
        final qds c2 = this.c;
        Objects.requireNonNull(c2);
        c2.b = b;
        final qds c3 = this.c;
        c3.c = c;
        c3.e = e;
        c3.d = d;
        c3.f = f;
        final ActionMode b2 = this.b;
        if (b2 == null) {
            this.d = 1;
            ActionMode b3;
            if (Build$VERSION.SDK_INT >= 23) {
                b3 = bjs.a.b(this.a, (ActionMode$Callback)new e8b(this.c), 1);
            }
            else {
                b3 = this.a.startActionMode((ActionMode$Callback)new qyk(c3));
            }
            this.b = b3;
        }
        else {
            b2.invalidate();
        }
    }
    
    public final void b() {
        this.d = 2;
        final ActionMode b = this.b;
        if (b != null) {
            b.finish();
        }
        this.b = null;
    }
    
    public final int c() {
        return this.d;
    }
}
