import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zqp extends ym1
{
    public final tl6 z;
    
    public zqp(final sdg sdg, final kve kve) {
        super(sdg, kve);
        (this.z = new tl6(sdg, (ym1)this, new wqp("__container", kve.a, false))).b((List)Collections.emptyList(), (List)Collections.emptyList());
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        this.z.c(rectF, super.m, b);
    }
    
    @Override
    public final void j(final Canvas canvas, final Matrix matrix, final int n) {
        this.z.g(canvas, matrix, n);
    }
    
    @Override
    public final void o(final oqe oqe, final int n, final List<oqe> list, final oqe oqe2) {
        this.z.f(oqe, n, (List)list, oqe2);
    }
}
