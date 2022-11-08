import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iux extends as4
{
    public iux() {
        Objects.requireNonNull(vr4.Companion);
        final vr4$a companion = vr4.Companion;
        super("Generic XYZ", vr4.b, 14);
    }
    
    @Override
    public final float[] a(final float[] array) {
        zzd.f((Object)array, "v");
        array[0] = this.f(array[0]);
        array[1] = this.f(array[1]);
        array[2] = this.f(array[2]);
        return array;
    }
    
    @Override
    public final float b(final int n) {
        return 2.0f;
    }
    
    @Override
    public final float c(final int n) {
        return -2.0f;
    }
    
    @Override
    public final float[] e(final float[] array) {
        array[0] = this.f(array[0]);
        array[1] = this.f(array[1]);
        array[2] = this.f(array[2]);
        return array;
    }
    
    public final float f(final float n) {
        return pf8.u(n, -2.0f, 2.0f);
    }
}
