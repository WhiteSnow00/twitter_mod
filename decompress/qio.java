import com.twitter.rooms.model.helpers.RoomUserItem;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qio extends ste implements qsb<lvj<? extends View, ? extends Long>, Boolean>
{
    public final vio D0;
    public final RoomUserItem E0;
    
    public qio(final vio d0, final RoomUserItem e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final lvj lvj = (lvj)o;
        czd.f((Object)lvj, "it");
        return czd.a((Object)this.D0.D0.getParent(), lvj.D0) && this.E0.getTwitterUserIdLong() == ((Number)lvj.E0).longValue();
    }
}
