import com.google.android.material.slider.Slider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxk extends ste implements qsb<nc2$d, fzv>
{
    public final byk D0;
    
    public zxk(final byk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nc2$d nc2$d = (nc2$d)o;
        czd.f((Object)nc2$d, "$this$distinct");
        final adg a = nc2$d.a;
        float valueTo;
        if ((valueTo = (float)Math.ceil(a.l - a.k) - 1) < 1.0f) {
            valueTo = 1.0f;
        }
        final Slider d0 = this.D0.D0;
        float value;
        if ((value = (float)nc2$d.b) > valueTo) {
            value = valueTo;
        }
        d0.setValue(value);
        this.D0.D0.setValueTo(valueTo);
        return fzv.a;
    }
}
