// 
// Decompiled by Procyon v0.6.0
// 

public final class oq9
{
    public static final t87 a;
    public static final oq9$a b;
    
    static {
        if (Float.isNaN(0.25f) || Float.isNaN(0.1f) || Float.isNaN(0.25f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.25f, ", ", 0.1f, ", "), 0.25f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(0.58f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.0f, ", ", 0.0f, ", "), 0.58f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.42f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.42f, ", ", 0.0f, ", "), 1.0f, ", ", 1.0f, '.').toString());
        }
        a = new t87(0.42f, 0.0f, 0.58f);
        if (Float.isNaN(0.12f) || Float.isNaN(0.0f) || Float.isNaN(0.39f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.12f, ", ", 0.0f, ", "), 0.39f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.61f) || Float.isNaN(1.0f) || Float.isNaN(0.88f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.61f, ", ", 1.0f, ", "), 0.88f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.37f) || Float.isNaN(0.0f) || Float.isNaN(0.63f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.37f, ", ", 0.0f, ", "), 0.63f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.32f) || Float.isNaN(0.0f) || Float.isNaN(0.67f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.32f, ", ", 0.0f, ", "), 0.67f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.33f) || Float.isNaN(1.0f) || Float.isNaN(0.68f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.33f, ", ", 1.0f, ", "), 0.68f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.65f) || Float.isNaN(0.0f) || Float.isNaN(0.35f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.65f, ", ", 0.0f, ", "), 0.35f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.64f) || Float.isNaN(0.0f) || Float.isNaN(0.78f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.64f, ", ", 0.0f, ", "), 0.78f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.22f) || Float.isNaN(1.0f) || Float.isNaN(0.36f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.22f, ", ", 1.0f, ", "), 0.36f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.83f) || Float.isNaN(0.0f) || Float.isNaN(0.17f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.83f, ", ", 0.0f, ", "), 0.17f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.55f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(0.45f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.55f, ", ", 0.0f, ", "), 1.0f, ", ", 0.45f, '.').toString());
        }
        if (Float.isNaN(0.0f) || Float.isNaN(0.55f) || Float.isNaN(0.45f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.0f, ", ", 0.55f, ", "), 0.45f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.85f) || Float.isNaN(0.0f) || Float.isNaN(0.15f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.85f, ", ", 0.0f, ", "), 0.15f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.11f) || Float.isNaN(0.0f) || Float.isNaN(0.5f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.11f, ", ", 0.0f, ", "), 0.5f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.5f) || Float.isNaN(1.0f) || Float.isNaN(0.89f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.5f, ", ", 1.0f, ", "), 0.89f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.45f) || Float.isNaN(0.0f) || Float.isNaN(0.55f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.45f, ", ", 0.0f, ", "), 0.55f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.5f) || Float.isNaN(0.0f) || Float.isNaN(0.75f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.5f, ", ", 0.0f, ", "), 0.75f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.25f) || Float.isNaN(1.0f) || Float.isNaN(0.5f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.25f, ", ", 1.0f, ", "), 0.5f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.76f) || Float.isNaN(0.0f) || Float.isNaN(0.24f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.76f, ", ", 0.0f, ", "), 0.24f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.7f) || Float.isNaN(0.0f) || Float.isNaN(0.84f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.7f, ", ", 0.0f, ", "), 0.84f, ", ", 0.0f, '.').toString());
        }
        if (Float.isNaN(0.16f) || Float.isNaN(1.0f) || Float.isNaN(0.3f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.16f, ", ", 1.0f, ", "), 0.3f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.87f) || Float.isNaN(0.0f) || Float.isNaN(0.13f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.87f, ", ", 0.0f, ", "), 0.13f, ", ", 1.0f, '.').toString());
        }
        if (Float.isNaN(0.36f) || Float.isNaN(0.0f) || Float.isNaN(0.66f) || Float.isNaN(-0.56f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.36f, ", ", 0.0f, ", "), 0.66f, ", ", -0.56f, '.').toString());
        }
        if (Float.isNaN(0.34f) || Float.isNaN(1.56f) || Float.isNaN(0.64f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.34f, ", ", 1.56f, ", "), 0.64f, ", ", 1.0f, '.').toString());
        }
        if (!Float.isNaN(0.68f) && !Float.isNaN(-0.6f) && !Float.isNaN(0.32f) && !Float.isNaN(1.6f)) {
            b = oq9$a.a;
            return;
        }
        throw new IllegalArgumentException(go0.D(lr0.z("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", 0.68f, ", ", -0.6f, ", "), 0.32f, ", ", 1.6f, '.').toString());
    }
}
