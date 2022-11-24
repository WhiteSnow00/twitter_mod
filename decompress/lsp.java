import java.util.List;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsp extends ym1
{
    public final fm6 z;
    
    public lsp(final ceg ceg, final tve tve) {
        super(ceg, tve);
        (this.z = new fm6(ceg, this, new isp("__container", tve.a, false))).b(Collections.emptyList(), Collections.emptyList());
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
    public final void o(final xqe xqe, final int n, final List<xqe> list, final xqe xqe2) {
        this.z.f(xqe, n, list, xqe2);
    }
}
