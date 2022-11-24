import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7b implements TypeEvaluator<Float>
{
    public FloatEvaluator a;
    
    public w7b() {
        this.a = new FloatEvaluator();
    }
    
    public final Object evaluate(float floatValue, final Object o, final Object o2) {
        if ((floatValue = this.a.evaluate(floatValue, (Number)o, (Number)o2)) < 0.1f) {
            floatValue = 0.0f;
        }
        return floatValue;
    }
}
