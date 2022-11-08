import java.util.Iterator;
import androidx.core.graphics.drawable.IconCompat;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8h extends oer
{
    public final jsi c;
    public final List<jsi> d;
    public final Bitmap e;
    public final Bitmap f;
    
    public u8h(final jsi c, final List<jsi> d, final Bitmap e, final Bitmap f) {
        super(c);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final List<Long> d() {
        return ijf.v((Object)super.b.c());
    }
    
    public final int f() {
        return zi8.x("MESSAGE");
    }
    
    public final rqi g(final Context context) {
        final cbk$c cbk$c = new cbk$c();
        cbk$c.d = super.b.B.getStringId();
        cbk$c.a = super.b.d();
        final Bitmap e = this.e;
        if (e != null) {
            cbk$c.b = IconCompat.c(e);
        }
        final qqi qqi = new qqi(new cbk(cbk$c));
        qqi.h = this.c.d;
        for (final jsi jsi : this.d) {
            final cbk$c cbk$c2 = new cbk$c();
            cbk$c2.f = true;
            cbk$c2.d = String.valueOf(jsi.e());
            cbk$c2.a = jsi.i;
            final Bitmap f = this.f;
            if (f != null) {
                cbk$c2.b = IconCompat.c(f);
            }
            qqi.e.add(new qqi$a((CharSequence)jsi.e, new cbk(cbk$c2)));
            if (qqi.e.size() > 25) {
                qqi.e.remove(0);
            }
        }
        if (this.c.w == 274) {
            qqi.i = Boolean.TRUE;
        }
        return (rqi)qqi;
    }
}
