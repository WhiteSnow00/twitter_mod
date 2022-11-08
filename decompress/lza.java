import java.util.Objects;
import com.twitter.profiles.filterbar.FilterBarComposeView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lza implements okx, ay9<bza>
{
    public final /* synthetic */ cza C0;
    public final mhh<pza> D0;
    
    public lza(final View view, final cza c0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "effectHandler");
        this.C0 = c0;
        final FilterBarComposeView filterBarComposeView = (FilterBarComposeView)view.findViewById(2131432048);
        this.D0 = (mhh<pza>)ajy.a0((rtb)lza$b.C0);
    }
    
    public final void T(final oax oax) {
        final pza pza = (pza)oax;
        zzd.f((Object)pza, "state");
        this.D0.b((Object)pza);
    }
    
    public final void s(final Object o) {
        final bza bza = (bza)o;
        zzd.f((Object)bza, "effect");
        final cza c0 = this.C0;
        Objects.requireNonNull(c0);
        if (bza instanceof bza$a) {
            c0.C0.G1(((bza$a)bza).a);
        }
    }
    
    public interface a
    {
        lza a(final View p0);
    }
}
