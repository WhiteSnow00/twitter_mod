import android.widget.Space;
import com.twitter.media.ui.image.UserImageView;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uji implements okx
{
    public final u3s C0;
    public final u3s D0;
    public final u3s E0;
    public final mhh<yji> F0;
    
    public uji(final View view, final Activity activity) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)activity, "activity");
        this.C0 = (u3s)rp2.z0((otb)new uji$b(view));
        this.D0 = (u3s)rp2.z0((otb)new uji$c(view));
        this.E0 = (u3s)rp2.z0((otb)new uji$d(view));
        this.F0 = (mhh<yji>)ajy.a0((rtb)new uji$e(this, activity));
    }
    
    public final void T(final oax oax) {
        final yji yji = (yji)oax;
        zzd.f((Object)yji, "state");
        this.F0.b((Object)yji);
    }
    
    public final UserImageView a() {
        final Object value = this.C0.getValue();
        zzd.e(value, "<get-creatorHostImage>(...)");
        return (UserImageView)value;
    }
    
    public final Space b() {
        final Object value = this.E0.getValue();
        zzd.e(value, "<get-overlapSpace>(...)");
        return (Space)value;
    }
}
