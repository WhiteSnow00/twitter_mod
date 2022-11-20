import android.view.View$OnClickListener;
import android.text.TextUtils;
import java.util.Objects;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class axw
{
    public final Context a;
    public final kxw b;
    public final View c;
    
    public axw(final Context a, final View c, final kxw b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public abstract mrg a(final gbh p0, final bo6 p1, final i1 p2);
    
    public void b(final w4 w4) {
        final kxw b = this.b;
        if (b != null) {
            final ee4 f = b.f;
            Objects.requireNonNull(f);
            (f.i = w4.e).g((f2)new xxg((xxg$a)new wm3((Object)f, 7)));
        }
    }
    
    public final void c(final String s) {
        final kxw b = this.b;
        if (b != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                b.c().G((lj6)new fxw((Object)b, (Object)s, 0), (lj6)jub.e);
            }
        }
    }
    
    public final void d(final String s) {
        final kxw b = this.b;
        if (b != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                b.c().G((lj6)new exw((Object)b, (Object)s, 0), (lj6)jub.e);
            }
        }
    }
    
    public final void e(final gbh gbh) {
        final kxw b = this.b;
        if (b != null && (gbh != null && gbh.a != -1L)) {
            if (!ikr.e((CharSequence)gbh.b)) {
                b.c().G((lj6)new f92((Object)b, (Object)gbh, 1), (lj6)jub.e);
            }
        }
    }
    
    public final void f(final View$OnClickListener j) {
        final kxw b = this.b;
        if (b != null) {
            b.j = j;
        }
    }
    
    public abstract void g(final long p0);
}
