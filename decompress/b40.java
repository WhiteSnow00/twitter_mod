import android.content.Context;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
public final class b40 extends xzr implements gub<yy6, ap6<? super Typeface>, Object>
{
    public final /* synthetic */ lqm C0;
    public final /* synthetic */ Context D0;
    
    public b40(final lqm c0, final Context d0, final ap6<? super b40> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b40(this.C0, this.D0, (ap6<? super b40>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((b40)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        return kq9.B0(this.C0, this.D0);
    }
}
