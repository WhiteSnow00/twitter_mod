import java.util.Iterator;
import androidx.core.graphics.drawable.IconCompat;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9h extends fgr
{
    public final bti c;
    public final List<bti> d;
    public final Bitmap e;
    public final Bitmap f;
    
    public n9h(final bti c, final List<bti> d, final Bitmap e, final Bitmap f) {
        super(c);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final List<Long> d() {
        return ojf.v((Object)super.b.c());
    }
    
    public final int f() {
        return eg8.H("MESSAGE");
    }
    
    public final lri g(final Context context) {
        final vbk.c c = new vbk.c();
        c.d = super.b.B.getStringId();
        c.a = super.b.d();
        final Bitmap e = this.e;
        if (e != null) {
            c.b = IconCompat.c(e);
        }
        final kri kri = new kri(new vbk(c));
        kri.h = this.c.d;
        for (final bti bti : this.d) {
            final vbk.c c2 = new vbk.c();
            c2.f = true;
            c2.d = String.valueOf(bti.e());
            c2.a = bti.i;
            final Bitmap f = this.f;
            if (f != null) {
                c2.b = IconCompat.c(f);
            }
            kri.e.add(new kri$a((CharSequence)bti.e, new vbk(c2)));
            if (kri.e.size() > 25) {
                kri.e.remove(0);
            }
        }
        if (this.c.w == 274) {
            kri.i = Boolean.TRUE;
        }
        return kri;
    }
}
