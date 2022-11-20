import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c80 extends Animatable2$AnimationCallback
{
    public final d80 a;
    
    public c80(final d80 a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Drawable drawable) {
        this.a.a();
    }
    
    public final void onAnimationStart(final Drawable drawable) {
        Objects.requireNonNull(this.a);
    }
}
