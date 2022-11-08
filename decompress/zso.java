import android.os.Parcelable;
import com.twitter.weaver.mvi.MviViewModel;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zso extends jt2
{
    public final /* synthetic */ rtb<Bundle, oyv> C0;
    public final /* synthetic */ gub<oax, Bundle, oyv> D0;
    public final /* synthetic */ MviViewModel<Object, ?, ?> E0;
    
    public zso(final rtb<? super Bundle, oyv> c0, final gub<oax, ? super Bundle, oyv> d0, final MviViewModel<Object, ?, ?> e0) {
        this.C0 = (rtb<Bundle, oyv>)c0;
        this.D0 = (gub<oax, Bundle, oyv>)d0;
        this.E0 = e0;
    }
    
    public final void a(final Bundle bundle) {
        this.D0.invoke((Object)this.E0.S(), (Object)bundle);
    }
    
    public final void v(final Parcelable parcelable) {
        this.C0.invoke((Object)parcelable);
    }
}
