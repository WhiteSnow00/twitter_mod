import android.view.inputmethod.BaseInputConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjs extends pue implements ptb<BaseInputConnection>
{
    public final bjs F0;
    
    public cjs(final bjs f0) {
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        return new BaseInputConnection(this.F0.a, false);
    }
}
