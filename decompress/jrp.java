import java.util.Collection;
import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrp
{
    public final List<p77> a;
    public PointF b;
    public boolean c;
    
    public jrp() {
        this.a = new ArrayList();
    }
    
    public jrp(final PointF b, final boolean c, final List<p77> list) {
        this.b = b;
        this.c = c;
        this.a = new ArrayList((Collection<? extends E>)list);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("ShapeData{numCurves=");
        j.append(this.a.size());
        j.append("closed=");
        return zc.H(j, this.c, '}');
    }
}
