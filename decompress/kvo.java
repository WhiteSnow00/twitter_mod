import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvo extends ase<nvo>
{
    public final nvo i;
    
    public kvo(final List<zre<nvo>> list) {
        super((List)list);
        this.i = new nvo();
    }
    
    public final Object g(final zre zre, float d) {
        final T b = zre.b;
        if (b != null) {
            final T c = zre.c;
            if (c != null) {
                final nvo nvo = (nvo)b;
                final nvo nvo2 = (nvo)c;
                final seg e = ((wm1)this).e;
                if (e != null) {
                    zre.h.floatValue();
                    ((wm1)this).e();
                    final nvo i = (nvo)e.d(nvo, nvo2);
                    if (i != null) {
                        return i;
                    }
                }
                final nvo i = this.i;
                final float a = nvo.a;
                final float a2 = nvo2.a;
                final PointF a3 = bch.a;
                final float d2 = va.d(a2, a, d, a);
                final float b2 = nvo.b;
                d = va.d(nvo2.b, b2, d, b2);
                i.a = d2;
                i.b = d;
                return i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
