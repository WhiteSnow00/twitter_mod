import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcm implements vy6
{
    public final float a;
    
    public bcm(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final RectF rectF) {
        return rectF.height() * this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof bcm)) {
            return false;
        }
        if (this.a != ((bcm)o).a) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
