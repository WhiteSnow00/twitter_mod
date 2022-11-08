import java.util.List;
import java.util.Objects;
import com.twitter.rooms.ui.core.history.RoomHistoryManagementViewModel;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmn extends gue implements rtb<umn, umn>
{
    public final /* synthetic */ ArrayList<mlc$b> C0;
    public final /* synthetic */ s57 D0;
    
    public kmn(final ArrayList<mlc$b> c0, final s57 d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final umn umn = (umn)o;
        zzd.f((Object)umn, "$this$setState");
        final List m2 = or4.m2((Iterable)this.C0);
        final RoomHistoryManagementViewModel.RoomHistoryManagementViewModel$b companion = RoomHistoryManagementViewModel.Companion;
        final s57 d0 = this.D0;
        Objects.requireNonNull(companion);
        String a = d0.a;
        Object o2 = null;
        if (a == null || !pjr.g((CharSequence)a)) {
            a = null;
        }
        if (a != null) {
            o2 = new mlc$d(a);
        }
        return umn.l(umn, m2, (mlc)o2, 3);
    }
}
