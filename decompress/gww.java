import android.view.View$OnClickListener;
import android.text.TextUtils;
import java.util.Objects;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gww
{
    public final Context a;
    public final qww b;
    public final View c;
    
    public gww(final Context a, final View c, final qww b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public abstract mrg a(final ebh p0, final vo6 p1, final i1 p2);
    
    public void b(final u4 u4) {
        final qww b = this.b;
        if (b != null) {
            final cf4 f = b.f;
            Objects.requireNonNull(f);
            (f.i = u4.e).g((e2)new xxg((xxg$a)new on3((Object)f, 7)));
        }
    }
    
    public final void c(final String s) {
        final qww b = this.b;
        if (b != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                b.c().G((fk6)new kww((Object)b, (Object)s, 0), (fk6)jvb.e);
            }
        }
    }
    
    public final void d(final String s) {
        final qww b = this.b;
        if (b != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                b.c().G((fk6)new lww((Object)b, (Object)s, 0), (fk6)jvb.e);
            }
        }
    }
    
    public final void e(final ebh ebh) {
        final qww b = this.b;
        if (b != null && (ebh != null && ebh.a != -1L)) {
            if (!pjr.e((CharSequence)ebh.b)) {
                b.c().G((fk6)new n92((Object)b, (Object)ebh, 1), (fk6)jvb.e);
            }
        }
    }
    
    public final void f(final View$OnClickListener j) {
        final qww b = this.b;
        if (b != null) {
            b.j = j;
        }
    }
    
    public abstract void g(final long p0);
}
