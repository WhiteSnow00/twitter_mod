import android.os.Parcelable;
import com.twitter.weaver.mvi.MviViewModel;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qto extends bt2
{
    public final qsb<Bundle, fzv> D0;
    public final ftb<jbx, Bundle, fzv> E0;
    public final MviViewModel<Object, ?, ?> F0;
    
    public qto(final qsb<? super Bundle, fzv> d0, final ftb<jbx, ? super Bundle, fzv> e0, final MviViewModel<Object, ?, ?> f0) {
        this.D0 = (qsb<Bundle, fzv>)d0;
        this.E0 = (ftb<jbx, Bundle, fzv>)e0;
        this.F0 = f0;
    }
    
    @Override
    public final void a(final Bundle bundle) {
        this.E0.invoke((Object)this.F0.S(), (Object)bundle);
    }
    
    public final void v(final Parcelable parcelable) {
        this.D0.invoke((Object)parcelable);
    }
}
