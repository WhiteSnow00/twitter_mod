import android.graphics.Matrix;
import android.widget.ImageView;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y6d extends Property<ImageView, Matrix>
{
    public final Matrix a;
    
    public y6d() {
        super((Class)Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }
    
    public final Object get(final Object o) {
        this.a.set(((ImageView)o).getImageMatrix());
        return this.a;
    }
    
    public final void set(final Object o, final Object o2) {
        ((ImageView)o).setImageMatrix((Matrix)o2);
    }
}
