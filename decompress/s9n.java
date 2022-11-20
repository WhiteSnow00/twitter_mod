import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s9n extends ste implements qsb<nan, fzv>
{
    public final d9n D0;
    
    public s9n(final d9n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nan nan = (nan)o;
        czd.f((Object)nan, "$this$distinct");
        final Object value = this.D0.a1.getValue();
        czd.e(value, "<get-taggedTopicsTextView>(...)");
        io7.y((TypefacesTextView)value, nan.s, nan.v);
        return fzv.a;
    }
}
