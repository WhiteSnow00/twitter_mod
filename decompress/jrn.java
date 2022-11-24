import com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$d0;
import java.util.List;
import com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrn extends pue implements stb<krn, krn>
{
    public final RoomManageSpeakersViewModel F0;
    public final krn G0;
    
    public jrn(final RoomManageSpeakersViewModel f0, final krn g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final krn krn = (krn)o;
        e0e.f((Object)krn, "$this$setState");
        final RoomManageSpeakersViewModel f0 = this.F0;
        final krn g0 = this.G0;
        final List d = g0.d;
        final List g2 = g0.g;
        final boolean b = g0.k == mrn.G0;
        final int n = g0.n;
        final RoomManageSpeakersViewModel$d0 companion = RoomManageSpeakersViewModel.Companion;
        return krn.l(krn, false, f0.Y(d, g2, b, n), (List)null, (List)null, (List)null, (List)null, 0, (String)null, (h9s)null, (mrn)null, false, 0, 0, (Boolean)null, 32763);
    }
}
