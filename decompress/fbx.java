import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbx implements Interpolator
{
    public final /* synthetic */ bq9 a;
    
    public fbx(final bq9 a) {
        this.a = a;
    }
    
    public final float getInterpolation(final float n) {
        return (float)this.a.a((double)n);
    }
}
